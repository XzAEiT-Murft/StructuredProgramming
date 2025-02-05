/*
 * Realiza un programa que permita determinar la calificacion de un alumno
 * asignando una letra, si la calificacion es mayor o igual a 9 la letra es A,
 * si la calificacion es mayor o igual a 8 la letra es B, si la calificacion es
 * igual o mayor a 7 la letra es C, si la calificacion es igual o mayor a 6 la
 * letra es D, si la calificacion es menor a 6 la letra es F, valida que la calificacion
 * no sea negativa, mayor que 10 o menor que 0
 */

//importamos librerias
import javax.swing.JOptionPane;

public class CalifiacionDeLetras {
    public static void main(String[] args) {
        //declaracion de variables
        double calif;
        char letra = ' ';

        //solicitar datos
        calif = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa tu calificacion"));

        //Proceso
        if(calif < 0 || calif > 10) {
            JOptionPane.showMessageDialog(null, "La calificacion no es valida");
        } else if(calif >= 9) {
            letra = 'A';
        } else if(calif >= 8) {
            letra = 'B';
        } else if(calif >= 7) {
            letra = 'C';
        } else if(calif >= 6) {
            letra = 'D';
        } else {
            letra = 'F';
        }

        //salida
        JOptionPane.showMessageDialog(null, "Tu calificacion es: " + letra);
    }
}
