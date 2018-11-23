public class CadenaDividida {
    public static void main(String[] args) {

        String cadena="En un lugar de la Mancha, cuyo nombre no quiero acordarme";
        int longitudTrozoCadena=3;


        /*char cadenaCaracter='a';
        for (int i = 0; i <cadena.length() ; i++) {
           cadenaCaracter=cadena.charAt(i);
           if (i%longitudTrozoCadena==0){
               System.out.println(" ");
           }
            System.out.print(cadenaCaracter);
        }*/


        //Primera solución
        int indicePrincipio=0;
        int indiceFinal=longitudTrozoCadena;
        while(indiceFinal<cadena.length()){
            System.out.println(cadena.substring(indicePrincipio, indiceFinal));
            indicePrincipio+=longitudTrozoCadena;
            indiceFinal+=longitudTrozoCadena;
        }
        System.out.println(cadena.substring(indicePrincipio));

        /*//Segunda forma
        String cadenaQueSePierde=cadena;
        while(cadenaQueSePierde.length()>longitudTrozoCadena){
            System.out.println(cadenaQueSePierde.substring(0, longitudTrozoCadena));
            cadenaQueSePierde=cadenaQueSePierde.substring(longitudTrozoCadena);
        }
        System.out.println(cadenaQueSePierde);*/

    }
}
