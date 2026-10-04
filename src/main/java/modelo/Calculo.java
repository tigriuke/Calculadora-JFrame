/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author coffe
 */
public class Calculo {
    private double a;
    private double b;
    
    public Calculo(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    public double resultado(){
        System.out.println("Error, no se ha ingresado ningun tipo de calculo: Suma, resta, multiplicacion, division ");
        return 0;
    }
}
