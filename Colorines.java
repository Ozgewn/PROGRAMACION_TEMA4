import javax.swing.*;

public class Colorines {
    public static void main(String[] args) {
        String salida = "";
        int numeroActual = 9;
        salida += "<html><h1>Números</h1><br>";
        while (numeroActual > 0){
            salida += "<h2 style=\"color:#" + numeroActual + numeroActual + "FF00\">" + numeroActual + "</h2>";
        numeroActual--;
    }
        salida+="</html>";
        JOptionPane.showMessageDialog(null,salida);
               
    }
}
