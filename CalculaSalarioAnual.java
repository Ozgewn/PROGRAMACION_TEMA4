public class CalculaSalarioAnual {
    public static void main(String[] args) {

        SalarioAnual miSalario = new SalarioAnual(60500.85);

        System.out.println(miSalario.liquidacionImpuesto());

        SalarioAnual tuSalario = new SalarioAnual(390000.478, 12);

        System.out.println(tuSalario.liquidacionImpuesto());

    }
}
