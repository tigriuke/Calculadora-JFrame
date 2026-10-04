/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import modelo.Calculo;
/**
 *
 * @author coffe
 */
public class Suma extends Calculo {
    private double a;
    private double b;

    public Suma(double a, double b) {
        super(a, b);
    }
    
    @Override
    public double resultado(){
        return a + b;
    }
    
    
}
