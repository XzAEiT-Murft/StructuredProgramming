import javax.swing.JOptionPane;

public class EjerciciosCicloLibre2 {
    public static void main(String[] args) {
        //declaracion de variables
        int seleccion;
        String despedida = "Gracias por usar el menu";
        boolean continuar = true;

        //Menu
        do {
            seleccion = JOptionPane.showOptionDialog(null,
                "Menu de ejercicios de los Problemas Propuestos sobre bucles \n\nSelecciona una opcion", "",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, new Object[]{
                "Ejercicio 9", "Ejercicio 10", "Ejercicio 11", "Ejercicio 12", 
                "Ejercicio 13", "Ejercicio 14", "Ejercicio 15", "Ejercicio 16", "Salir"}, null
            );

            if (seleccion == 8 || seleccion == -1) {
                JOptionPane.showMessageDialog(null, despedida);
                break;
            }
            
            switch (seleccion) {
                case 0:
                    ejercicio9();
                    break;
                case 1:
                    ejercicio10();
                    break;
                case 2:
                    ejercicio11();
                    break;
                case 3:
                    ejercicio12();
                    break;
                case 4:
                    ejercicio13();
                    break;
                case 5:
                    ejercicio14();
                    break;
                case 6:
                    ejercicio15();
                    break;
                case 7:
                    ejercicio16();
                    break;
            }
        } while(continuar);
    }
    

    //Ejercicio 9
    /*
    * Leer un número entero positivo N y calcular su factorial.
    * Ejemplo: Si N = 5, el factorial es 1*2*3*4*5.
    * El factorial de 0 es 1.
    */
    public static void ejercicio9() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        JOptionPane.showMessageDialog(null, "El factorial de " + n + " es: " + factorial);
    }

    //Ejercicio 10
    /*
    * Mostrar los números impares entre 0 y 100.
    */
    public static void ejercicio10() {
        String impares = "";
        for (int i = 1; i < 100; i += 2) {
            impares += i + " ";
        }
        JOptionPane.showMessageDialog(null, "Números impares entre 0 y 100: " + impares);
    }

    //Ejercicio 11
    /*
    * Ingresar un número y mostrar la suma de los números que lo anteceden.
    */
    public static void ejercicio11() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
        int suma = 0;
        for (int i = 1; i < n; i++) {
            suma += i;
        }
        JOptionPane.showMessageDialog(null, "La suma de los números que anteceden a " + n + " es: " + suma);
    }

    //Ejercicio 12
    /*
    * Ingresar un número y determinar si es número primo.
    */
    public static void ejercicio12() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
        boolean esPrimo = true;
        if (n <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        JOptionPane.showMessageDialog(null, n + (esPrimo ? " es primo" : " no es primo"));
    }

    //Ejercicio 13
    /*
    * Ingresar n números, sumar los positivos y multiplicar los negativos.
    */
    public static void ejercicio13() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de valores:"));
        int sumaPositivos = 0;
        int productoNegativos = 1;
        for (int i = 0; i < n; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
            if (numero > 0) {
                sumaPositivos += numero;
            } else if (numero < 0) {
                productoNegativos *= numero;
            }
        }
        JOptionPane.showMessageDialog(null, "Suma de positivos: " + sumaPositivos + "\nProducto de negativos: " + productoNegativos);
    }

    //Ejercicio 14
    /*
    * Realizar un programa que resuelva la siguiente serie:
    * S = ((x^3/3)/1) + ((x^3/6)/3) + ((x^3/9)/5) + ((x^3/12)/7) ... n
    */
    public static void ejercicio14() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de n:"));
        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de x:"));
        double suma = 0;
        for (int i = 1, j = 1; i <= n; i++, j += 3) {
            suma += Math.pow(x, 3) / (3 * i) / j;
        }
        JOptionPane.showMessageDialog(null, "El resultado de la serie es: " + suma);
    }

    //Ejercicio 15
    /*
    * Realizar un programa que resuelva la siguiente serie:
    * S = ((x^3/3)/1) + ((x^3/6)/3) - ((x^3/9)/5) + ((x^3/12)/7) - ((x^3/15)/9) ... n
    */
    public static void ejercicio15() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de n:"));
        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de x:"));
        double suma = 0;
        for (int i = 1, j = 1; i <= n; i++, j += 3) {
            if (i % 2 == 0) {
                suma -= Math.pow(x, 3) / (3 * i) / j;
            } else {
                suma += Math.pow(x, 3) / (3 * i) / j;
            }
        }
        JOptionPane.showMessageDialog(null, "El resultado de la serie es: " + suma);
    }

    //Ejercicio 16
    /*
    * Realizar un programa que imprima del 1000 al 0.
    */
    public static void ejercicio16() {
        String numeros = "";
        for (int i = 1000; i >= 0; i--) {
            numeros += "\n" + i ;
        }
        JOptionPane.showMessageDialog(null, "Números del 1000 al 0: " + numeros);
    }
}
