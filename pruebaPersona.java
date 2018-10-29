public class pruebaPersona {
    public static void main(String[] args) {

        Persona miPersona=new Persona("Ana","López");
        System.out.println(miPersona.encabezadoCarta());
        Persona.enIngles();
        System.out.println(miPersona.encabezadoCarta());
        Persona.enEspañol();
        System.out.println(miPersona.encabezadoCarta());
    }
}
