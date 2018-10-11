public class NumeroEntre10y20 {
    private int numero;
    private static final int LIMITE_INFERIOR=10;
    private static final int LIMITE_SUPERIOR=20;


    NumeroEntre10y20(int numero){
        this.numero=numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String mostrarResultado(){

        if (getNumero()>=LIMITE_INFERIOR && getNumero()<=LIMITE_SUPERIOR){
            return "El número "+getNumero()+" se encuentra dentro de "+LIMITE_INFERIOR+" y "+LIMITE_SUPERIOR;
        }else if (numero<LIMITE_INFERIOR){
            return "El número "+getNumero()+" es más pequeño que el "+LIMITE_INFERIOR;
        }else{
            return "El número "+getNumero()+" es más grande que el "+LIMITE_SUPERIOR;
        }
    }
}
