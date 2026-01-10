package ventaTest;
import ventaTest.venta.venta;
import ventaTest.venta.articulo.articulo;

public class ventaTest {
    public static void main(String[] args) {
    articulo monitor = new articulo("15246", "monitor lcd", 85);
    venta primera = new venta(monitor, "Z12450f", "Dominguez", 4);

    primera.showFactura();
    }
}
