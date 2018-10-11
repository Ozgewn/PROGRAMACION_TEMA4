public class ParImpar {
    private int numero;
    private static final int CERO = 0;
    private static final int DOS = 2;

    public ParImpar(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String esParOesImpar() {
        if (numero % DOS == CERO && numero != CERO) {
            return "El número " + getNumero() + " es PAR";
        } else if (numero == CERO) {
            return "El número introducido es el CERO";
        } else {
            return "El número " + getNumero() + " es IMPAR";
        }
    }
}
