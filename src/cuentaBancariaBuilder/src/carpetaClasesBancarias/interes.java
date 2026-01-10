package carpetaClasesBancarias;

public class interes extends operacion {
    private double tasaInteres; // En porcentaje
    
    public interes(double cantidad, double tasaInteres) {
        super(cantidad, "Intereses aplicados");
        this.tasaInteres = tasaInteres;
    }
    
    @Override
    public String getTipoOperacion() {
        return "INTERES";
    }
    
    public double getTasaInteres() {
        return tasaInteres;
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format(" (Tasa: %.2f%%)", tasaInteres);
    }

}
