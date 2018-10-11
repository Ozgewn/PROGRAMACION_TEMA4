public class EjemploTres {
    public static void main(String[] args) {
        int numero=100;
        if (numero<103){
            int dentroAmbito=3;
            System.out.println("*Dentro del bloque");
            System.out.println("dentroambito= "+dentroAmbito+" numero= "+numero);
        }//cierra el bloque del if
        //System.out.println("Fuera del bloque "+dentroAmbito); //***Error ya que dentroAmbito solo existe dentro del if
        System.out.println("\n\n*Fuera del bloque\n"+"Solo existe numero "+numero);
    }//cierra el bloque del main
}//cierrra la clase
