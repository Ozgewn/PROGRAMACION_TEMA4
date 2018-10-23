public class SalarioAnual {

    private double salarioMensual;
    private final int pagasAnuales;
    private static final int CANTIDAD_PAGAS_ANUALES_NORMALES = 14;


    public SalarioAnual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
        this.pagasAnuales = CANTIDAD_PAGAS_ANUALES_NORMALES;
    }

    public SalarioAnual(double salarioMensual, int pagasAnuales) {
        this.salarioMensual = salarioMensual;
        this.pagasAnuales = pagasAnuales;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    private double salarioAnual;

    private double salarioAnual() {
        salarioAnual = salarioMensual * pagasAnuales;
        return salarioAnual;
    }

    private double impuestoPagar;
    private static final double PRIMERA_CATEGORIA = (double) 5 / 100;
    private static final double SEGUNDA_CATEGORIA = (double) 12 / 100;
    private static final double TERCERA_CATEGORIA = (double) 15 / 100;
    private static final double CUARTA_CATEGORIA = (double) 22 / 100;
    private static final double QUINTA_CATEGORIA = (double) 30 / 100;

    private static final int PRIMER_RANGO_SUPERIOR = 1000000;
    private static final int SEGUNDO_RANGO_INFERIOR = 1000001;
    private static final int SEGUNDO_RANGO_SUPERIOR = 25000000;
    private static final int TERCER_RANGO_INFERIOR = 25000001;
    private static final int TERCER_RANGO_SUPERIOR = 38000000;
    private static final int CUARTO_RANGO_INFERIOR = 38000001;
    private static final int CUARTO_RANGO_SUPERIOR = 60000000;
    private static final int QUINTO_RANGO_INFERIOR = 60000001;


    private double impuestoPagar() {
        if (salarioAnual() <= PRIMER_RANGO_SUPERIOR) {
            impuestoPagar = PRIMERA_CATEGORIA;
        } else if (salarioAnual() >= SEGUNDO_RANGO_INFERIOR && salarioAnual() <= SEGUNDO_RANGO_SUPERIOR) {
            impuestoPagar = SEGUNDA_CATEGORIA;
        } else if (salarioAnual() >= TERCER_RANGO_INFERIOR && salarioAnual() <= TERCER_RANGO_SUPERIOR) {
            impuestoPagar = TERCERA_CATEGORIA;
        } else if (salarioAnual() >= CUARTO_RANGO_INFERIOR && salarioAnual() <= CUARTO_RANGO_SUPERIOR) {
            impuestoPagar = CUARTA_CATEGORIA;
        } else if (salarioAnual() >= QUINTO_RANGO_INFERIOR) {
            impuestoPagar = QUINTA_CATEGORIA;
        }
        return impuestoPagar;
    }

    private double cantidadPagar;

    private double cantidadPagar() {
        cantidadPagar = salarioAnual() * impuestoPagar();
        return cantidadPagar;
    }

    private static final int CIEN = 100;

    public String liquidacionImpuesto() {
        String salida = "";

        salida += "Tu salario mensual es de: ";
        salida += String.format("%.2f", getSalarioMensual()) + " €\n";
        salida += "El porcentaje de impuesto que te corresponde es ";
        salida += String.format("%.0f", impuestoPagar() * CIEN) + "%\n";
        salida += "La cantidad total a pagar es de: ";
        salida += String.format("%.2f", cantidadPagar());
        salida += " € al año";
        return salida;
    }

}
