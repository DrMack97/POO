package carpetaClasesBancarias;

import java.time.LocalDateTime;

// Interfaz para todas las operaciones/anotaciones
public interface anotacion {

    // Métodos que todas las operaciones deben implementar
    String getDescripcion();
    double getCantidad();
    LocalDateTime getFecha(); // que hace local time?
    String getTipoOperacion();
    String toString(); // Representación en texto
    
}
