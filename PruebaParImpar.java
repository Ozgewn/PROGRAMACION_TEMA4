public class PruebaParImpar {
    public static void main(String[] args) {

        ParImpar miNumero = new ParImpar(5);
        System.out.println(miNumero.esParOesImpar());
        miNumero.setNumero(8);
        System.out.println(miNumero.esParOesImpar());
        miNumero.setNumero(0);
        System.out.println(miNumero.esParOesImpar());
    }
}
