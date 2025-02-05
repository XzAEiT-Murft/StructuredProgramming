/*
 * programa que convierte de kilogramos a libras
 * 1 libra = 0.454 kg
 * ejercicio 4
 * 
 */

 //importamos la libreria para poder usar el JOptionPane
import javax.swing.JOptionPane;

public class ConversionLibras2 {
        public static void main(String[] args) {
        //variables
        double peso1, peso2, peso3;
        //constante
        final double libras = 1/0.454;

        //entrada de datos
        peso1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el peso 1 en kilogramos"));
        peso2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el peso 2 en kilogramos"));
        peso3 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el peso 3 en kilogramos"));

        //salida o resultado de las conversiones
        JOptionPane.showMessageDialog(null, 
        "El peso 1 de " + peso1 + "kg en libras es: " + String.format("%.3f", peso1 * libras)
        + "\nEl peso 2 de " + peso2 + "kg en libras es: " + String.format("%.3f", peso2 * libras)
        + "\nEl peso 3 de " + peso3 + "kg en libras es: " + String.format("%.3f", peso3 * libras));
    }
}
