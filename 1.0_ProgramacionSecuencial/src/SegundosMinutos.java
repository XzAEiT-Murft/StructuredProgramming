/*
 * Programa que convierte un numero dado de segundos a minutos
 * 
 * ejercicio 12
 */

//importar librerias
import javax.swing.JOptionPane;

public class SegundosMinutos {
    public static void main(String[] args) {
        //declaracion de variables
        double segundos = 0.0;
        double minutos = 0.0;

        //solicitar al usuario los segundos
        segundos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los segundos para convertirlos a minutos:"));

        //calcular los minutos
        minutos = segundos / 60.0;

        //imprimir el resultado
        JOptionPane.showMessageDialog(null, 
        segundos + " segundos son " + String.format("%.2f", minutos) + " minutos");
    }
}
