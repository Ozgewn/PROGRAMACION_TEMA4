public class numeroMayor {
    private int numeroUno;
    private int numeroDos;
    private int numeroTres;

    public numeroMayor(int numeroUno, int numeroDos, int numeroTres) {
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
        this.numeroTres = numeroTres;
    }

    public int getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(int numeroUno) {
        this.numeroUno = numeroUno;
    }

    public int getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(int numeroDos) {
        this.numeroDos = numeroDos;
    }

    public int getNumeroTres() {
        return numeroTres;
    }

    public void setNumeroTres(int numeroTres) {
        this.numeroTres = numeroTres;
    }

    private boolean operacionUno() {
        return numeroUno > numeroDos && numeroUno > numeroTres;
    }

    private boolean operacionDos() {
        return numeroDos > numeroUno && numeroDos > numeroTres;
    }

    private boolean operacionTres() {
        return numeroTres > numeroUno && numeroTres > numeroDos;
    }

    private static final String MAYOR = " Es el MAYOR";
    private static final String IGUAL = "Puede que haya un error o sean IGUALES";

    public String cualEsElNumeroMayor() {
        if (operacionUno()) {
            return "El número uno: " + getNumeroUno() + MAYOR;
        } else if (operacionDos()) {
            return "El número dos: " + getNumeroDos() + MAYOR;
        } else if (operacionTres()) {
            return "El número tres: " + getNumeroTres() + MAYOR;
        } else {
            return IGUAL;
        }
    }
}
