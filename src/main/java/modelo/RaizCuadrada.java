/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author coffe
 */
public class RaizCuadrada extends Operacion{
    
    public RaizCuadrada(double a, double b) {
        b = 2;
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
