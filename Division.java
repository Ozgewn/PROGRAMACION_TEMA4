public class Division {
    private final int primerNumero;
    private final int segundoNumero;
    private static final int CERO = 0;

    public Division(int primerNumero, int segundoNumero) {
        this.primerNumero = primerNumero;
        this.segundoNumero = segundoNumero;
    }

    public int getPrimerNumero() {
        return primerNumero;
    }

    public int getSegundoNumero() {
        return segundoNumero;
    }

    public String comprobarDivisor() {
        String salida = "";
        if (getSegundoNumero() == CERO) {
            salida += "Debe cambiar el divisor\n";
            salida += "El 0 no es un valor admisible";
        } else {
            salida = "Resultado de la división: " + getPrimerNumero() / getSegundoNumero();
        }
        return salida;
    }
}
