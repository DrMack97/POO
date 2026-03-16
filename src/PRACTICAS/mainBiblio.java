package PRACTICAS;

import java.util.List;

public class mainBiblio {
public static void main(String[] args) {

    SmartBibliotec lb = new SmartBibliotec();
    List<libros> listaParaRevisar = lb.obtenerLibrosPrestados();

    for (libros unLibro : listaParaRevisar) {
        System.out.println("libro prestado: " + unLibro.getName());
    }

    try {
        lb.prestarLibro("don Quijote");
    } catch (LibroNoDisponibleException e) {
        System.out.println(e.getMessage());
    }

}



}
