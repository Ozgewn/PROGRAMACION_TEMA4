public class FizzBuzz {
    public static void main(String[] args) {

        //Primera forma de hacerlo

        String salida = "";

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                salida += "FizzBuzz, ";
            } else if (i % 5 == 0) {
                salida += "Buzz, ";
            } else if (i % 3 == 0) {
                salida += "Fizz, ";
            } else {
                salida += i + ", ";
            }
        }
        System.out.println(salida.substring(0, salida.length() - 2));


        //Segunda forma de hacerlo:

        for (int i = 1; i <= 100; i++) {
            System.out.println((i % 3 == 0 || i % 5 == 0) ? ((i % 3 != 0) ? "Buzz" : (i % 5 != 0 ? "Fizz" : "BuzzFizz")) : "" + i);
        }
    }
}

/*
Escribe, en el lenguaje de programación que desees,
un programa que muestre en pantalla los números del 1 al 100,
sustituyendo los múltiplos de 3 por el palabro “Fizz” y, a su vez,
los múltiplos de 5 por “Buzz”. Para los guarismos que, al tiempo,
son múltiplos de 3 y 5, utiliza el combinado “FizzBuzz”.
*/
