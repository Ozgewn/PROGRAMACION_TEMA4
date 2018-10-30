import javax.swing.*;

public class NumeroParImparBucle {
    public static void main(String[] args) {

        int numeroLeido = 0;

        do {
            numeroLeido = Integer.parseInt(JOptionPane.showInputDialog("numero? "));
            if (numeroLeido % 2 == 0 && numeroLeido != 0) {
                System.out.println("El número " + numeroLeido + " es PAR");
            } else if (numeroLeido == 0) {
                System.out.println("El número introducido es el CERO");
            } else {
                System.out.println("El número " + numeroLeido + " es IMPAR");
            }
        } while (numeroLeido != 0);
    }
}
