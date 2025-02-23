/*
 * Menu de ejercicios del 1 al 3 de los Problemas Propuestos sobre Condicionales Compuestos
 */

// Importar librerias
import javax.swing.JOptionPane;

public class Ejercicio1_3 {

    public static void main(String[] args) {
        //declaracion de variables
        int seleccion;
        String despedida= "Gracias por usar el menu";

        //Menu
        seleccion = JOptionPane.showOptionDialog(null, 
        "Menu de ejercicios de los Problemas Propuestos sobre Condicionales Compuestos \n\nSelecciona una opcion", "",
        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
        null, new Object[] {"Ejercicio 1", "Ejercicio 2", "Ejercicio 3" }, null
        );

        switch (seleccion) {
            case 0:
            Problema1();
            JOptionPane.showMessageDialog(null, despedida);
            break;

            case 1:
            Problema2();
            JOptionPane.showMessageDialog(null, despedida);
            break;

            case 2:
            Problema3();
            JOptionPane.showMessageDialog(null, despedida);
            break;
        }
    }





    //problema 1
    /*
     * En una fábrica de computadoras se planea ofrecer a los clientes un descuento que dependerá del número de computadoras que compre. 
     * Si las computadoras son menos de cinco se les dará un 10% de descuento sobre el total de la compra; si el número de computadoras 
     * es mayor o igual a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un 40% de descuento. 
     * El precio de cada computadora es de $11,000
     */
    public static void Problema1() {
        //declaracion de variables
        int numComp;
        double total;
        String mensajeFinal = "";

        //solicitar datos
        numComp = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de computadoras a comprar"));

        //Proceso
        if(numComp <= 0){
            mensajeFinal = ("Numero de computadoras no valido");
        }else if(numComp < 5){
            total = (numComp*11000)*.9 ;
            mensajeFinal = "EL monto de las computadoras es de " + numComp*11000 + " Con un descuento del 10% el monto total a pagar es de " + total;
        }else if (numComp < 10){
            total = (numComp*11000)*.8 ;
            mensajeFinal = "EL monto de las computadoras es de " + numComp*11000 + " Con un descuento del 20% el monto total a pagar es de " + total;
        }else if(numComp >= 10){
            total = (numComp*11000)*.6 ;
            mensajeFinal = "EL monto de las computadoras es de " + numComp*11000 + " Con un descuento del 40% el monto total a pagar es de " + total;
        }else if(numComp > 2500){
            mensajeFinal = "El numero de computadoras que compraste es muy grande intenta ingresar un numero menor";
        }

        //mensaje final
        JOptionPane.showMessageDialog(null, mensajeFinal);
    }




    //Problema 2
    /*
     * En una llantera se ha establecido una promoción de las llantas marca "Ponchadas", dicha promoción consiste en lo siguiente:
     * Si se compran menos de cinco llantas el precio es de $300 cada una, de $250 si se compran de cinco a 10 y de $200 si se compran más de 10. 
     * Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas que compra y la que tiene que pagar por el total 
     * de la compra. 
    */
    public static void Problema2() {
        //declaracion de variables
        int numLlan;
        String mensajeFinal = "";

        //solicitar datos
        numLlan = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la cantidad de llantas a comprar"));

        //proceso
        if(numLlan <= 0) {
            mensajeFinal = "Numero de llantas no valido";
        } else if(numLlan < 5) {
            mensajeFinal = "Se compraron " + numLlan + " llantas de la marca Ponchadas, el total a pagar es de " + (numLlan*300);
        } else if (numLlan >= 5 && numLlan <= 10) {
            mensajeFinal = "Se compraron " + numLlan + " llantas de la marca Ponchadas, el total a pagar es de " + (numLlan*250);
        } else if (numLlan > 10) {
            mensajeFinal = "Se compraron " + numLlan + " llantas de la marca Ponchadas, el total a pagar es de " + (numLlan*200);
        } else if (numLlan > 2000){
            mensajeFinal = "se excedio el número de llantas intenta con un número menor";
        }
        
        //mensaje final
        JOptionPane.showMessageDialog(null, mensajeFinal);
    }




    //Problema 3
    /*
     * En un juego de preguntas a las que se responde "Si" o "No" gana quien responda correctamente las tres preguntas. Si se responde mal 
     * a cualquiera de ellas ya no se pregunta la siguiente y termina el juego. Las preguntas son: 
     *      1. Colon descubrió América? 
     *      2. La independencia de México fue en el año 1810? 
     *      3. The Doors fue un grupo de rock Americano? 
     */
    public static void Problema3() {
        //declaracion de variables
        int respuesta;
        String mensajeFinal = "";

        //solicitar datos
        respuesta = JOptionPane.showOptionDialog(null, 
        "Pregunta 1 \n\n¿Colon descubrió América?", "",
        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
        null, new Object[] {"SI", "NO"}, null
        );

        if (respuesta == 0) {
            respuesta = JOptionPane.showOptionDialog(null, 
            "Pregunta 2 \n\n ¿La independencia de México fue en el año 1810?", "",
            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
            null, new Object[] {"SI", "NO"}, null
            );

            if (respuesta == 0) {
                respuesta = JOptionPane.showOptionDialog(null, 
                "Pregunta 3 \n\n¿The Doors fue un grupo de rock Americano? ", "",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, new Object[] {"SI", "NO"}, null
                );

                if (respuesta == 0) {
                    mensajeFinal = "Todas tus respuesta son correctas gracias por participar";
                } else {
                    mensajeFinal = "Respuesta erronea gracias por participar";
                }
            
            } else {
                mensajeFinal = "Respuesta erronea gracias por participar";
            }
        } else{
            mensajeFinal = "Respuesta erronea gracias por participar";
        } 
        
        //mensaje final
        JOptionPane.showMessageDialog(null, mensajeFinal);
    }
}
