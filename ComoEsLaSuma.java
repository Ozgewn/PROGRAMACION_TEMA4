public class ComoEsLaSuma {
    private int a;
    private int b;

    public ComoEsLaSuma(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    private int SumaNumeros() {
        return a + b;
    }

    public String MuestroResultado() {
        if (SumaNumeros() == 0) {
            return "La suma de " + getA() + " + " + getB() + " = 0 es CERO";
        } else if (SumaNumeros() >= 0) {
            return "La suma de " + getA() + " + " + getB() + " = " + SumaNumeros() + " POSITIVO";
        } else {
            return "La suma de " + getA() + " + " + getB() + " = " + SumaNumeros() + " NEGATIVO";
        }

    }
}
