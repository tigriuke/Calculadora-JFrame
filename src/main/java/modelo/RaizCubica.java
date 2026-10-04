/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author coffe
 */
public class RaizCubica extends Operacion{
    
    public RaizCubica(double a, double b) {
        b = 3;
        super(a, b);     
    }
    
    public double resultado(){
        return Math.pow(a, b);
    }
    
    @Override
    public boolean validacion(){
        return a < 0? false: true;
    }
}
