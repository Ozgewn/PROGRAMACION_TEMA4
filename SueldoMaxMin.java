import javax.swing.*;

public class SueldoMaxMin {
    public static void main(String[] args) {

        int sueldoMaximo = Integer.MIN_VALUE;
        int sueldoMinimo = Integer.MAX_VALUE;
        int introduceSueldo = 0;
        int sumaSueldo = 0;

        do {
            introduceSueldo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el sueldo: "));
            sumaSueldo += introduceSueldo;
            if (introduceSueldo < sueldoMinimo && introduceSueldo != 0) {
                sueldoMinimo = introduceSueldo;
                //System.out.println(sueldoMinimo);
            }
            if (introduceSueldo > sueldoMaximo) {
                sueldoMaximo = introduceSueldo;
                //System.out.println(sueldoMaximo);
            }
        } while (introduceSueldo != 0);
        System.out.println("El sueldo máximo es: " + sueldoMaximo);
        System.out.println("El sueldo mínimo es: " + sueldoMinimo);

    }
}
