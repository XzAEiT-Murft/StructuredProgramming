/*
 * Menu de ejercicios del ciclo for
 */

//Importamos librerias
import javax.swing.JOptionPane;

public class EjerciciosCicloFor {

    public static void main(String[] args) {
        //declaracion de variables
        int seleccion;
        String despedida = "Gracias por usar el menu";
        boolean continuar;

        //Menu
        for (continuar = true; continuar == true;) {
            seleccion = JOptionPane.showOptionDialog(null,
                "Menu de ejercicios de los Problemas Propuestos sobre bucles \n\nSelecciona una opcion", "",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, new Object[]{"Ejercicio 1", "Ejercicio 2", "Ejercicio 3",
                "Ejercicio 4", "Ejercicio 5", "Ejercicio 6", "Ejercicio 7", "Salir"}, null
            );

            if (seleccion == 7 || seleccion == -1) {
                JOptionPane.showMessageDialog(null, despedida);
                break;
            }
            
            switch (seleccion) {
                case 0:
                    Problema1();
                    break;
                case 1:
                    Problema2();
                    break;
                case 2:
                    Problema3();
                    break;
                case 3:
                    Problema4();
                    break;
                case 4:
                    Problema5();
                    break;
                case 5:
                    Problema6();
                    break;
                case 6:
                    Problema7();
                    break;
            }
            
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea volver al menú?", 
            "Continuar", JOptionPane.YES_NO_OPTION);
            if (respuesta != 0) {
                continuar = false;
                JOptionPane.showMessageDialog(null, despedida);
            }
        }
    }

    //Ejercicio 1
    /*
     * Calcular el promedio de un alumno que tiene n calificaciones en la materia de
     * Metodología de la programación. 
     */
    public static void Problema1() {
        int calif = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de calificaciones:"));
        double suma = 0;
        for (int i = 0; i < calif; i++) {
            double calificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación " + (i + 1) + ":"));
            suma += calificacion;
        }
        double promedio = suma / calif;
        JOptionPane.showMessageDialog(null, "El promedio es: " + promedio);
    }

    //Ejercicio 2
    /*
     * Suponga que se tiene un conjunto de calificaciones de un grupo de n alumnos.
     * Realizar un  programa para calcular la calificación media y la calificación 
     * más baja de todo el grupo. 
     */
    public static void Problema2() {
        int alumnos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de alumnos:"));
        double suma = 0;
        double calificacionMinima = 100;
        for (int i = 0; i < alumnos; i++) {
            double calificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación del alumno " + (i + 1) + ":"));
            suma += calificacion;
            if (calificacion < calificacionMinima) {
                calificacionMinima = calificacion;
            }
        }
        double promedio = suma / alumnos;
        JOptionPane.showMessageDialog(null, 
        "El promedio es: " + promedio + "\nLa calificación más baja es: " + calificacionMinima);
    }

    //Ejercicio 3
    /*
     * Calcular y multiplicar la tabla de multiplicar de un número cualquiera.
     * Imprimir el  multiplicando, el multiplicador y el producto. 
     */
    public static void Problema3() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número para la tabla de multiplicar:"));
        String resultado = "";
        for (int i = 1; i <= 10; i++) {
            resultado += numero + " x " + i + " = " + (numero * i) + "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }

    //Ejercicio 4
    /*
     * Una persona debe realizar un muestreo con n personas para determinar el promedio de  peso de los niños, jóvenes, adultos y viejos que existen en su zona habitacional.
     * Se determinan las categorías con base a la siguiente tabla: 
     */
    public static void Problema4() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de personas:"));
        double sumaNinos = 0, sumaJovenes = 0, sumaAdultos = 0, sumaViejos = 0;
        int countNinos = 0, countJovenes = 0, countAdultos = 0, countViejos = 0;

        for (int i = 0; i < n; i++) {
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona " + (i + 1) + ":"));
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la persona " + (i + 1) + ":"));

            if (edad <= 12) {
                sumaNinos += peso;
                countNinos++;
            } else if (edad <= 29) {
                sumaJovenes += peso;
                countJovenes++;
            } else if (edad <= 59) {
                sumaAdultos += peso;
                countAdultos++;
            } else {
                sumaViejos += peso;
                countViejos++;
            }
        }

        double promedioNinos = countNinos == 0 ? 0 : sumaNinos / countNinos;
        double promedioJovenes = countJovenes == 0 ? 0 : sumaJovenes / countJovenes;
        double promedioAdultos = countAdultos == 0 ? 0 : sumaAdultos / countAdultos;
        double promedioViejos = countViejos == 0 ? 0 : sumaViejos / countViejos;

        JOptionPane.showMessageDialog(null, "Promedio de peso:\nNiños: " + promedioNinos + "\nJóvenes: " + promedioJovenes + "\nAdultos: " + promedioAdultos + "\nViejos: " + promedioViejos);
    }

    //Ejercicio 5
    /*
     * Al cerrar un expendio de naranjas, 15 clientes que aún no han pagado recibirán un 15% de
     * descuento si compran más de 10 kilos. Determinar cuánto pagará cada cliente y cuanto
     * percibirá la tienda por esas compras.
     */
    public static void Problema5() {
        double precioPorKilo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio por kilo de naranjas:"));
        double totalTienda = 0;

        for (int i = 1; i <= 15; i++) {
            double kilos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los kilos de naranjas del cliente " + i + ":"));
            double totalCliente = kilos * precioPorKilo;
            if (kilos > 10) {
                totalCliente *= 0.85;
            }
            totalTienda += totalCliente;
            JOptionPane.showMessageDialog(null, "El cliente " + i + " debe pagar: " + totalCliente);
        }

        JOptionPane.showMessageDialog(null, "La tienda percibirá un total de: " + totalTienda);
    }

    //Ejercicio 6
    /*
     * En un centro de verificación de automóviles se debe saber el promedio de puntos de
     * contaminantes de los primeros 25 automóviles que lleguen. Asimismo, se desea saber
     * los  puntos contaminantes del carro que menos contamino y el que más contamino. 
     */
    public static void Problema6() {
        double suma = 0;
        double minContaminacion = 100;
        double maxContaminacion = 0;

        for (int i = 1; i <= 25; i++) {
            double puntos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los puntos de contaminantes del automóvil " + i + ":"));
            suma += puntos;
            if (puntos < minContaminacion) {
                minContaminacion = puntos;
            }
            if (puntos > maxContaminacion) {
                maxContaminacion = puntos;
            }
        }

        double promedio = suma / 25;
        JOptionPane.showMessageDialog(null, 
        "Promedio de puntos de contaminantes: " + promedio + "\nMenor contaminación: " 
        + minContaminacion + "\nMayor contaminación: " + maxContaminacion);
    }

    //Ejercicio 7
    /*
     * Realizar un programa que permita obtener la suma de diez cantidades.
     */
    public static void Problema7() {
        double suma = 0;
        for (int i = 1; i <= 10; i++) {
            double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad " + i + ":"));
            suma += cantidad;
        }
        JOptionPane.showMessageDialog(null, "La suma de las diez cantidades es: " + suma);
    }
}
