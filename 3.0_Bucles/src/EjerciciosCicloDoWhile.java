//importamos libreria
import javax.swing.JOptionPane;

public class EjerciciosCicloDoWhile {
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
                null, new Object[]{"Ejercicio 1", "Ejercicio 2", "Ejercicio 3", "Salir"}, null
            );

            if (seleccion == 3 || seleccion == -1) {
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
            }
            
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea volver al menú?", 
            "Continuar", JOptionPane.YES_NO_OPTION);
            if (respuesta != 0) {
                continuar = false;
                JOptionPane.showMessageDialog(null, despedida);
            }
        } while(continuar);
    }

    // Ejercicio 1
    /*
    * En una tienda de descuento, los clientes sacan una bolita de color al momento de pagar,
    * la cual determina el descuento que recibirán en su compra.
    * - Roja: 40% de descuento
    * - Amarilla: 25% de descuento
    * - Blanca: Sin descuento
    * El programa debe calcular cuánto pagará cada cliente desde la apertura hasta el cierre de la tienda.
    */
    public static void Problema1() {
        double totalCompra = 0;
        double descuento = 0;
        boolean continuar = true;

        do {
            String[] opciones = {"Roja", "Amarilla", "Blanca"};
            int seleccion = JOptionPane.showOptionDialog(null, 
            "Seleccione el color de la bolita", 
                "Descuento", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, 
                null, opciones, opciones[0]);

            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de la compra:"));

            switch (seleccion) {
                case 0:
                    descuento = 0.40;
                    break;
                case 1:
                    descuento = 0.25;
                    break;
                case 2:
                    descuento = 0.0;
                    break;
            }

            totalCompra = precio - (precio * descuento);
            JOptionPane.showMessageDialog(null, "El total a pagar es: " + totalCompra);

            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra compra?", 
                "Continuar", JOptionPane.YES_NO_OPTION);
            if (respuesta != 0) {
                continuar = false;
            }
        } while (continuar);
    }

    // Ejercicio 2
    /*
    * En un supermercado, una ama de casa toma artículos y anota su precio junto con la cantidad adquirida.
    * El programa debe calcular el costo total de cada artículo y luego sumar el costo de todos los artículos
    * hasta que la señora decida que ha terminado sus compras.
    */
    public static void Problema2() {
        double totalCompra = 0;
        boolean continuar = true;

        do {
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del artículo:"));
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad adquirida:"));

            totalCompra += precio * cantidad;

            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea agregar otro artículo?", 
                "Continuar", JOptionPane.YES_NO_OPTION);
            if (respuesta != 0) {
                continuar = false;
            }
        } while (continuar);

        JOptionPane.showMessageDialog(null, "El total de la compra es: " + totalCompra);
    }

    // Ejercicio 3
    /*
    * Un teatro otorga descuentos según la edad de los clientes.
    * Se debe calcular cuánto dinero deja de percibir el teatro por cada categoría de edad.
    * - Categoría 1 (5-14 años): 35% de descuento
    * - Categoría 2 (15-19 años): 25% de descuento
    * - Categoría 3 (20-45 años): 10% de descuento
    * - Categoría 4 (46-65 años): 25% de descuento
    * - Categoría 5 (66 años en adelante): 35% de descuento
    * Además, los niños menores de 5 años no pueden ingresar al teatro.
    */
    public static void Problema3() {
        double totalDescuento = 0;
        boolean continuar = true;

        do {
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del cliente:"));
            double precioBoleto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del boleto:"));
            double descuento = 0;

            if (edad >= 5 && edad <= 14) {
                descuento = 0.35;
            } else if (edad >= 15 && edad <= 19) {
                descuento = 0.25;
            } else if (edad >= 20 && edad <= 45) {
                descuento = 0.10;
            } else if (edad >= 46 && edad <= 65) {
                descuento = 0.25;
            } else if (edad >= 66) {
                descuento = 0.35;
            } else {
                JOptionPane.showMessageDialog(null, "Los niños menores de 5 años no pueden ingresar al teatro.");
                continue;
            }

            totalDescuento += precioBoleto * descuento;

            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otro cliente?", 
                "Continuar", JOptionPane.YES_NO_OPTION);
            if (respuesta != 0) {
                continuar = false;
            }
        } while (continuar);

        JOptionPane.showMessageDialog(null, "El total de dinero dejado de percibir por descuentos es: " + totalDescuento);
    }
}