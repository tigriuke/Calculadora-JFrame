/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Calculadora {
    private String entradaActual = "0";
    
    public void agregarDigito(String caracter){
        if(caracter.equals(".")){
            if(!(entradaActual.contains("."))){
                entradaActual += ".";
            }
        }
        if (entradaActual.equals("0")){
            entradaActual = caracter;
        }else{
            entradaActual = entradaActual + caracter;
        }
    }
}
