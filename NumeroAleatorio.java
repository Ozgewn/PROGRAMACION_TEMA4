import java.util.concurrent.ThreadLocalRandom;

public class NumeroAleatorio {

    private int ValorMin;
    private int ValorMax;

    public NumeroAleatorio(int valorMin, int valorMax) {
        ValorMin = valorMin;
        ValorMax = valorMax;
    }

    private int numeroRandom;

    public int getNumeroRandom() {
        return numeroRandom;
    }

    public int GeneraNumeroAleatorio() {
        numeroRandom = ThreadLocalRandom.current().nextInt(ValorMin, ValorMax);
        return numeroRandom;
    }


    public String MostrarDatos() {

        return GeneraNumeroAleatorio() + " Es el número generado";
    }

    private int contadorDeFallos;

    public int getContadorDeFallos() {
        return contadorDeFallos++;
    }

    public String PreguntarPorNumero() {
        String salida = "<html>";
        salida += "<h2 style=\"color:#" + "0404B4\">";
        salida += "¿Cual es el número aleatorio generado en el rango " + ValorMin + " - " + ValorMax + "?" + "</h2>";
        salida += "</html>";
        contadorDeFallos = 0;
        return salida;
    }

    private int respuestaNumero;


    public void setRespuestaNumero(int respuestaNumero) {
        this.respuestaNumero = respuestaNumero;
        //System.out.println(respuestaNumero);
    }

    public int getRespuestaNumero() {
        return respuestaNumero;
    }

    public String mensajeAciertoPrimera() {
        String salida = "<html>";
        salida += "<h2 style=\"color:#" + "99FF00\">" + "\"Has acertado con el número a la primera FELICIDADES!!!" + "</h2>";
        salida += "</html>";
        return salida;
    }

    public String mensajeAciertoBucle() {
        String salida = "<html>";
        salida += "<h2 style=\"color:#" + "B4045F\">" + "Por fín aciertas" + "</h2><br>";
        salida += "<h3 style=\"color:#" + "FE642E\">" + "Fallaste con el número " + getContadorDeFallos() + " veces" + "</h3>";
        salida += "</html>";
        return salida;
    }


}