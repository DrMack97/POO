import carpetaClasesBancarias.cliente;
import carpetaClasesBancarias.cuentaBancaria;
import carpetaClasesBancarias.operacion;

public class sistemaBancarioTest {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA BANCARIO REDISEÑADO ===\n");
        
        // 1. Crear cliente
        cliente cliente1 = new cliente(
            "12345678A",
            "Juan Pérez",
            "Calle Principal 123",
            "600123456",
            "juan@email.com"
        );
        
        // 2. Crear cuenta bancaria
        cuentaBancaria cuenta = new cuentaBancaria(
            "ES91 2100 0418 4502 0005 1332",
            cliente1,
            1000.00,  // Saldo inicial
            1.5       // Tipo interés anual 1.5%
        );
        
        // 3. Realizar operaciones
        System.out.println("\n=== REALIZANDO OPERACIONES ===");
        
        // Ingresos
        cuenta.ingresar(500.00, "Transferencia");
        cuenta.ingresar(200.00, "Efectivo");
        
        // Reintegros
        cuenta.reintegrar(300.00, "Cajero automático");
        cuenta.reintegrar(150.00, "Oficina");
        
        // Transferencia
        cuenta.transferir("ES79 2100 0813 6101 2345 6789",
                        250.00, "Pago factura");
        
        // Aplicar intereses (simulación fin de mes)
        System.out.println("\n=== FIN DE MES: APLICANDO INTERESES ===");
        cuenta.aplicarIntereses();
        
        // Aplicar comisión de mantenimiento
        System.out.println("\n=== APLICANDO COMISIONES ===");
        cuenta.aplicarComisionMantenimiento(5.00); // $5 de comisión
        
        // Aplicar retención IRPF (19% sobre intereses)
        System.out.println("\n=== APLICANDO RETENCIÓN IRPF ===");
        cuenta.aplicarIRPF(19.0); // 19% de retención
        
        // Intentar operación inválida
        System.out.println("\n=== PRUEBA DE ERRORES ===");
        cuenta.reintegrar(5000.00, "Cajero"); // Saldo insuficiente
        cuenta.ingresar(-100.00, "Error"); // Cantidad negativa
        
        // 4. Generar extracto completo
        System.out.println("\n=== EXTRACTO COMPLETO ===");
        cuenta.generarExtracto();
        
        // 5. Generar extracto por período
        System.out.println("\n=== EXTRACTO POR PERÍODO ===");
        cuenta.generarExtractoPorPeriodo("Enero 2024");
        
        // 6. Mostrar información específica
        System.out.println("\n=== INFORMACIÓN DE LA CUENTA ===");
        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.printf("Saldo actual: $%.2f%n", cuenta.getSaldo());
        
        // 7. Obtener historial para procesamiento externo
        System.out.println("\n=== HISTORIAL DE OPERACIONES (Programático) ===");
        for (operacion op : cuenta.getHistorial()) {
            System.out.println(op.getTipoOperacion() + ": " +
                            op.getDescripcion() + " - $" + op.getCantidad());
        }
    }
}
