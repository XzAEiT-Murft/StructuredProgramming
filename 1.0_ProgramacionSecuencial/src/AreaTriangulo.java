/*
 * programa que calcula el área de un triángulo
 * 
 * ejercicio 9
 * 
 */

// Importar librerías
import javax.swing.JOptionPane;

public class AreaTriangulo {
    public static void main(String[] args) {
        // Declaración de variables
        double base = 0;
        double altura = 0;
        double area;

        // Solicitud de datos
        base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del triángulo: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del triángulo: "));

        // Calcular el área
        area = (base * altura) / 2;

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "El área del triángulo es: " + String.format("%.2f", area));
    }
}
