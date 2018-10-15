public class Mes {
    private final int mes;

    public Mes(int mes, int anyo) {
        this.mes = mes;
        this.anyo = anyo;
    }

    public int getMes() {
        return mes;
    }

    private static final int TREINTA_Y_UN_DIA = 31;
    private static final int TREINTA_DIAS = 30;
    private static final int VEINTIOCHO_DIAS = 28;
    private static final int VEINTINUEVE_DIAS = 29;
    private static final int PRIMER_MES = 1;
    private static final int ULTIMO_MES = 12;
    private static final int VALOR_400 = 400;
    private static final int VALOR_100 = 100;
    private static final int DIVISIBLE_ENTRE_CUATRO = 4;
    private static final int RESTO_CERO = 0;

    private int anyo;
    private int numDias;

    public String compruebaMes() {
        String salida = "";
        if (getMes() >= PRIMER_MES && getMes() <= ULTIMO_MES) {
            salida += "El mes es correcto\n";
            switch (mes) {
                case 1:
                    salida += "Enero\n";
                    break;
                case 2:
                    salida += "Febrero\n";
                    break;
                case 3:
                    salida += "Marzo\n";
                    break;
                case 4:
                    salida += "Abril\n";
                    break;
                case 5:
                    salida += "Mayo\n";
                    break;
                case 6:
                    salida += "Junio\n";
                    break;
                case 7:
                    salida += "Julio\n";
                    break;
                case 8:
                    salida += "Agosto\n";
                    break;
                case 9:
                    salida += "Septiembre\n";
                    break;
                case 10:
                    salida += "Octubre\n";
                    break;
                case 11:
                    salida += "Noviembre\n";
                    break;
                case 12:
                    salida += "Diciembre\n";
                    break;
            }
            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    numDias = TREINTA_Y_UN_DIA;
                    salida += "El mes tiene 31 días";
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    numDias = TREINTA_DIAS;
                    salida += "El mes tiene 30 días";
                    break;
                case 2:
                    salida += "Febrero\n";
                    if (((anyo % DIVISIBLE_ENTRE_CUATRO == RESTO_CERO) && !(anyo % VALOR_100 == RESTO_CERO))
                            || (anyo % VALOR_400 == RESTO_CERO)) {
                        numDias = VEINTINUEVE_DIAS;
                        salida += "El mes tiene 29 días porque es año bisiesto";
                    } else {
                        numDias = VEINTIOCHO_DIAS;
                        salida += "El mes tiene 28 días";
                        break;
                    }
            }
        } else {
            salida = "No es un mes correcto";
        }
        return salida;
    }
}
