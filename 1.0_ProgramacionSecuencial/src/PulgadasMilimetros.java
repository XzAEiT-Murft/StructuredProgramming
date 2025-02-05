/*
 * programa que convierte pulgadas a milímetros
 * 1 pulgada = 25.4 mm
 * ejercicio 5
 * 
 */

 // Importamos la librería javax.swing.JOptionPane
import javax.swing.JOptionPane;

public class PulgadasMilimetros {
    public static void main(String[] args) {
        // Declaramos las variables
        double pulgadas1 = 0;
        double pulgadas2 = 0;
        double resultado1 = 0;
        double resultado2 = 0;


        // Pedimos al usuario que ingrese las pulgadas
        pulgadas1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el primer valor en pulgadas: "));
        pulgadas2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el segundo valor en pulgadas: "));

        // Realizamos la conversión
        resultado1 = pulgadas1 * 25.4;
        resultado2 = pulgadas2 * 25.4;

        // Mostramos el resultado
        JOptionPane.showMessageDialog(null, 
        pulgadas1 + " pulgadas son " + String.format("%.2f",resultado1) + " milímetros"
        + "\n" + pulgadas2 + " pulgadas son " + String.format("%.2f", resultado2) + " milímetros");
    }
}
