package Proven;
import java.util.Objects;

class Persona {
    //atributos
    private String nif;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String direccion;
    private String tlf;
    private int nacimiento;

    public Persona(){}
    public Persona(String nif, String nombre, String apellido1, String apellido2, String direccion, String tlf, int nacimiento){
        this.nif = nif;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.tlf = tlf;
        this.nacimiento = nacimiento;
    }
    public Persona(Persona otra) {
        this.nif = otra.nif;
        this.nombre = otra.nombre;
        this.apellido1 = otra.apellido1;
        this.apellido2 = otra.apellido2;
        this.direccion = otra.direccion;
        this.tlf = otra.tlf;
        this.nacimiento = otra.nacimiento;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nif == null) ? 0 : nif.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Persona other = (Persona) obj;
        return Objects.equals(this.nif, other.nif);
    }
    @Override
    public String toString() {
        return "Persona [nif=" + nif + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
                + ", direccion=" + direccion + ", tlf=" + tlf + ", nacimiento=" + nacimiento + "]";
    }
    
    
}
