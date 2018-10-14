import javax.swing.*;

public class JuegoNumeroAleatorio {

    public static void main(String[] args) {

        NumeroAleatorio miNumero = new NumeroAleatorio(1, 10);
        miNumero.MostrarDatos();
        JOptionPane.showMessageDialog(null, miNumero.PreguntarPorNumero(), "Pregunta", JOptionPane.INFORMATION_MESSAGE);
        miNumero.setRespuestaNumero(Integer.parseInt(JOptionPane.showInputDialog("Introduce numero")));
        if (miNumero.getRespuestaNumero() != miNumero.getNumeroRandom()) {
            while (miNumero.getRespuestaNumero() != miNumero.getNumeroRandom()) {
                miNumero.setRespuestaNumero(Integer.parseInt(JOptionPane.showInputDialog("Introduce otro número")));
                miNumero.getContadorDeFallos();
            }

            JOptionPane.showMessageDialog(null, miNumero.mensajeAciertoBucle(), "Acertaste con fallos", JOptionPane.WARNING_MESSAGE);

        } else {

            JOptionPane.showMessageDialog(null, miNumero.mensajeAciertoPrimera(), "PITICLÍN", JOptionPane.INFORMATION_MESSAGE);

        }
    }
}
