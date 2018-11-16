public class Ordenador {
    private static final int VELOCIDAD_POR_DEFECTO =3000 ;
    private final String marca;
    private final int velocidad;


    private static int ordenadoresCreados=0;

    public Ordenador(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
        ordenadoresCreados++;
    }

    public Ordenador(String marca){
        this(marca,VELOCIDAD_POR_DEFECTO);
    }
}
