/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author coffe
 */
public class Division extends Operacion{
    
    public Division(double a, double b) {
        super(a, b);
    }
    
    @Override
    public double calcular(){
        if (b == 0){
            mensajeError = "Error: no se puede dividir entre cero.";
            return Double.NaN;
        }
        mensajeError = "";
        return a / b;
    }
}
