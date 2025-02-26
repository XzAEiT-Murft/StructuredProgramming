//Importamos librerias
import javax.swing.JOptionPane;

public class EjerciciosCicloWhile {
    public static void main(String[] args) {
        //declaracion de variables
        int seleccion;
        String despedida = "Gracias por usar el menu";
        boolean continuar = true;

        //Menu
        while(continuar) {
            seleccion = JOptionPane.showOptionDialog(null,
                "Menu de ejercicios de los Problemas Propuestos sobre bucles \n\nSelecciona una opcion", "",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, new Object[]{"Ejercicio 1", "Ejercicio 2", "Ejercicio 3",
                "Ejercicio 4", "Ejercicio 5", "Ejercicio 6", "Ejercicio 7", "Ejercicio 8", "Salir"}, null
            );

            if (seleccion == 8 || seleccion == -1) {
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
                case 7:
                    Problema8();
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
    * Una compañía de seguros tiene contratados a n vendedores. Cada uno hace tres ventas a la semana.
    * Su política de pagos es que un vendedor recibe un sueldo base y un 10% extra por comisiones de sus ventas.
    * El gerente de su compañía desea saber cuánto dinero obtendrá en la semana cada vendedor por concepto de 
    * comisiones por las tres ventas realizadas, y cuánto tomando en cuenta su sueldo base y sus comisiones.
    */
    public static void Problema1() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de vendedores:"));
        int i = 0;
        while (i < n) {
            double sueldoBase = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo base del vendedor " + (i + 1) + ":"));
            double venta1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la primera venta:"));
            double venta2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la segunda venta:"));
            double venta3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la tercera venta:"));
            double comision = (venta1 + venta2 + venta3) * 0.10;
            double sueldoTotal = sueldoBase + comision;
            JOptionPane.showMessageDialog(null, "El vendedor " + (i + 1) + " obtendrá $" + comision + " por comisiones y $" + sueldoTotal + " en total.");
            i++;
        }
    }

    //Ejercicio 2
    /*
    * En una empresa se requiere calcular el salario semanal de cada uno de los n obreros que laboran en ella.
    * El salario se calcula de la siguiente manera:
    * a. Si el obrero trabaja 40 horas o menos, se le paga $20 por hora.
    * b. Si trabaja más de 40 horas, se le paga $20 por cada una de las primeras 40 horas y $25 por cada hora extra.
    */
    public static void Problema2() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de obreros:"));
        int i = 0;
        while (i < n) {
            int horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas por el obrero " + (i + 1) + ":"));
            double salario;
            if (horasTrabajadas <= 40) {
                salario = horasTrabajadas * 20;
            } else {
                salario = 40 * 20 + (horasTrabajadas - 40) * 25;
            }
            JOptionPane.showMessageDialog(null, "El salario del obrero " + (i + 1) + " es $" + salario);
            i++;
        }
    }

    //Ejercicio 3
    /*
    * Determinar cuántos hombres y cuántas mujeres se encuentran en un grupo de n personas,
    * suponiendo que los datos son extraídos alumno por alumno.
    */
    public static void Problema3() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de personas:"));
        int i = 0;
        int hombres = 0;
        int mujeres = 0;
        while (i < n) {
            String genero = JOptionPane.showInputDialog("Ingrese el género de la persona " + (i + 1) + " (M/F):");
            if (genero.equalsIgnoreCase("M")) {
                hombres++;
            } else if (genero.equalsIgnoreCase("F")) {
                mujeres++;
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "Hay " + hombres + " hombres y " + mujeres + " mujeres.");
    }

    //Ejercicio 4
    /*
    * El departamento de seguridad pública y tránsito del DF desea saber, de los n autos que entran a la ciudad de México,
    * cuántos entran con calcomanía de cada color. Conociendo el último dígito de la placa de cada automóvil, 
    * se puede determinar el color de la calcomanía utilizando la siguiente relación:
    * |----------|---------------|
    * | Digito   |  Color        |
    * | 1 o 2    |  Amarilla     |
    * | 3 o 4    |  Rosa         |
    * | 5 o 6    |  Roja         |
    * | 7 o 8    |  Verde        |
    * | 9 o 0    |  Azul         |
    * |----------|---------------|
    */
    public static void Problema4() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de autos:"));
        int i = 0;
        int amarilla = 0;
        int rosa = 0;
        int roja = 0;
        int verde = 0;
        int azul = 0;
        while (i < n) {
            int digito = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el último dígito de la placa del auto " + (i + 1) + ":"));
            if (digito == 1 || digito == 2) {
                amarilla++;
            } else if (digito == 3 || digito == 4) {
                rosa++;
            } else if (digito == 5 || digito == 6) {
                roja++;
            } else if (digito == 7 || digito == 8) {
                verde++;
            } else if (digito == 9 || digito == 0) {
                azul++;
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "Calcomanías: Amarilla: " + amarilla + ", Rosa: " + rosa + ", Roja: " + roja + ", Verde: " + verde + ", Azul: " + azul);
    }

    //Ejercicio 5
    /*
     * Obtener el promedio de calificaciones de un grupo de n alumnos.
     */
    public static void Problema5() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de alumnos:"));
        int i = 0;
        double suma = 0;
        while (i < n) {
            double calificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación del alumno " + (i + 1) + ":"));
            suma += calificacion;
            i++;
        }
        double promedio = suma / n;
        JOptionPane.showMessageDialog(null, "El promedio de calificaciones es " + promedio);
    }

    //Ejercicio 6
    /*
    * Calcular el promedio de edades de hombres, mujeres y de todo un grupo de n alumnos.
    */
    public static void Problema6() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de alumnos:"));
        int i = 0;
        double sumaHombres = 0;
        double sumaMujeres = 0;
        int hombres = 0;
        int mujeres = 0;
        while (i < n) {
            String genero = JOptionPane.showInputDialog("Ingrese el género del alumno " + (i + 1) + " (M/F):");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del alumno " + (i + 1) + ":"));
            if (genero.equalsIgnoreCase("M")) {
                sumaHombres += edad;
                hombres++;
            } else if (genero.equalsIgnoreCase("F")) {
                sumaMujeres += edad;
                mujeres++;
            }
            i++;
        }
        double promedioHombres = sumaHombres / hombres;
        double promedioMujeres = sumaMujeres / mujeres;
        double promedioTotal = (sumaHombres + sumaMujeres) / n;
        JOptionPane.showMessageDialog(null, "Promedio de edades: Hombres: " + promedioHombres + ", Mujeres: " + promedioMujeres + ", Total: " + promedioTotal);
    }

    //Ejercicio 7
    /*
    * Encontrar el menor valor de un conjunto de n números dados.
    */
    public static void Problema7() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de números:"));
        int i = 0;
        double menor = Double.MAX_VALUE;
        while (i < n) {
            double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número " + (i + 1) + ":"));
            if (numero < menor) {
                menor = numero;
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "El menor valor es " + menor);
    }

    //Ejercicio 8
    /*
    * Encontrar el mayor valor de un conjunto de n números dados.
    */
    public static void Problema8() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de números:"));
        int i = 0;
        double mayor = Double.MIN_VALUE;
        while (i < n) {
            double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número " + (i + 1) + ":"));
            if (numero > mayor) {
                mayor = numero;
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "El mayor valor es " + mayor);
    }
}
