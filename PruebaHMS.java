public class PruebaHMS {
    public static void main(String[] args) {
        HMS miHora = new HMS(35, 65, 70);
        System.out.println(miHora.mostrarHMS());
        miHora.setSeparador(" - ");
        System.out.println(miHora.mostrarHMSExtendido());
    }
}
