/*
 * Crear un programa que calcule el área de un círculo.
 * ejercicio 1 
 */

 // Importamos la clase JOptionPane
import javax.swing.JOptionPane;

public class AreaCirculo {
    public static void main(String[] args) {
        // Declaramos las variables y constantes
        final double pi = 3.1416;
        double radio = 0;
        double area = 0;

        // Solicitamos el valor del radio
        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de radio"));
        // Calculamos el área
        area = pi * Math.pow(radio, 2);
        // Mostramos el resultado
        JOptionPane.showMessageDialog(null, "El area dek circulo con radio " + radio + " es " + area);

    }
}
