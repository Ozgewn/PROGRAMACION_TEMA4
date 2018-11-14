public class Domino {
    public static final int PUNTOS_MAXIMOS_POR_CARA=6;
    public static void main(String[] args) {

        int fichaUno;
        int fichaDos;

        for (fichaUno = 0; fichaUno <=PUNTOS_MAXIMOS_POR_CARA ; fichaUno++) {
            System.out.println(" x ");
            for (fichaDos = 0; fichaDos <=PUNTOS_MAXIMOS_POR_CARA ; fichaDos++) {

                System.out.println(fichaUno+" "+fichaDos);
            }
            System.out.println(" x ");
        }
    }
}