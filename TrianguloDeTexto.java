public class TrianguloDeTexto {
    public static void main(String[] args) {
        int numeroFilas=5;
        String texto="En un lugar de la Mancha";

        //Triangulo que va imprimiendo de 1 en 1+1 todos los caracteres de la frase hasta completarla

        /*for (int i = 0; i <texto.length() ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(texto.charAt(j));
            }
            System.out.println(texto.charAt(i));
        }*/


        //Triangulo de texto super raro; rellena con el texto al revés.

        /*for (int i = 0; i <=texto.length() ; i++) {
            for (int j = texto.length()-1; j >i ; j--) {
                System.out.print(texto.charAt(j));
            }
            System.out.println(texto.charAt(i));
        }*/



        for (int i = 0; i <numeroFilas; i++) {
            for (int j = 0; j < i; j++) {
                Utilidades.salidaMayusculaMinusculaLetraPorLetra(texto);
                System.out.print(" ");
            }
            Utilidades.salidaMayusculaMinusculaLetraPorLetra(texto+"\n");
        }

    }
}
