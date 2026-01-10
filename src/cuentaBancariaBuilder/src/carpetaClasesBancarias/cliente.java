package carpetaClasesBancarias;

public class cliente {

    private String dni;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;

    //Constructor basico
    
    public cliente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    //Constructor completo 
    public cliente(String dni, String nombre, String direccion, String telefono, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "cliente [dni=" + dni + "]";
    }
    
}
