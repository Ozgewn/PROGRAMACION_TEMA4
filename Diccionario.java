import javax.swing.*;

public class Diccionario {
    public static void main(String[] args) {

        String primeraPalabra="";//aba
        String ultimaPalabra="";//zuzón
        String salida="";

        int numeroPalabras=Integer.parseInt(JOptionPane.showInputDialog("Introduce cuantas palabras vas a introducir: "));

        for (int i =0; i<numeroPalabras; i++) {
            String palabraIntroducida = JOptionPane.showInputDialog("Introduce palabra: ");

            if ("aba".compareToIgnoreCase(palabraIntroducida.substring(0, 2))>=0) {
                primeraPalabra = palabraIntroducida;
                //salida+="La primera palabra es: "+primeraPalabra+"\n";

            }

            if ("zuzón".compareToIgnoreCase(palabraIntroducida.substring(0, 2))>=0) {
                ultimaPalabra = palabraIntroducida;
                //salida+="La última palabra es: "+ultimaPalabra+"\n";

            }


        }

         salida+="La primera palabra es: "+primeraPalabra+"\n";
         salida+="La última palabra es: "+ultimaPalabra+"\n";



        JOptionPane.showMessageDialog(null,salida);
    }
}
