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
    
    public RaizCuadrada(double a) {
        super(a, 0);
    }
    
    @Override
    public double calcular(){
        if (a < 0){
            mensajeError = "Error: no se puede calcular la raíz cuadrada de un número negativo.";
            return Double.NaN;
        }
        mensajeError = "";
        return Math.sqrt(a);
    }
}
