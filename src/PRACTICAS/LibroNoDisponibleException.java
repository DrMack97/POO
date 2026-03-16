package PRACTICAS;

public class LibroNoDisponibleException extends Exception {

    public LibroNoDisponibleException(String l ) {
        super(l +" This Book don't exits ");
    }
}
