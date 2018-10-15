public class HMS {
    private final int h;
    private final int m;
    private final int s;

    private static final int VEINTICUATRO_HORAS = 24;
    private static final int SESENTA_MINUTOS = 60;
    private static final int SESENTA_SEGUNDOS = 60;


    public HMS(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public int getH() {
        if (h >= VEINTICUATRO_HORAS) {
            return (h % VEINTICUATRO_HORAS) + m / SESENTA_MINUTOS;
        }
        return h;
    }

    public int getM() {
        if (m >= SESENTA_MINUTOS) {
            return (m % SESENTA_MINUTOS + 1) + s / SESENTA_MINUTOS;
        }
        return m;

    }

    public int getS() {
        if (s >= SESENTA_SEGUNDOS) {
            return s % SESENTA_SEGUNDOS;
        }
        return s;
    }

    private String separador = " : ";

    public String getSeparador() {
        return separador;
    }

    public void setSeparador(String separador) {
        this.separador = separador;
    }

    public String mostrarHMS() {
        String salida = "";
        salida += getH() + getSeparador() + getM() + getSeparador() + getS();
        return salida;
    }

    public String mostrarHMSExtendido() {
        String salida = "";
        salida += "Son las " + getH() + " horas ";
        salida += getM() + " minutos y ";
        salida += getS() + " segundos";
        return salida;
    }

}
