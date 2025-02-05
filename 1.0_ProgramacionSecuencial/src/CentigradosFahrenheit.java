/*
 * progrma que dada la temperatura en grados centígrados (C) se pueda
 * convertir a su equivalente Fahrenheit (F) con la fórmula:
 * F = (9/5) * C + 32
 * 
 * Ejericio 13
 */

//importar librerias
import javax.swing.JOptionPane;

public class CentigradosFahrenheit {
    public static void main(String[] args) {
        //declaracion de variables
        double centigrados = 0.0;
        double fahrenheit = 0.0;

        //solicitar al usuario los grados centigrados
        centigrados = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los grados centigrados para convertirlos a Fahrenheit:"));

        //calcular los grados Fahrenheit
        fahrenheit = (9.0 / 5.0) * centigrados + 32.0;

        //imprimir el resultado
        JOptionPane.showMessageDialog(null, 
        centigrados + " grados centigrados son " + String.format("%.2f", fahrenheit) + " grados Fahrenheit");
    }
}
