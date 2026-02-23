package articulo;

public class Articulo {

    private String nombre; 
    private double precio = 0;
    private double iva = 1.21;
    private int cuantosQuedan = 0;


    public Articulo(String nombre, double precio, double iva, int cuantosQuedan) {

        if(nombre == null || precio <= 0 || cuantosQuedan <= 0){

        System.err.println("ERROR DE ESTANSACION");

        this.nombre = nombre;
        this.precio = precio;
        this.iva = 1.21;
        this.cuantosQuedan = cuantosQuedan;

        }else{
        this.nombre = nombre;
        this.precio = precio;
        this.iva = 1.21;
        this.cuantosQuedan = cuantosQuedan;
        }
    }
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        if(nombre != null){
            this.nombre = nombre;
        }else{
            System.err.println("nombre no puede ser null");
        }
        
    }


    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        if(precio > 0){
        this.precio = precio;
        }else{
            System.err.println("precio no puede ser 0 ni negativo ");
        }
    }


    public double getIva() {
        return iva;
    }


    public void setIva(double iva) {
        if (iva > 0) {
        this.iva = iva;
        }else{
        System.err.println("IVA no puede ser 0 ni negativo ");
        }
    }


    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public void setCuantosQuedan(int cuantosQuedan) {
        if(cuantosQuedan > 0){
        this.cuantosQuedan = cuantosQuedan;
        }else{
        System.err.println("IVA no puede ser 0 ni negativo ");
        }
    }

    @Override
    public String toString() {
        return "Articulo nombre: " + nombre + " precio: " + precio + " iva: " + iva + " cuantosQuedan: " + cuantosQuedan;
    }

    public double calcularPvP() {
        return precio * iva;
    }
    public void imprime(){
        System.out.println("=".repeat(25) +"INFO PRODUCTO" +"=".repeat(25));
        System.out.println(" NOMBRE: "+nombre+"\n PRECIO "+ precio+"\n IVA "+"\n QUEDAN "+ cuantosQuedan);
    }

    public double getPVP(){
        double PvP= precio * iva;
        return PvP;
    }

    public double PvPconDescuento(double descuento){
        
        double PvPconDescuento = this.getPVP() * descuento;

        return PvPconDescuento;
    }

    public boolean vender(){
        boolean venta = true;
        if(cuantosQuedan <= 0){
            
            System.out.println("no es posible vender ");
            return venta = false;
        }else{
            System.out.println(" producto vendido!! ");
            cuantosQuedan--;
            return venta;
        }
    }

    public boolean almacenar(int almacenar){
        boolean almacenado = true;
        if (almacenar <= 0) {
            System.out.println("no existe producto que almacenar ");
            return almacenado = false;
        }else{
            cuantosQuedan = cuantosQuedan + almacenar;
            System.out.println("ALMACENADO!");
            return almacenado;
        }
    }

    
}
