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
    protected double a;
    protected double b;
    protected String mensajeError;
    
    public Operacion(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    public double calcular(){
        System.out.println("Error, no se ha ingresado ningun tipo de calculo: Suma, resta, multiplicacion, division ");
        return 0;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public String getMensajeError() {
        return mensajeError;
    }

    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }
    
    
}
