public class Dados {
    public static final int CARAS_DADO_CLASICO=6;
    public static void main(String[] args) {

        int dadoUno;
        int dadoDos;

        for (dadoUno = 1; dadoUno <=CARAS_DADO_CLASICO ; dadoUno++) {
            System.out.println(" x ");
            for (dadoDos = 1; dadoDos <=CARAS_DADO_CLASICO ; dadoDos++) {
                System.out.println(dadoUno+" "+dadoDos);
            }
            System.out.println(" x ");
        }
    }
}