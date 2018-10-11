public class PrueboNumeroMultiploDiez {
    public static void main(String[] args) {
        NumeroMultiploDeDiez miNumero = new NumeroMultiploDeDiez(50);
        System.out.println(miNumero.esMultiploDeDiez());
        miNumero.setNumero(5);
        System.out.println(miNumero.esMultiploDeDiez());
    }
}
