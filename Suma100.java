import javax.swing.*;

public class Suma100 {
    public static void main(String[] args) {
        int sumaNumeros = 0;
        do {
            int numeroIntroducido = Integer.parseInt(JOptionPane.showInputDialog("Introduce número: "));
            System.out.println(numeroIntroducido);
            sumaNumeros += numeroIntroducido;

        } while (sumaNumeros <= 100);
        System.out.println(sumaNumeros);
    }
}
