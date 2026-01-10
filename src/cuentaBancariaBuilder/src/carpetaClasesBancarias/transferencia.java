package carpetaClasesBancarias;

public class transferencia extends operacion{
    private String cuentaDestino;
    private String concepto;
    
    public transferencia(double cantidad, String cuentaDestino, String concepto) {
        super(cantidad, "Transferencia a " + cuentaDestino);
        this.cuentaDestino = cuentaDestino;
        this.concepto = concepto;
    }
    
    @Override
    public String getTipoOperacion() {
        return "TRANSFERENCIA";
    }
    
    public String getCuentaDestino() {
        return cuentaDestino;
    }
    
    public String getConcepto() {
        return concepto;
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format(" → %s (Concepto: %s)", 
        cuentaDestino, concepto);
    }

}
