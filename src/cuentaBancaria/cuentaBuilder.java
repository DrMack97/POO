package cuentaBancaria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class cuentaBuilder {
    private String numeroCuenta;
    private String titular;
    private double saldo;
    private double tipoInteres;
    private Scanner sc = new Scanner(System.in);

    public cuentaBuilder(String numeroCuenta, String titular, double saldo, double tipoInteres) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
        this.tipoInteres = tipoInteres;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    @Override
    public String toString() {
        return "$".repeat(50) + "ESTADO DE CUENTA" + "$".repeat(50)
                + "\n numeroCuenta: "+ numeroCuenta + "\n titular: " + titular + "\n saldo: " + (int)saldo
                + "\n tipoInteres: " +(int) tipoInteres;
    }

    // metodos
    // modificador de atributos
    public String modificadorNumeroCuenta() {
        String modicador = "0";
        try {
            modicador = sc.nextLine().toLowerCase().trim();
        } catch (InputMismatchException e) {
            e.printStackTrace();
            sc.nextLine().toLowerCase().trim();
        }
        return numeroCuenta = modicador;
    }

    public String modificadorTitular() {
        String modicador = "0";
        try {
            modicador = sc.nextLine().toLowerCase().trim();
        } catch (InputMismatchException e) {
            e.printStackTrace();
            sc.nextLine().toLowerCase().trim();
        }
        return titular = modicador;
    }

    public int readOpcions() {
        int opcion = -1;
        try {
            opcion = sc.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
            sc.nextInt();
        }
        return opcion;
    }

    public double ingreso() {
        double ingreso = 0;
        try {
            ingreso = sc.nextDouble();
        } catch (InputMismatchException e) {
            e.printStackTrace();
            sc.nextDouble();
        }
        return saldo += ingreso;
    }

    public double egreso() {
        double egreso = 0;
        try {
            egreso = sc.nextDouble();
        } catch (InputMismatchException e) {
            e.printStackTrace();
            sc.nextDouble();
        }
        return saldo -= egreso;
    }
    // simula una transferencia 
    // la variable transferencia es usada posteriormente 
    // para la funcion 'ingreso transferencia' (double pago)
    public double transferencia() {
        double transferencia = 0;
        System.out.println("Saldo actual: "+ saldo);
        System.out.println("cuanto desea transferir?");
        try {
            transferencia = sc.nextDouble();
        } catch (InputMismatchException e) {
            e.printStackTrace();
            sc.nextDouble();
        }
        saldo -= transferencia;
        System.out.println(" su saldo ahora es de "+ saldo);

        return (int)transferencia;
    }
    public double ingresoTransferencia(double pago){
        saldo += pago;
        System.out.println(" has recibido una transferencia de "+(int)pago);
        System.out.println(" su saldo actual es de "+(int) saldo);
        return (int)saldo;
    }

    public void ScannerCloser() {
        sc.close();
    }
}
