public class EjemploUno {
    public static void main(String[] args) {

        int i=3;
        int j=4;
        boolean etiqueta=true;

        if((i==3)&&(j==4)){
            System.out.println("La condición se cumple");
        }else{
            System.out.println("La condición no se cumple");
        }
        if ((i==1)||(j==4)){
            System.out.println("La condición se cumple");
        }else{
            System.out.println("La condición no se cumple");
        }
        if (!etiqueta){
            System.out.println("La condición se cumple");
        }else{
            System.out.println("La condición no se cumple");
        }
    }
}
