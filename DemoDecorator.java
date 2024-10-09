/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ex01.decorator;

/**
 *
 * @author rafaelamoreira
 */
public class DemoDecorator {

    public static void main(String[] args) {
        Component basico = new ConcreteComponent();
        System.out.println("Componente Básico: " + basico.operacao());

        // Decorando o componente básico com o ConcreteDecoratorA
        Component decoratorA = new ConcreteDecoratorA(basico);
        System.out.println("Decorator A: " + decoratorA.operacao());

        // Decorando o componente decorado com ConcreteDecoratorB
        Component decoratorB = new ConcreteDecoratorB(decoratorA);
        System.out.println("Decorator B: " + decoratorB.operacao());
    }
}
