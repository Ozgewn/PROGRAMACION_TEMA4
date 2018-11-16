import javax.swing.*;

public class palabraCortaLargaRepetida {
    public static void main(String[] args) {

        int longitudMaxima=0;
        String palabraActual="";
        String palabrasMaxima="";
        while (!"FIN".equalsIgnoreCase(palabraActual)){
            if (palabraActual.length()>longitudMaxima){
                longitudMaxima=palabraActual.length();
                palabrasMaxima=palabraActual+", ";

            }else if (palabraActual.length()==longitudMaxima){
                palabrasMaxima+=palabraActual+", ";
            }
            palabraActual= JOptionPane.showInputDialog("Palabra: ");
        }
        palabrasMaxima=palabrasMaxima.substring(0,palabrasMaxima.length()-2);
        System.out.println(palabrasMaxima+" tiene(n) "+longitudMaxima+" caracteres");
    }
}
