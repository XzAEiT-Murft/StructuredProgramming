/*
 * Realizar un programa que calcule e imprima el sueldo de un empleado, bajo las
 * siguientes características:
 * a. Se debe almacenar el nombre del empleado
 * b. Las horas trabajadas que deben ser horas sin parte fraccionaria
 * c. Cuota por hora
 * d. Se debe imprimir el nombre del Trabajador y el Sueldo que va a percibir
 * 
 * ejercicio 8
 * 
 */

// Importación de librerías
import javax.swing.JOptionPane;

public class SueldoEmpleado {
    public static void main(String[] args) {
        // Variables
        String nombreEmpleado;
        int horasTrabajadas;
        double sueldo;

        //constantes
        final double cuotaPorHora = 150.0;

        // Asignación de valores
        nombreEmpleado = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado");
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las horas trabajadas"));

        // Cálculo del sueldo
        sueldo = horasTrabajadas * cuotaPorHora;

        // Impresión de resultados
        JOptionPane.showMessageDialog(null, 
        "El empleado " + nombreEmpleado + " va a percibir un sueldo de $" + String.format("%.2f", sueldo));
    }
}