package cuentaBancaria;

public class operacionBancaria {
    public static void main(String[] args) {
        cuentaBuilder banc = new cuentaBuilder("000528932745", "marico aurelio", 99999, 15);
        cuentaBuilder cuenta2 = new cuentaBuilder("25052", "osky", 8, 67);
        System.out.println(banc.toString());
        System.out.println("modifica el titular");
        banc.modificadorTitular();
        System.out.println(banc.toString());
        System.out.println("modifica numero de cuenta");
        banc.modificadorNumeroCuenta();
        System.out.println(banc.toString());

        cuenta2.ingresoTransferencia(banc.transferencia());
        System.out.println(cuenta2.toString());
    }

}
