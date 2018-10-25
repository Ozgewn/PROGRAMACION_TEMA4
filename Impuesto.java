import javax.swing.*;

public class Impuesto {

    public static void main(String[] args) {

        //leer salario
        int salario=Integer.parseInt(JOptionPane.showInputDialog("Salario: "));
        //calcular porcentaje
        int porcentajeImpuesto;
        if (salario<1000000){
            porcentajeImpuesto=5;
        }else if (salario<=2500000){
            porcentajeImpuesto=12;
        }else if (salario<=3800000){
            porcentajeImpuesto=15;
        }else if (salario<=6000000){
            porcentajeImpuesto=22;
        }else {
            porcentajeImpuesto=30;
        }

        //calcular montante porcentajeImpuesto
        int impuestoAPagar=salario*porcentajeImpuesto/100;
        //imprimir
        JOptionPane.showMessageDialog(null,"tienes que pagar: "+impuestoAPagar+" €");

    }

}
