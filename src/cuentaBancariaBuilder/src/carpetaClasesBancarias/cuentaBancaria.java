package carpetaClasesBancarias;

import java.util.ArrayList;
import java.util.List;

public class cuentaBancaria {
    private String numeroCuenta;
    private cliente titular;
    private double saldo;
    private double tipoInteresAnual; // En porcentaje
    private List<operacion> historial;
    
    //Constructor
    public cuentaBancaria(String numeroCuenta, cliente titular, double saldoInicial, double tipoInteresAnual) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
        this.tipoInteresAnual = tipoInteresAnual;
        this.historial = new ArrayList<>();

        //registra la creacion como primera operacion
    registrarOperacion(new ingreso(saldoInicial, "Apertura de cuenta", "Depósito inicial"));
    }

     // ========== MÉTODOS PARA REGISTRAR OPERACIONES ==========

     private void registrarOperacion(operacion operacion){
        historial.add(operacion);
     }
    
     // 1. Ingresar dinero
    public void ingresar(double cantidad, String origen) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad debe ser positiva.");
            return;
        }
        
        saldo += cantidad;
        registrarOperacion(new ingreso(cantidad, "Ingreso en cuenta", origen));
        System.out.printf(" Ingreso registrado: $%.2f (Saldo: $%.2f)%n", cantidad, saldo);
    }

    // 2. Retirar dinero
    public boolean reintegrar(double cantidad, String metodo) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad debe ser positiva.");
            return false;
        }
        
        if (cantidad > saldo) {
            System.out.println("Error: Saldo insuficiente.");
            return false;
        }
        
        saldo -= cantidad;
        registrarOperacion(new reintegro(cantidad, "Retiro de efectivo", metodo));
        System.out.printf(" Reintegro registrado: $%.2f (Saldo: $%.2f)%n", cantidad, saldo);
        return true;
    }

    // 3. Transferir (versión simple)
    public boolean transferir(String cuentaDestino, double cantidad, String concepto) {
        if (reintegrar(cantidad, "Transferencia")) {
            registrarOperacion(new transferencia(cantidad, cuentaDestino, concepto));
            return true;
        }
        return false;
    }

    // 4. Aplicar intereses mensuales
    public void aplicarIntereses() {
        double intereses = saldo * (tipoInteresAnual / 100) / 12;
        if (intereses > 0) {
            saldo += intereses;
            registrarOperacion(new interes(intereses, tipoInteresAnual));
            System.out.printf(" Intereses aplicados: $%.2f%n", intereses);
        }
    }

    // 5. Aplicar comisión de mantenimiento
    public void aplicarComisionMantenimiento(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            registrarOperacion(new comision(cantidad, "Mantenimiento", 
            "Comisión mensual de mantenimiento"));
            System.out.printf(" Comisión aplicada: $%.2f%n", cantidad);
        }
    }
    // 6. Aplicar retención IRPF (sobre intereses)
    public void aplicarIRPF(double porcentajeRetencion) {
        // Buscar los intereses del último mes para retener
        double interesesMes = calcularInteresesUltimoMes();
        if (interesesMes > 0) {
            double retencion = interesesMes * (porcentajeRetencion / 100);
            saldo -= retencion;
            registrarOperacion(new IRPF(retencion, porcentajeRetencion));
            System.out.printf(" Retención IRPF aplicada: $%.2f (%.1f%%)%n", 
                            retencion, porcentajeRetencion);
        }
    }
    private double calcularInteresesUltimoMes() {
        double totalIntereses = 0;
        for (int i = historial.size() - 1; i >= 0; i--) {
            operacion op = historial.get(i);
            if (op instanceof interes) {
                totalIntereses += op.getCantidad();
            }
            // Solo mirar operaciones del último mes (simplificado)
            if (i < historial.size() - 10) break; // Asumimos 10 operaciones máximo por mes
        }
        return totalIntereses; //desglosar paso a paso 
    }

    // ============ METODOS DE CONSULTA =================

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public cliente getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<operacion> getHistorial() {
        return new ArrayList<>(historial); // copia para proteger el original
    }

    // ========== MÉTODOS PARA EXTRACTOS ==========
    
    public void generarExtracto() {
        System.out.println("\n" + "=".repeat(70));
        System.out.println("                    EXTRACTO BANCARIO");
        System.out.println("=".repeat(70));
        System.out.println("Cuenta: " + numeroCuenta);
        System.out.println("Titular: " + titular);
        System.out.printf("Saldo actual: $%.2f%n", saldo);
        System.out.println("Tipo interés anual: " + tipoInteresAnual + "%");
        System.out.println("-".repeat(70));
        System.out.println("                      MOVIMIENTOS");
        System.out.println("-".repeat(70));
        
        if (historial.isEmpty()) {
            System.out.println("No hay operaciones registradas.");
        } else {
            for (int i = 0; i < historial.size(); i++) {
                System.out.printf("%3d. %s%n", i + 1, historial.get(i));
            }
        }
        
        System.out.println("-".repeat(70));
        mostrarResumenFinanciero();
        System.out.println("=".repeat(70));
    }
    private void mostrarResumenFinanciero() {
        double totalIngresos = 0;
        double totalReintegros = 0;
        double totalIntereses = 0;
        double totalComisiones = 0;
        double totalIRPF = 0;

        for (operacion op : historial) {
            switch(op.getTipoOperacion()) {
                case "INGRESO":
                    totalIngresos += op.getCantidad();
                    break;
                case "REINTEGRO":
                    totalReintegros += op.getCantidad();
                    break;
                case "INTERES":
                    totalIntereses += op.getCantidad();
                    break;
                case "COMISION":
                    totalComisiones += op.getCantidad();
                    break;
                case "IRPF":
                    totalIRPF += op.getCantidad();
                    break;
            }
        }

        System.out.println("                  RESUMEN FINANCIERO");
        System.out.println("-".repeat(70));
        System.out.printf("Total ingresos:        $%10.2f%n", totalIngresos);
        System.out.printf("Total reintegros:      $%10.2f%n", totalReintegros);
        System.out.printf("Total intereses:       $%10.2f%n", totalIntereses);
        System.out.printf("Total comisiones:      $%10.2f%n", totalComisiones);
        System.out.printf("Total retenciones IRPF:$%10.2f%n", totalIRPF);
        System.out.printf("Saldo final:           $%10.2f%n", saldo);
    }
     // Generar extracto por período
    public void generarExtractoPorPeriodo(String periodo) {
        System.out.println("\nExtracto del período: " + periodo);
        System.out.println("(Funcionalidad extendida - filtraría por fecha)");
        generarExtracto(); // Por ahora mostramos todo
    }
    }

