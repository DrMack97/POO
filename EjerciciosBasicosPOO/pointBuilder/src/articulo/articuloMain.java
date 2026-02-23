package articulo;

public class articuloMain {

    public static void main(String[] args) {

    Articulo producto = new Articulo("Jabon", 2, 1.21, 200);
    Articulo producto2 = new Articulo("esponja", 0.5, 0, 2);

        System.out.println(producto);
        System.out.println(producto2);
        System.out.println();
        System.out.println("producto: " + producto.getNombre());
        System.out.printf("venta al publico: %.2f", producto.calcularPvP()); // Usar el método para calcular PvP
        System.out.println("\ncantidad " + producto.getCuantosQuedan());
        
        System.out.println();
        System.out.println("cambio de precio!");

        producto.setPrecio(4);
        System.out.println();
        System.out.println(producto.toString());
        System.out.println();
        System.out.println("producto: " + producto.getNombre());
        System.out.printf("venta al publico: %.2f", producto.calcularPvP()); // Usar el método para calcular PvP
        System.out.println("\ncantidad " + producto.getCuantosQuedan());


    }
}
