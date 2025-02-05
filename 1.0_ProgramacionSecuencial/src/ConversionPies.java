/*
 * progrma que lea un numero en pies y calcule e imprima su equivalente
 * en yardas, pulgadas, centimetros y metros deacuerdo a las siguientes
 * equivalencias:
 * 1 pie = 12 pulgadas
 * 1 yarda = 3 pies
 * 1 pulgada = 2.54 cm
 * 1 metro = 100 cm
 * 
 * ejercico 14
 */

//Importamos librerias
import javax.swing.JOptionPane;

public class ConversionPies {
    public static void main(String[] args) {
        //Declaramos las variables
        double pies; 
        double yardas, pulgadas, centimetros, metros;
        
        //Solicitamos los datos al usuario
        pies = Double.parseDouble(JOptionPane.showInputDialog("Ingresa  pies: "));

        //Realizamos las conversiones
        yardas = pies / 3;
        pulgadas = pies * 12;
        centimetros = pulgadas * 2.54;
        metros = centimetros / 100;

        //Imprimimos los resultados
        JOptionPane.showMessageDialog(null, 
        "Yardas: " + String.format("%.2f", yardas) + 
        "\nPulgadas: " + String.format("%.2f", pulgadas) + 
        "\nCentimetros: " + String.format("%.2f", centimetros) + 
        "\nMetros: " + String.format("%.2f", metros));
    }
}
