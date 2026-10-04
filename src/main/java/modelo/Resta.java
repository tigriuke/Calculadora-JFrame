/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Samuel Lopez
 */
public class Resta extends Operacion {

    public Resta(double a, double b) {
        super(a, b);
    }
    
    @Override
    public double resultado(){
        return a - b;
    }
}
