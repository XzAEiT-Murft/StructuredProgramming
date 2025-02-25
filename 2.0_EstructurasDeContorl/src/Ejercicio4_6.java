import javax.swing.JOptionPane;

public class Ejercicio4_6 {
    public static void main(String[] args) {
        //declaracion de variables
        int seleccion;
        String despedida= "Gracias por usar el menu";

        //Menu
        seleccion = JOptionPane.showOptionDialog(null, 
        "Menu de ejercicios de los Problemas Propuestos sobre Condicionales Compuestos \n\nSelecciona una opcion", "",
        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
        null, new Object[] {"Ejercicio 4", "Ejercicio 5", "Ejercicio 6" }, null
        );

        switch (seleccion) {
            case 0:
            Problema4();
            JOptionPane.showMessageDialog(null, despedida);
            break;

            case 1:
            Problema5();
            JOptionPane.showMessageDialog(null, despedida);
            break;

            case 2:
            Problema6();
            JOptionPane.showMessageDialog(null, despedida);
            break;
        }
    }

    //Ejercicio 4
    /*
     * Un proveedor de estéreos ofrece un descuento del 10% sobre el precio sin IVA, 
     * de algún aparato si este cuesta $2000 o mas. Además, independientemente de esto, 
     * ofrece un 5% de descuento si la marca es "NOSY". Determinar cuanto pagara, con IVA incluido, 
     * un cliente cualquiera por la compra de su aparato.  
     */
    public static void Problema4() {
        //Declaracion de variables
        double precio, descuento = 0, precioConDescuento, precioConIva;
        String marca;

        //Ingreso de datos
        precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio del estereo"));
        marca = JOptionPane.showInputDialog(null, "Ingrese la marca del estereo");

        //Calculo de descuento
        if (precio >= 2000) {
            descuento += 0.10;
        }
        if (marca.equalsIgnoreCase("NOSY")) {
            descuento += 0.05;
        }

        //Aplicar descuento
        precioConDescuento = precio - (precio * descuento);

        //Calculo de IVA (16%)
        precioConIva = precioConDescuento * 1.16;

        //Mostrar resultado
        JOptionPane.showMessageDialog(null, "El precio final con IVA incluido es: $" + precioConIva);
    }

    //Ejercicio 5
    /*
     * Una frutería ofrece las manzanas con descuento según la siguiente tabla: 
     * |--------------------------|----------|
     * |Numero de kilos comprados | Descuento|
     * |--------------------------|----------|
     * |0 - 2                     | 0%       |
     * |2.01 - 5                  | 10%      |
     * |5.01 - 10                 | 15%      |
     * |10.01 en adelante         | 20%      |
     * |--------------------------|----------|
     * Determinar cuanto pagara una persona que compre manzanas es esa frutería. 
     */
    public static void Problema5() {
        //Declaracion de variables
        double kilos, precioPorKilo = 3.0, descuento = 0, precioFinal;

        //Ingreso de datos
        kilos = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el numero de kilos de manzanas"));

        //Calculo de descuento
        if (kilos > 2 && kilos <= 5) {
            descuento = 0.10;
        } else if (kilos > 5 && kilos <= 10) {
            descuento = 0.15;
        } else if (kilos > 10) {
            descuento = 0.20;
        }

        //Calculo del precio final
        precioFinal = kilos * precioPorKilo * (1 - descuento);

        //Mostrar resultado
        JOptionPane.showMessageDialog(null, "El precio final es: $" + precioFinal);
    }

    //Ejercicio 6
    /*
     * El dueño de una empresa desea planificar las decisiones financieras que tomara 
     * en el siguiente año. La manera de planificarlas depende de lo siguiente: 
     * Si actualmente su capital se encuentra con saldo negativo, pedirá un préstamo 
     * bancario para que su nuevo saldo sea de $10 000. Si su capital tiene actualmente un 
     * saldo positivo pedirá un préstamo bancario para tener un nuevo saldo de $20 000, pero 
     * si su capital tiene actualmente un saldo superior a los $20 000 no pedirá ningún préstamo. 
     * Posteriormente repartirá su presupuesto de la siguiente manera. 
     * $5 000 para equipo de computo 
     * $2 000 para mobiliario
     * y el resto la mitad será para la compra de insumos y la otra para otorgar al personal.
     * Desplegar que cantidades se destinaran para la compra de insumos e incentivos al personal y, 
     * en caso de que fuera necesario, a cuanto ascendería la cantidad que se pediría al banco. 
     */
    public static void Problema6() {
        //Declaracion de variables
        double capital, prestamo = 0, nuevoSaldo, insumos, incentivos;

        //Ingreso de datos
        capital = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el capital actual de la empresa"));

        //Calculo del nuevo saldo
        if (capital < 0) {
            prestamo = 10000 - capital;
            nuevoSaldo = 10000;
        } else if (capital >= 0 && capital <= 20000) {
            prestamo = 20000 - capital;
            nuevoSaldo = 20000;
        } else {
            nuevoSaldo = capital;
        }

        //Distribucion del presupuesto
        double restante = nuevoSaldo - 7000; // 5000 para equipo de computo y 2000 para mobiliario
        insumos = restante / 2;
        incentivos = restante / 2;

        //Mostrar resultado
        String mensaje = "Distribucion del presupuesto:\n" +
                         "Equipo de computo: $5000\n" +
                         "Mobiliario: $2000\n" +
                         "Compra de insumos: $" + insumos + "\n" +
                         "Incentivos al personal: $" + incentivos;
        if (prestamo > 0) {
            mensaje += "\nCantidad pedida al banco: $" + prestamo;
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
