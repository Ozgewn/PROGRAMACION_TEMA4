import javax.swing.*;

public class Adjetivos {
    public static void main(String[] args) {

        String nombre=JOptionPane.showInputDialog("Introduce un nombre");
        String adjetivos="";
        String ultimoAdjetivo="";
        String salida=nombre+" es ";
        String fin="FIN";

        while (!adjetivos.equalsIgnoreCase(fin)){
            if (adjetivos!=fin){
                ultimoAdjetivo=adjetivos;
            }
            adjetivos= JOptionPane.showInputDialog("Introduce el adjetivo: \"escribe: <<fin>> para salir\"");
            salida+=adjetivos+", ";
        }

        String salidaBuena=salida.substring(0,salida.length()-7);
        salidaBuena=salidaBuena.substring(0,salidaBuena.length()-5);

        System.out.println(salidaBuena+" y "+ultimoAdjetivo+". "+fin);

    }
}