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
    
    public RaizCubica(double a) {
        super(a, 0);     
    }
    
    @Override
    public double calcular(){
        return Math.cbrt(a);
    }
}
