package controlador;

import modelo.*;

public class ControladorCalculadora {

    private String mensajeError = "";

    // Operaciones de dos números (+, -, *, /)
    public double calcularBinaria(String operador, double a, double b) {
        mensajeError = "";
        Operacion op = null;

        if (operador.equals("+")) {
            op = new Suma(a, b);
        } else if (operador.equals("-")) {
            op = new Resta(a, b);
        } else if (operador.equals("*")) {
            op = new Multiplicacion(a, b);
        } else if (operador.equals("/")) {
            op = new Division(a, b);
        }

        if (op != null) {
            double resultado = op.calcular();
            // Si el modelo detectó un error (ej: división entre 0), guarda el mensaje
            if (Double.isNaN(resultado)) {
                mensajeError = op.getMensajeError();
            }
            return resultado;
        }

        mensajeError = "Operador no válido";
        return Double.NaN;
    }

    // Operaciones de un solo número (√, ³√, ln)
    public double calcularUnaria(String tipo, double valor) {
        mensajeError = "";
        Operacion op = null;

        if (tipo.equals("RAIZ")) {
            op = new RaizCuadrada(valor);
        } else if (tipo.equals("RAIZ_CUBICA")) {
            op = new RaizCubica(valor);
        } else if (tipo.equals("LN")) {
            op = new LogaritmoNatural(valor);
        }

        if (op != null) {
            double resultado = op.calcular();
            // Si el cálculo da error (ej: raíz negativa o ln <= 0), guarda el mensaje
            if (Double.isNaN(resultado)) {
                mensajeError = op.getMensajeError();
            }
            return resultado;
        }

        mensajeError = "Operación no soportada";
        return Double.NaN;
    }

    public String getMensajeError() {
        return mensajeError;
    }
}