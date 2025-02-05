/*
 * programa que calcula el area y perimetro de un circulo
 * con un radio de 3.2 pulgadas
 * ejercicio 6
 */

//importamos la libreria para poder usar el JOptionPane
import javax.swing.JOptionPane;
public class AreaPerimetroCirculo {
    public static void main(String[] args) {
        //variables
        double radio, area, perimetro;
        
        //constante
        final double PI = 3.1416;

        //entrada de datos
        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio del circulo en pulgadas"));
        
        //calculos
        area = PI * Math.pow(radio, 2);
        perimetro = 2 * PI * radio;

        //resultado de las conversiones
        JOptionPane.showMessageDialog(null, 
        "El area de un circulo con radio de " + radio + " pulgadas es: " +
        String.format("%.3f", area) + " pulgadas cuadradas"
        + "\nEl perimetro de un circulo con radio de " + radio + " pulgadas es: " + 
        String.format("%.3f", perimetro) + " pulgadas");
    }
}
