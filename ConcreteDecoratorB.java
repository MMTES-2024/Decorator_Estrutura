/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.decorator;

/**
 *
 * @author rafaelamoreira
 */
public class ConcreteDecoratorB extends Decorator{
    
    public ConcreteDecoratorB(Component component) {
        super(component);
    }
    @Override
    public String operacao() {
        return "Decorador Concreto B("+super.operacao()+")";
    }
}
