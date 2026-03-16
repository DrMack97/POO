package PRACTICAS;

public class libros {

private String name;
private boolean estado;

public libros(String name, boolean estado) {
    this.name = name;
    this.estado = estado;
}

public String getName() {
    return name;
}

public boolean isEstado() {
    return estado;
}



public void setEstado(boolean estado) {
    this.estado = estado;
}

@Override
public String toString() {
    return "libros [name=" + name + ", estado=" + estado + "]";
}
    
    

    
    
}
