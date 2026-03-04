package Exepciones;

import ContentPremiumException;
import Song;

public class BackendProvenfy {

    Song [] songs; 
    boolean userPremium; 

    public BackendProvenfy(boolean userPremium){
        songs = new Song[3];
        songs[0] = new Song("Sunny Glasgow", true);
        songs[1] = new Song("Eanair", false);
        songs[2] = new Song("Humours of Balliloughly", false);

        this.userPremium = userPremium;

    }

    public void showSongs(){
         for(Song s : songs){
            System.out.println(s.getName());
         }   
    }

    public String selectSongId(int id) throws ContentPremiumException{
        Song selectedSong = songs[id];

        if(!userPremium && selectedSong.isPremium()){
            throw new ContentPremiumException("Contenido Premium: Fes-te premium per 9.99€");
        }

        return selectedSong.getName();
    }

}
