package PRACTICAS;

public class coleccionista extends juego {
    private String estado;

    public coleccionista(String gameName, double price, String estado) {
        super(gameName, price);
        this.estado = estado;
    } 
    
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());

        sb.append("\nEstadp").append(this.estado);

        return sb.toString();
    }
}
