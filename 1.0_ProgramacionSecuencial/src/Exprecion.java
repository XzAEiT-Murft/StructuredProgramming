/*
 * calculer el resultado de la expresion n = x+y/y-1
 * para los valores de x y y cuales quiera
 * 
 * ejercicio 7
 */

//importacion de librerias
import javax.swing.JOptionPane;

public class Exprecion {
    public static void main(String[] args) {
        //variables
        double x, y, n;

        //ingreso de datos a calcular
        x = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de x"));
        y = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de y"));

        //calculo de la expresion
        n = (x + y) / (y - 1);

        //salida o resultado de la expresion
        JOptionPane.showMessageDialog(null,
        "El resultado de la expresion n = (x + y) / (y - 1) es: " + String.format("%.2f", n));
    }
}