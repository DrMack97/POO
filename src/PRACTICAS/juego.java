package PRACTICAS;

public class juego {

    private String gameName; 
    private double price;
    
    public juego(String gameName, double price) {
        this.gameName = gameName;
        this.price = price;
    }

    public String getGameName() {
        return gameName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("--- Ficha del juego ---");
        sb.append("\ngameName").append(this.gameName);
        sb.append("\nPrecio: ").append(this.price).append(" eu");

        return sb.toString();
        } 

    

}
