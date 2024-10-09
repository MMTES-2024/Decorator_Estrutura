/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.decorator;

/**
 *
 * @author rafaelamoreira
 */
public class Decorator implements Component{
    protected Component wrappee;
    public Decorator(Component component){
        this.wrappee = component;
    }
    @Override
    public String operacao() {
        return wrappee.operacao();
    }
    
}
