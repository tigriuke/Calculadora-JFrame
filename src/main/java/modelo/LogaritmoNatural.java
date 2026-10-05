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
    
    public LogaritmoNatural(double a) {
        super(a, 0);
    }
    
    @Override
    public double calcular(){
        if(a <= 0){
            mensajeError = "Error: el logaritmo natural solo está definido para números mayores que cero.";
            return Double.NaN;
        }
        mensajeError = "";
        return Math.log(a);
    }
}
