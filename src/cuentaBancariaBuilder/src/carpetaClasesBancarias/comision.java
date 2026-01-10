package carpetaClasesBancarias;

public class comision extends operacion{
    private String tipoComision; // "Mantenimiento", "Transferencia", "Otros"
    
    public comision(double cantidad, String tipoComision, String motivo) {
        super(cantidad, "Comisión: " + motivo);
        this.tipoComision = tipoComision;
    }
    
    @Override
    public String getTipoOperacion() {
        return "COMISION";
    }
    
    public String getTipoComision() {
        return tipoComision;
    }
    
    @Override
    public String toString() {
        return super.toString() + " (Tipo: " + tipoComision + ")";
    }

}
