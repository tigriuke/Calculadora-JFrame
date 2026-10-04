/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author coffe
 */
public class LogaritmoNatural extends Operacion{
    
    public LogaritmoNatural(double a, double b) {
        b = 0;
        super(a, b);
    }
    
    public double resultado(){
        return Math.log(a);
    }
    
    @Override
    public boolean validacion(){
        return a <= 0? false: true;
    }
}
