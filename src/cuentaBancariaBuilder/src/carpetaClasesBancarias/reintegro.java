package carpetaClasesBancarias;

public class reintegro extends operacion {
private String metodo; // Ej: "Cajero", "Oficina", "Online"
    
    public reintegro(double cantidad, String descripcion, String metodo) {
        super(cantidad, descripcion);
        this.metodo = metodo;
    }
    
    @Override
    public String getTipoOperacion() {
        return "REINTEGRO";
    }
    
    public String getMetodo() {
        return metodo;
    }
    
    @Override
    public String toString() {
        return super.toString() + " (Método: " + metodo + ")";
    }
}
