public class ViajeAutobus {
    public static void main(String[] args) {

        Autobus miBus = new Autobus(3, 320);
        System.out.println(miBus.precioViaje());

        Autobus tuBus = new Autobus(2, 160);
        System.out.println(tuBus.precioViaje());

        Autobus suBus = new Autobus(7, 750);
        System.out.println(suBus.precioViaje());
    }
}