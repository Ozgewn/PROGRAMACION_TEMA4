public class Persona {
    private String nombre;
    private String apellido;

    private static String tratamiento="Sr./Sra.";

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String encabezadoCarta(){
        return "\t"+tratamiento+" "+this.apellido+", "+this.nombre;
    }

    private static void cambiaTratamiento(String tratamiento){
        Persona.tratamiento=tratamiento;
    }

    public static void enIngles(){
        Persona.cambiaTratamiento("Mr./Ms.");
    }

    public static void enEspañol(){
        Persona.cambiaTratamiento("Sr./Sra.");
    }
}
