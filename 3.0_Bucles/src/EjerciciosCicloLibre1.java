import javax.swing.JOptionPane;

public class EjerciciosCicloLibre1 {

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
                "Ejercicio 1", "Ejercicio 2", "Ejercicio 3", "Ejercicio 4", 
                "Ejercicio 5", "Ejercicio 6", "Ejercicio 7", "Ejercicio 8", "Salir"}, null
            );

            if (seleccion == 8 || seleccion == -1) {
                JOptionPane.showMessageDialog(null, despedida);
                break;
            }
            
            switch (seleccion) {
                case 0:
                    ejercicio1();
                    break;
                case 1:
                    ejercicio2();
                    break;
                case 2:
                    ejercicio3();
                    break;
                case 3:
                    ejercicio4();
                    break;
                case 4:
                    ejercicio5();
                    break;
                case 5:
                    ejercicio6();
                    break;
                case 6:
                    ejercicio7();
                    break;
                case 7:
                    ejercicio8();
                    break;
            }
            
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea volver al menú?", 
            "Continuar", JOptionPane.YES_NO_OPTION);
            if (respuesta != 0) {
                continuar = false;
                JOptionPane.showMessageDialog(null, despedida);
            }
        } while(continuar);
    }

    //Ejercicio 1
    /*
    * La presión, volumen y temperatura de una masa de aire se relacionan por la fórmula:
    * masa = (presión * volumen) / (0.37 * (temperatura + 460))
    * Calcular el promedio de masa de aire de los neumáticos de n vehículos que están en
    * compostura en un servicio de alineación y balanceo. Los vehículos pueden ser motocicletas
    * o automóviles.
    */
    public static void ejercicio1() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de vehículos:"));
        double sumaMasa = 0;
        for (int i = 0; i < n; i++) {
            double presion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la presión:"));
            double volumen = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el volumen:"));
            double temperatura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura:"));
            double masa = (presion * volumen) / (0.37 * (temperatura + 460));
            sumaMasa += masa;
        }
        double promedioMasa = sumaMasa / n;
        JOptionPane.showMessageDialog(null, "El promedio de masa es: " + promedioMasa);
    }

    //Ejercicio 2
    /*
    * En una granja se requiere saber información para determinar el precio de venta por kilo de huevo.
    * Es importante determinar el promedio de calidad de las n gallinas en la granja.
    * La calidad se obtiene con la fórmula:
    * calidad = (peso de la gallina * altura de la gallina) / numero de huevos que pone
    * El precio se fija con la siguiente tabla:
    * |----------------------------|----------------------------|
    * | Precio Total de Calidad    |  Peso por Kilo de Huevo    |
    * |----------------------------|----------------------------|
    * | Mayor o igual a 15         | 1.2 * promedio de calidad  |
    * | Mayor que 8 y menor que 15 | 1.00 * promedio de calidad |
    * | Menor o igual que 8        |0.80 * promedio de calidad  |
    * |----------------------------|----------------------------|
    */
    public static void ejercicio2() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de gallinas:"));
        double sumaCalidad = 0;
        for (int i = 0; i < n; i++) {
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la gallina:"));
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura de la gallina:"));
            int huevos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de huevos:"));
            double calidad = (peso * altura) / huevos;
            sumaCalidad += calidad;
        }
        double promedioCalidad = sumaCalidad / n;
        double precio;
        if (promedioCalidad >= 15) {
            precio = 1.2 * promedioCalidad;
        } else if (promedioCalidad > 8) {
            precio = 1.0 * promedioCalidad;
        } else {
            precio = 0.8 * promedioCalidad;
        }
        JOptionPane.showMessageDialog(null, "El precio por kilo de huevo es: " + precio);
    }

    //Ejercicio 3
    /*
    * Calcular la suma siguiente:
    * 100 + 98 + 96 + 94 + ... + 0 en este orden.
    */
    public static void ejercicio3() {
        int suma = 0;
        for (int i = 100; i >= 0; i -= 2) {
            suma += i;
        }
        JOptionPane.showMessageDialog(null, "La suma es: " + suma);
    }

    //Ejercicio 4
    /*
    * Leer n calificaciones de un grupo de alumnos.
    * Calcular y escribir el porcentaje de reprobados y aprobados.
    * La calificación mínima aprobatoria es 70.
    */
    public static void ejercicio4() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de calificaciones:"));
        int aprobados = 0;
        int reprobados = 0;
        for (int i = 0; i < n; i++) {
            int calificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la calificación:"));
            if (calificacion >= 70) {
                aprobados++;
            } else {
                reprobados++;
            }
        }
        double porcentajeAprobados = (aprobados * 100.0) / n;
        double porcentajeReprobados = (reprobados * 100.0) / n;
        JOptionPane.showMessageDialog(null, "Porcentaje de aprobados: " + porcentajeAprobados + "%\nPorcentaje de reprobados: " + porcentajeReprobados + "%");
    }

    //Ejercicio 5
    /*
    * Calcular la suma de la siguiente sucesión e imprimir la sucesión y la suma:
    * 20, 25, 30, 35, .... N
    */
    public static void ejercicio5() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de N:"));
        int suma = 0;
        String sucesion = "";
        for (int i = 20; i <= n; i += 5) {
            suma += i;
            sucesion += i + " ";
        }
        JOptionPane.showMessageDialog(null, "Sucesión: " + sucesion + "\nSuma: " + suma);
    }

    //Ejercicio 6
    /*
    * Calcular la suma de la sucesión e imprimir la sucesión y la suma:
    * 1, 4, 9, 16, 25, 36, 49, 64, 81, ...n
    * Cada número se obtiene elevando al cuadrado su posición.
    */
    public static void ejercicio6() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de N:"));
        int suma = 0;
        String sucesion = "";
        for (int i = 1; i <= n; i++) {
            int cuadrado = i * i;
            suma += cuadrado;
            sucesion += cuadrado + " ";
        }
        JOptionPane.showMessageDialog(null, "Sucesión: " + sucesion + "\nSuma: " + suma);
    }

    //Ejercicio 7
    /*
    * Leer n números y calcular e imprimir el número mayor y el número menor.
    */
    public static void ejercicio7() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de valores:"));
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        JOptionPane.showMessageDialog(null, "Número mayor: " + mayor + "\nNúmero menor: " + menor);
    }

    //Ejercicio 8
    /*
    * Calcular e imprimir la suma de los números del 1 hasta el 100.
    */
    public static void ejercicio8() {
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i;
        }
        JOptionPane.showMessageDialog(null, "La suma es: " + suma);
    }
}
