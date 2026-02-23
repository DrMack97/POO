import java.util.Scanner;

public class Salarios {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        /////////////////////////////CALCULADORA DE SALARIOS////////////////////////////////////////////
        /// variables y entradas ////
        double horaL = 130;
        int Impuesto1 = 500;
        int Impuesto2 = 100;
        double Impuesto3 = 0.45;
        System.out.println("Nombre y Apellido");
            String nombre = Scanner.next();
        System.out.println("Ingrese total de horas ");
            int HoraT = Scanner.nextInt();
        //proceso
        double HorasExtras = HoraT - horaL;
        double SueldoBase = horaL * 15 - Impuesto1 - Impuesto2;
        double SueldoBruto = (HorasExtras * 1.5) + SueldoBase;
        double Sueldoimp123 = SueldoBruto * Impuesto3;
        double SueldoNeto = SueldoBruto - Sueldoimp123 + Impuesto1;
        //salida
        System.out.printf("\n Sueldo de " + nombre + " Corresponde: \n" + SueldoNeto);
        System.out.println(" Sueldo bruto: " + SueldoBruto);

    }

}
