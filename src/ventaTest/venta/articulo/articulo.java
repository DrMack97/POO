package ventaTest.venta.articulo;

public class articulo {
    private String cod;
    private String descripcion;
    private int precio;

    public articulo(String cod, String descripcion, int precio) {
        this.cod = cod;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "articulo [cod=" + cod + ", descripcion=" + descripcion + ", precio=" + precio + "]";
    }
    
    

}
