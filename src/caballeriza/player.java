package caballeriza;
public abstract class player {
    private String name;
    protected int maxPos, currentPos;
    private char cPLayer;
    private barra bar;

    public player (String name, char cPLayer){
        this.name = name;
        this.cPLayer = cPLayer;
        currentPos = 0;
        maxPos = 30;
        bar = new bar(cPLayer, maxPos);
    }

    public abstract void advance();

    public void showPlayer(){
        System.out.println(name + " pos: "+ currentPos + " ");
        bar.showBar(currentPos);
    }

    public boolean isInEnd(){
        
    }

}
