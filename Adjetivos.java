import javax.swing.*;

public class Adjetivos {
    public static void main(String[] args) {

        String nombre=JOptionPane.showInputDialog("Introduce un nombre");
        String adjetivos="";
        String salida="";
        String salir="FIN";

        while (!adjetivos.equalsIgnoreCase(salir)){
            adjetivos= JOptionPane.showInputDialog("Introduce el adjetivo: \"escribe: <<fin>> para salir\"");
            salida+=adjetivos+", ";
        }
        System.out.println(nombre+" es, "+salida.substring(0,salida.length()-5)+salir);
    }
}
