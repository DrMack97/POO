package carpetaClasesBancarias;

public class IRPF extends operacion {
     private double porcentajeRetencion;
    
    public IRPF(double cantidad, double porcentajeRetencion) {
        super(cantidad, "Retención IRPF");
        this.porcentajeRetencion = porcentajeRetencion;
    }
    
    @Override
    public String getTipoOperacion() {
        return "IRPF";
    }
    
    public double getPorcentajeRetencion() {
        return porcentajeRetencion;
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format(" (%.1f%%)", porcentajeRetencion);
    }

}
