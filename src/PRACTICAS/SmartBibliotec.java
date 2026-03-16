package PRACTICAS;

import java.util.ArrayList;
import java.util.List;

public class SmartBibliotec {
    private List<libros> librosDisponibles;


    public SmartBibliotec() {

        //inializacion de la lista
        librosDisponibles = new ArrayList<>();
        // libros: 

        librosDisponibles.add(new libros("don Quijote", false));
        librosDisponibles.add(new libros("Java para principiantes", true));
        librosDisponibles.add(new libros("el principito", false));
    }
    
    //metodos 
    
    public void prestarLibro(String name) throws LibroNoDisponibleException{
        for (libros libros : librosDisponibles) {

            // Condicion de busqueda con Strings
            if(libros.getName().equalsIgnoreCase(name)){
                if(libros.isEstado()){
                    //Escenario 1: El libro existe pero está reservado (true)
                    throw new LibroNoDisponibleException(libros.getName());
                }
                // Escenario 2: El libro existe y está libre (false)
                libros.setEstado(true);
                return;
            }
        }

        throw new LibroNoDisponibleException(name);
    }

    public List<libros> obtenerLibrosPrestados(){
        //inicializar un nuevo arrayList
        List<libros> prestados = new ArrayList<>();
        
        for (libros libros : librosDisponibles) {
            if (libros.isEstado() == false) {
                prestados.add(libros);
            }
        }

        return prestados;
    }
    
}
