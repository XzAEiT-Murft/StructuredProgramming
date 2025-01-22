import javax.swing.JOptionPane;

public class Operadores {
    public static void main(String[] args) {
        double a = 0, b = 0, x = 0, y = 0, z = 0;
        double r = 0, r2 = 0, r3 = 0, r4 = 0, r5 = 0;
        //double e1 = 2 + 5 * 3 / 2.0 + 5 * (2 + 2);
        a = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de a: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de b: "));
        x = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de x: "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de y: "));
        z = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de z: "));

        String salida = "";

        r = Math.pow(a + Math.pow(y , z + 1) / (x - 1), 2); 
        r2 = Math.pow(Math.sqrt(Math.pow((a-b), 2)) / (a * x), z-1);
        r3 = 1.0 / Math.sqrt(Math.pow(x, 2) - (4 * 2));
        r4 = Math.pow(a + Math.pow(y, z + 1), 2);
        r5 =  (y - 3) / Math.pow(x, 5);

        salida = "El resultado de la expresion 1 es " + r
        + "\nEl resultado de la expersion 2 es" + r2
        + "\ny El resultado de la expresion 2 es " + r3;

        JOptionPane.showMessageDialog(null, salida);
    }
}
 