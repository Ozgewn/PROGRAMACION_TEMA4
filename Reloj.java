import javax.swing.*;

public class Reloj {

    private int hora;
    private int minutos;
    private int segundos;
    public static char SEPARADOR=':';
    private static int CONTADOR=0;


    public Reloj(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
        CONTADOR++;
    }

    public Reloj(){
        this.hora=0;
        this.minutos=0;
        this.segundos=0;
        this.SEPARADOR =getSEPARADOR();
        CONTADOR++;
    }

    public static int totalRelojes() {
        return CONTADOR;
    }

    public static String esValida(int hora, int minutos, int segundos) {
        String salida;

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

    public static char cambiaSeparador(char separador) {
        Reloj.SEPARADOR = separador;
        return separador;
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

    public static char getSEPARADOR() {
        return SEPARADOR;
    }

    public static void setSEPARADOR(char SEPARADOR) {
        Reloj.SEPARADOR = SEPARADOR;
    }

    public String devuelveHora(){
        String salida="";
        salida+=" "+getHora()+""+getSEPARADOR();
        salida+=getMinutos()+""+getSEPARADOR();
        salida+=""+getSegundos();
        return salida;
    }

    public String leeHora() {
        setHora(Integer.parseInt(JOptionPane.showInputDialog("Escribe la hora con formato de 0 a 23")));
        setMinutos(Integer.parseInt(JOptionPane.showInputDialog("Escribe los minutos con formato de 0 a 59")));
        setSegundos(Integer.parseInt(JOptionPane.showInputDialog("Escribe los segundos con formato de 0 a 59")));

        String salida = "";
        salida+=getHora();
        salida+=getMinutos();
        salida+=getSegundos();
        return salida;
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
        this.segundos=getSegundos()+segundos;
        if(this.segundos>=60){
            this.segundos=getSegundos()-60;
            minutos++;
        }
        this.minutos=getMinutos()+minutos;
        if (this.minutos>=60){
            this.minutos=getMinutos()-60;
            hora++;
        }
        this.hora=getHora()+hora;
    }
}
