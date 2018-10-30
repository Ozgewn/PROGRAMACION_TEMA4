public class Autobus {

    private final int pasajero;
    private final int km;
    private double billete;

    public Autobus(int pasajero, int km) {
        this.pasajero = pasajero;
        this.km = km;
    }

    public int getPasajero() {
        return pasajero;
    }

    public int getKm() {
        return km;
    }

    private static final int KM_VIAJE_CORTO = 200;
    private static final int PRECIO_MINIMO_BILLETE = 20;
    private static final int KM_VIAJE_LARGO_CON_DESCUENTO = 400;
    private static final double DESCUENTO_VIAJE_LARGO = 0.15;
    private static final double RECARGO_POR_KM_VIAJE_LARGO = 0.03;
    private static final int PASAJEROS_POR_GRUPO = 3;
    private static final double DESCUENTO_POR_GRUPOS = 0.10;

    public double getBillete() {
        if (getKm() <= KM_VIAJE_CORTO) {
            billete = PRECIO_MINIMO_BILLETE;
            if (getPasajero() >= PASAJEROS_POR_GRUPO) {
                billete -= (billete * DESCUENTO_POR_GRUPOS);
            }
        } else if (getKm() > KM_VIAJE_LARGO_CON_DESCUENTO) {
            billete = PRECIO_MINIMO_BILLETE + (RECARGO_POR_KM_VIAJE_LARGO * (getKm() - KM_VIAJE_CORTO));
            billete -= (billete * DESCUENTO_VIAJE_LARGO);
            if (getPasajero() >= PASAJEROS_POR_GRUPO) {
                billete -= (billete * DESCUENTO_POR_GRUPOS);
            }
        } else {
            billete = PRECIO_MINIMO_BILLETE + (RECARGO_POR_KM_VIAJE_LARGO * (getKm() - KM_VIAJE_CORTO));
            if (getPasajero() >= PASAJEROS_POR_GRUPO) {
                billete -= (billete * DESCUENTO_POR_GRUPOS);
            }
        }
        return billete;
    }

    private double precioViaje;

    public String precioViaje() {
        String salida = "";
        salida += "El número de pasajeros es: " + getPasajero() + "\n";
        salida += "El viaje es de " + getKm() + " km\n";
        salida += "El precio del billete individual es: ";
        salida += String.format("%.2f", getBillete()) + " €\n";
        salida += "El precio del viaje es: ";
        salida += String.format("%.2f", (getBillete()) * getPasajero()) + " €\n";
        return salida;
    }
}
