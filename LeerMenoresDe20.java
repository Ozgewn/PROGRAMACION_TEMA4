import javax.swing.*;

public class LeerMenoresDe20 {
    public static void main(String[] args) {
        int numeroLeido=Integer.parseInt(JOptionPane.showInputDialog(null,"numero? "));
        while (numeroLeido<=20){
            System.out.println(numeroLeido);
            numeroLeido=Integer.parseInt(JOptionPane.showInputDialog(null,"numero? "));
        }
    }
}
