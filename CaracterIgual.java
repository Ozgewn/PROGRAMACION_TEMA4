public class CaracterIgual {

    private final char a;
    private final char b;

    public CaracterIgual(char a, char b) {
        this.a = a;
        this.b = b;
    }

    public char getA() {
        return a;
    }

    public char getB() {
        return b;
    }

    public String sonIguales() {
        String salida = "No son iguales";
        if (getA() == getB()) {
            return salida = "Los carácteres " + a + " y " + b + " son iguales";
        }
        return salida;
    }

    public String sonMinusculas() {
        String salida = "No son minúsculas\n";
        boolean esMinuscula = (Character.isLowerCase(getA()) && Character.isLowerCase(getB()));
        if (esMinuscula) {
            return salida = "Los dos carácteres son letras minúsculas";
        } else if (!esMinuscula) {
            salida += "Alguno de los carácteres no es una letra minúscula\n";
            if (!Character.isLowerCase(getA()) && Character.isLowerCase(getB())) {
                salida += "El carácter " + getA() + " no es una letra minúscula\n";
                salida += "El carácter " + getB() + " si es una letra minúscula\n";
            } else {
                salida += "El carácter " + getA() + " si es una letra minúscula\n";
                salida += "El carácter " + getB() + " no es una letra minúscula\n";
            }
        } else {
            salida += "Ocurrio un terrible error";
        }
        return salida;
    }
}
