/*
* realiza un prgrama que permita que el descuento del monto sea del 10%
* si el monto es mas grande o igual a 100 si no que sea del 5%
*/

//importamos librerias
import javax.swing.JOptionPane;

public class Descuento {
    public static void main(String[] args) {
        //declaracion de variables 
        double monto;

        //solicitar datos
        monto = Double.parseDouble(JOptionPane.showInputDialog( "Ingresa el monto"));

        //Proceso
        if(monto >= 100){
            //salida 1
            JOptionPane.showMessageDialog(null,
            "El descuento es de: " + (monto * 0.10) + " El monto total es de " + (monto * 0.90));
        } else {
            //salida 2
            JOptionPane.showMessageDialog(null, 
            "El descuento es de: " + (monto * 0.05) + " El monto total es de " + (monto * 0.95));
        }
    }
}


