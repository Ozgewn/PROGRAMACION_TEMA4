import javax.swing.*;

public class EjemploBucles {
    public static void main(String[] args) {

        int numero=1;
        while (numero<10){
            System.out.println("Numero "+numero);
            numero++;
        }

        do {
            numero--;
            System.out.println("Numero " + numero);
        }while (numero>0);

        //Pedir un numero que este entre el 1 y el 10

        int numeroLeido;
        boolean numeroEsValido;
        do {
            numeroLeido=Integer.parseInt(JOptionPane.showInputDialog("Número entre 1 y 10"));
            numeroEsValido=numeroLeido>=1 && numeroLeido<=10;
            if (!numeroEsValido){
                JOptionPane.showMessageDialog(null,"Número no válido");
            }
        }while (!numeroEsValido);
        JOptionPane.showMessageDialog(null,"Has introducido el "+numeroLeido);

        //uso del for

        //tres partes: inicialización, comprobación y actualización

        for (int i=0;i<10;i++){
            System.out.println(i);
        }

        //contar hacia atras

        for (int i=10;i>0;i--){
            System.out.println(i);
        }

        //Cuando dos variables estan muy relacionadas

        for (int i=0, j=10;i<10;i++,j--){
            System.out.println(i+" "+j);
        }

        //Podemos saber el numero de vueltas aunque no sea un numero fijo
        int numeroVueltas=Integer.parseInt(JOptionPane.showInputDialog("Introduce numero vueltas"));
        for (int i=0;i<=numeroVueltas;i++){
            System.out.println(i);
        }

        //Bucle infinito

        /*for (;;){
            System.out.println("Hola esto es infinito");
        }*/

        //Ejemplo bucles anidados

        int lado=Integer.parseInt(JOptionPane.showInputDialog("Tamaño del lado"));
        for (int i=0;i<lado;i++){
            for (int j = 0; j <lado ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
