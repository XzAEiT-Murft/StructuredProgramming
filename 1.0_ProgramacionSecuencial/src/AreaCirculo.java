import javax.swing.JOptionPane;

public class AreaCirculo {
    public static void main(String[] args) {
        final double pi = 3.1416;
        double radio = 0;
        double area = 0;


        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de radio"));
        area = pi * Math.pow(radio, 2);
        JOptionPane.showMessageDialog(null, "El area dek circulo con radio " + radio + " es " + area);

    }
}
