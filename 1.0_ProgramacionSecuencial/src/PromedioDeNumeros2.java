/*
 * Programa que calcula y muestra el promedio de 4 numeros ingresados por el usuario
 * 
 * Por como hice el ejercicio 3, este es lo mismo asi que solo cambie el nombre 
 * 
 * Ejericio 10
 * 
 */

// Importamos la clase JOptionPane para poder usarla
import javax.swing.JOptionPane;

 public class PromedioDeNumeros2 {
    public static void main(String[] args) {

        // Declaramos las variables que vamos a utilizar
        double num1 = 0;
        double num2 = 0;
        double num3 = 0;
        double num4 = 0;
        double promedio = 0;

        // Pedimos al usuario que ingrese los números
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el primer número"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el segundo número"));
        num3 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el tercer número"));
        num4 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el cuarto número"));


        // Calculamos el promedio de los números
        promedio = (num1 + num2 + num3 + num4) / 4;
        // Mostramos el resultado en un joptionPane
        JOptionPane.showMessageDialog(null, "El promedio de los números " + 
        num1 + ", " + num2 + ", " + num3 + " y " + num4 + " es " + String.format("%.2f", promedio));
    }
}
