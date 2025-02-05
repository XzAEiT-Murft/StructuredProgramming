import javax.swing.JOptionPane;

public class ControlCalif3 {
    public static void main(String[] args) {
        //declaracion de variables
        double calif = 0.0;

        //solicitar datos
        calif = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa tu calificacion"));

        //Proceso
        if(calif >= 7.0){
            JOptionPane.showMessageDialog(null, "Estas aprobado");
        } else {
            JOptionPane.showMessageDialog(null, "Estas reprobado");
        }
    }
}
