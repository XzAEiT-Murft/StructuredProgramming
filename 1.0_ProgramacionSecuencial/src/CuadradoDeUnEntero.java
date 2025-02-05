/*
 * Programa que calcula y muestra el cuadrado de numeros enteros "1-9"
 * ejercicio 2
 */

public class CuadradoDeUnEntero {
    public static void main(String[] args) {
        // Array de numeros enteros
        int numeros[] = {1, 2, 3, 4, 5, 6 ,7, 8, 9};

        // Iteramos sobre el array de numeros
        for (int i = 0; i < numeros.length; i++) {
            // Mostramos el cuadrado de cada numero
            System.out.println("El cuadrado de " + numeros[i] + " es " + Math.pow(numeros[i], 2));
        }
    }
}


/*
    posdata profe se que no hemos visto el uso de arrays y ciclos repetitivos
    pero la verdad me dava flojera declarar cada numero y hacer manualmanete
    cada operacion para sacar el cuadrado de cada numero y pues decidi hacerlo asi
*/