import javax.swing.JOptionPane;

public class Ejercicio7_9 {
    public static void main(String[] args) {
        // declaracion de variables
        int seleccion;
        String despedida = "Gracias por usar el menu";

        // Menu
        seleccion = JOptionPane.showOptionDialog(null,
                "Menu de ejercicios de los Problemas Propuestos sobre Condicionales Compuestos \n\nSelecciona una opcion",
                "",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, new Object[] { "Ejercicio 7", "Ejercicio 8", "Ejercicio 9" }, null);

        switch (seleccion) {
            case 0:
                Problema7();
                JOptionPane.showMessageDialog(null, despedida);
                break;

            case 1:
                Problema8();
                JOptionPane.showMessageDialog(null, despedida);
                break;

            case 2:
                Problema9();
                JOptionPane.showMessageDialog(null, despedida);
                break;
        }
    }

    // Ejercicio 7
    /*
     * Tomando como base los resultados obtenidos en un laboratorio de análisis clínicos, 
     * un medico determina si una persona tiene anemia o no, lo cual depende de su nivel 
     * de hemoglobina en la sangre, de su edad y de su sexo. Si el nivel de hemoglobina 
     * que tiene una persona es menor que el rango que le corresponde, se determina su 
     * resultado como positivo y en caso contrario como negativo. La tabla en la que el 
     * medico se basa para obtener el resultado es la siguiente: 
     * |-----------------------|-----------------------------|
     * | Edad                  | Nivel de Hemoglobina (g)    |
     * |-----------------------|-----------------------------|
     * | 0 - 1 mes             | 13 - 26                     |     
     * | 1 - 6 meses           | 10 - 18                     |    
     * | 6 - 12 meses          | 11 - 15                     |     
     * | 1 - 5 años            | 11.5 - 15                   |
     * | 5 - 10 años           | 12.6 - 15.5                 |
     * | 10 - 15 años          | 13 - 15.5                   |
     * | Mujeres > 15 años     | 12 - 16                     |
     * | Hombres > 15 años     | 14 - 18                     |
     * |-----------------------|-----------------------------|
     */
    public static void Problema7() {
        // Declaracion de variables
        String edadStr = JOptionPane.showInputDialog("Ingrese la edad en meses o años:");
        String sexo = JOptionPane.showInputDialog("Ingrese el sexo (M/F):");
        String hemoglobinaStr = JOptionPane.showInputDialog("Ingrese el nivel de hemoglobina:");

        int edad = Integer.parseInt(edadStr);
        double hemoglobina = Double.parseDouble(hemoglobinaStr);
        boolean tieneAnemia = false;

        // Determinar si tiene anemia
        if (edad <= 1) {
            tieneAnemia = hemoglobina < 13;
        } else if (edad <= 6) {
            tieneAnemia = hemoglobina < 10;
        } else if (edad <= 12) {
            tieneAnemia = hemoglobina < 11;
        } else if (edad <= 60) {
            tieneAnemia = hemoglobina < 11.5;
        } else if (edad <= 120) {
            tieneAnemia = hemoglobina < 12.6;
        } else if (edad <= 180) {
            tieneAnemia = hemoglobina < 13;
        } else if (sexo.equalsIgnoreCase("F")) {
            tieneAnemia = hemoglobina < 12;
        } else if (sexo.equalsIgnoreCase("M")) {
            tieneAnemia = hemoglobina < 14;
        }

        // Mostrar resultado
        if (tieneAnemia) {
            JOptionPane.showMessageDialog(null, "El paciente tiene anemia.");
        } else {
            JOptionPane.showMessageDialog(null, "El paciente no tiene anemia.");
        }
    }

    // Ejercicio 8
    /*
     * Una institución educativa estableció un programa para estimular a los alumnos con buen rendimiento
     * académico y que, consiste en lo siguiente: 
     *      - Si el promedio es de 9.5 o más y el alumno es de preparatoria, entonces este podrá 
     *        cursar 55 unidades y se le hará un 25% de descuento. 
     * 
     *      - Si el promedio es mayor o igual a 9 pero menor que 9.5 y el alumno es de preparatoria, 
     *        entonces este podrá cursar 50 unidades y se le hará un 10% de descuento. 
     * 
     *      - Si el promedio es mayor que 7 y menor que 9 y el alumno es de preparatoria, este podrá 
     *        cursar 50 unidades y no tendrá ningún descuento. 
     * 
     *      - Si el promedio es de 7 o menor, el numero de materias reprobadas es de 0 a 3 y el alumno 
     *        es de preparatoria, entonces podrá cursar 45 unidades y no tendrá descuento. 
     * 
     *      - Si el promedio es de 7 o menor, el numero de materias reprobadas es de 4 o mas y el alumno 
     *        es de preparatoria, entonces podrá cursar 40 unidades y no tendrá ningún descuento. 
     * 
     *      - Si el promedio es mayor o igual a 9.5 y el alumno es de profesional, entonces podrá cursar 
     *        55 unidades y se le hará un 20% de descuento. 
     * 
     *      - Si el promedio es menor de 9.5 y el alumno es de profesional, entonces podrá cursar 55 
     *        unidades y no tendrá descuento. 
     * 
     * Obtener el total que tendrá que pagar un alumno si la colegiatura para alumnos de profesional 
     * es de $300 por cada cinco unidades y para alumnos de preparatoria es de $180 por cada cinco unidades. 
     */
    public static void Problema8() {
        // Declaracion de variables
        String promedioStr = JOptionPane.showInputDialog("Ingrese el promedio:");
        String nivelStr = JOptionPane.showInputDialog("Ingrese el nivel (preparatoria/profesional):");
        String reprobadasStr = JOptionPane.showInputDialog("Ingrese el numero de materias reprobadas (si aplica):");

        double promedio = Double.parseDouble(promedioStr);
        int reprobadas = reprobadasStr.isEmpty() ? 0 : Integer.parseInt(reprobadasStr);
        int unidades = 0;
        double descuento = 0;
        double costoPorUnidad = nivelStr.equalsIgnoreCase("preparatoria") ? 180.0 / 5 : 300.0 / 5;

        // Determinar unidades y descuento
        if (nivelStr.equalsIgnoreCase("preparatoria")) {
            if (promedio >= 9.5) {
                unidades = 55;
                descuento = 0.25;
            } else if (promedio >= 9) {
                unidades = 50;
                descuento = 0.10;
            } else if (promedio > 7) {
                unidades = 50;
            } else if (promedio <= 7 && reprobadas <= 3) {
                unidades = 45;
            } else if (promedio <= 7 && reprobadas >= 4) {
                unidades = 40;
            }
        } else if (nivelStr.equalsIgnoreCase("profesional")) {
            if (promedio >= 9.5) {
                unidades = 55;
                descuento = 0.20;
            } else {
                unidades = 55;
            }
        }

        // Calcular costo total
        double costoTotal = unidades * costoPorUnidad * (1 - descuento);

        // Mostrar resultado
        JOptionPane.showMessageDialog(null, "El total a pagar es: $" + costoTotal);
    }

    // Ejercicio 9
    /*
     * Que lea tres números diferentes y determine el numero medio del conjunto de los 
     * tres números (el numero medio es aquel numero que no es ni mayor, ni menor). 
     */
    public static void Problema9() {
        // Declaracion de variables
        String num1Str = JOptionPane.showInputDialog("Ingrese el primer numero:");
        String num2Str = JOptionPane.showInputDialog("Ingrese el segundo numero:");
        String num3Str = JOptionPane.showInputDialog("Ingrese el tercer numero:");

        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);
        int num3 = Integer.parseInt(num3Str);
        int medio = 0;

        // Determinar el numero medio
        if ((num1 > num2 && num1 < num3) || (num1 > num3 && num1 < num2)) {
            medio = num1;
        } else if ((num2 > num1 && num2 < num3) || (num2 > num3 && num2 < num1)) {
            medio = num2;
        } else {
            medio = num3;
        }

        // Mostrar resultado
        JOptionPane.showMessageDialog(null, "El numero medio es: " + medio);
    }
}
