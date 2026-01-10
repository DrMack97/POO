package carpetaClasesBancarias;

import java.time.LocalDateTime;

public abstract class operacion implements anotacion {
    protected double cantidad;
    protected LocalDateTime fecha;
    protected String descripcion;

    //constructor
    public operacion(double cantidad, String descripcion) {
        this.cantidad = Math.abs(cantidad); // siempre positivo
        this.fecha = LocalDateTime.now();
        this.descripcion = descripcion;
    }
    @Override
    public double getCantidad() {
        return cantidad;
    }
    @Override
    public LocalDateTime getFecha() {
        return fecha;
    }
    @Override
    public String getDescripcion() {
        return descripcion;
    }
    // implementacion de metodos de la interfaz 
    @Override
    public String toString() {
        return String.format("[%s] %s - $%.2f - %s",
        fecha.toLocalDate(),getTipoOperacion(),cantidad, descripcion); 
    }
}
