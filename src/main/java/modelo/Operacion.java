/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Samuel Lopez
 */
public class Operacion {
    public double a;
    public double b;
    
    public Operacion(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    public double resultado(){
        System.out.println("Error, no se ha ingresado ningun tipo de calculo: Suma, resta, multiplicacion, division ");
        return 0;
    }
    
    public boolean validacion(){
        System.out.println("Esta operacion no requiere ningun tipo de validacion. (Suma, resta, multiplicacion)");
        return true;
    }
}
