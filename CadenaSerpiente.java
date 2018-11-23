public class CadenaSerpiente {
    public static void main(String[] args) {

        String cadena="En lugar de la Mancha, cuyo nombre no quiero acordarme";
        String lineaSuperior="";
        String lineaInferior="";
        for (int i = 0; i < cadena.length(); i++) {
            if(i%2==0){
                lineaSuperior+=cadena.charAt(i);
                lineaInferior+=" ";
            } else {
                lineaInferior+=cadena.charAt(i);
                lineaSuperior+=" ";
            }
        }
        System.out.println(lineaSuperior);
        System.out.println(lineaInferior);

    }
}
