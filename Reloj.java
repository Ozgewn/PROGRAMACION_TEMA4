import javax.swing.*;

public class Reloj {

    private int hora;
    private int minutos;
    private int segundos;
    public char miSeparador=':';

    public Reloj(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
        this.miSeparador=getMiSeparador();
        contador++;
    }

    public Reloj(){
        this.hora=0;
        this.minutos=0;
        this.segundos=0;
        this.miSeparador=getMiSeparador();
        contador++;
    }
    private static int contador=0;

    public static String totalRelojes() {

        return ""+contador;
    }

    public static String esValida(int hora, int minutos, int segundos) {
        String salida="";

        boolean horaValida=hora>0 && hora<59;
        boolean minutosValidos=minutos>0 && minutos<59;
        boolean segundosValidos=segundos>0 && segundos<59;

        if (!horaValida && !minutosValidos && !segundosValidos){
            salida=" La hora es válida";
        }else {
            salida=" La hora NO es válida";
        }

        return salida;
    }

    public static char cambiaSeparador(char miSeparador) {
        return miSeparador;
    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public char getMiSeparador() {
        return miSeparador;
    }

    public void setMiSeparador(char miSeparador) {
        this.miSeparador = miSeparador;
    }

    public String devuelveHora(){
        String salida="";
        salida+=getHora()+""+getMiSeparador();
        salida+=getMinutos()+""+getMiSeparador();
        salida+=""+getSegundos();
        return salida;
    }

    public String leeHora(){
        hora= Integer.parseInt(JOptionPane.showInputDialog("Introduce hora de 0 a 23: "));
        minutos= Integer.parseInt(JOptionPane.showInputDialog("Introduce minutos de 0 a 59: "));
        segundos= Integer.parseInt(JOptionPane.showInputDialog("Introduce segundos de 0 a 59: "));
        String leeHora=hora+""+minutos+""+segundos;
        return leeHora;
    }

    public void ponHora(int hora,int minutos){
        this.hora=hora;
        this.minutos=minutos;
        this.segundos=0;
    }

    public void ponHora(int hora,int minutos,int segundos){
        this.hora=hora;
        this.minutos=minutos;
        this.segundos=segundos;
    }


    public void sumaTiempo(int hora, int minutos, int segundos) {
        this.hora=hora+getHora();
        this.minutos=minutos+getMinutos();
        this.segundos=segundos+getSegundos();
    }


}
