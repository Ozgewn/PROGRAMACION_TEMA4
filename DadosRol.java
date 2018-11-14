public class DadosRol {
    public static void main(String[] args) {

        int dadoUno;
        int dadoDos;
        int carasDado=4;

        for (dadoUno = 1; dadoUno <=carasDado ; dadoUno++) {
            System.out.println(" x ");
            for (dadoDos = 1; dadoDos <=carasDado ; dadoDos++) {
                System.out.println(dadoUno+" "+dadoDos);
            }
            System.out.println(" x ");
        }


        //dados distintos

        int carasDadoUno=4;
        int carasDadoDos=12;

        for (dadoUno = 1; dadoUno <=carasDadoUno ; dadoUno++) {
            System.out.println(" x ");
            for (dadoDos = 1; dadoDos <=carasDadoDos ; dadoDos++) {
                System.out.println(dadoUno+" "+dadoDos);
            }
            System.out.println(" x ");
        }
    }
}
