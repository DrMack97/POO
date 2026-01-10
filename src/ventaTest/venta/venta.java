package ventaTest.venta;

import ventaTest.venta.articulo.articulo;

public class venta {
    private articulo articulo;
    private String nif;
    private String nombreCliente;
    private double cantidad;
    private final double iva = 0.16;

    public venta(articulo articulo, String nif, String nombreCliente, double cantidad) {
        this.articulo = articulo;
        this.nif = nif;
        this.nombreCliente = nombreCliente;
        this.cantidad = cantidad;
    }

    public articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(articulo articulo) {
        this.articulo = articulo;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    @Override
    public String toString() {
        return "venta [articulo=" + articulo + ", nif=" + nif + ", nombreCliente=" + nombreCliente + "]";
    }

    //metodos 

    public double precioNeto(){
        return articulo.getPrecio() * cantidad;
    }
    public double iva(){
        return precioNeto()*iva;
    }
    public double precioBruto(){
        return precioNeto()+iva();
    }
    public void showFactura(){
        System.out.println("$".repeat(25)+"FACTURA"+"$".repeat(25));
        //CLIENTE
        System.out.println("NIF: "+nif);
        System.out.println("Nombre cliente: "+nombreCliente);
        //Articulo
        System.out.println("Codigo: "+articulo.getCod());
        System.out.println("articulo: "+ articulo.getDescripcion());
        System.out.println("cantidad: "+(int) cantidad);
        System.out.println("precio articulo unidad: $"+articulo.getPrecio());
        //Desglose $%.2f%n
        System.out.printf("PRECIO NETO: $%.0f%n",precioNeto());
        System.out.printf("IVA %.0f%n",iva*100,"%");
        System.out.printf("IMPORTE IVA: $%.0f%n", iva());
        
        System.out.printf("TOTAL: $%.0f%n",precioBruto());
        System.out.println("=".repeat(57));
    }
}
