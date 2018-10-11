public class NumeroMultiploDeDiez {

    private int numero;
    private static final int DIEZ = 10;
    private static final int CERO = 0;


    public NumeroMultiploDeDiez(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String esMultiploDeDiez() {
        if (numero % DIEZ == CERO) {
            return "El número " + numero + " es MULTIPLO de " + DIEZ;
        } else {
            return "El número " + numero + " NO es MULTIPLO de " + DIEZ;
        }
    }
}
