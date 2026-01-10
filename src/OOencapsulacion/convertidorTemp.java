package OOencapsulacion;

public class convertidorTemp {

    int c;
    int f;

    public int farenhC(int c){
        int f = 0;

        f =(9/5)*c+32;

        return f;
    }

    public int celciusF (int f){
        int c = 0;

        c = (f-32)*5/9;

        return c;
    }

}
