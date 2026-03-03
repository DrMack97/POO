package Exepciones;
public class Song {
    String name; 
    boolean premium; 

    public Song(String name, boolean premium){
        this.name = name; 
        this.premium = premium;
    }

    public String getName() {
        return name;
    }

    public boolean isPremium() {
        return premium;
    }

    
}
