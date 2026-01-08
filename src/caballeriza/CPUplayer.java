package caballeriza;
import java.util.Random;

public class CPUplayer extends player {

    public CPUplayer(String name, char cPLayer) {
        super(name, cPLayer);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void advance() {
        Random rnd = new Random();
        currentPos += rnd.nextInt(-5,5+1);
        if (currentPos > maxPos);
    }

}
