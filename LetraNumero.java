public class LetraNumero {
    private char caracter;
    private final boolean esMayuscula;
    private final boolean esMinuscula;
    private final boolean esNumero;

    public LetraNumero(char caracter) {
        this.caracter = caracter;
        esMayuscula = getCaracter() >= 'A' && getCaracter() <= 'Z';
        esMinuscula = getCaracter() >= 'a' && getCaracter() <= 'z';
        esNumero = getCaracter() >= '0' && getCaracter() <= '9';
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public final String caracterEs() {
        if (esMayuscula) {
            return caracter + " Es una letra MAYÚSCULA";
        } else if (esMinuscula) {
            return caracter + " Es una letra MINÚSCULA";
        } else if (esNumero) {
            return caracter + " Es un NÚMERO";
        } else {
            return caracter + " Es un carácter raro";
        }
    }
}
