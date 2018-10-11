public class pruebaNumeroMayor {
    public static void main(String[] args) {

        numeroMayor miNumero=new numeroMayor(2,5,7);
        System.out.println(miNumero.cualEsElNumeroMayor());
        miNumero.setNumeroTres(1);
        System.out.println(miNumero.cualEsElNumeroMayor());

        miNumero.setNumeroDos(1);
        miNumero.setNumeroUno(1);

        System.out.println(miNumero.cualEsElNumeroMayor());

    }
}
