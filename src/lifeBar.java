import javax.print.attribute.standard.MediaSize.Other;

public class lifeBar {
        //atributos                                             funcionan valores generales para todas las barras de vida
    private int maxLife, minLife; 
    private int currentLife, maxSize;
    private String nombre;
    private char caracterBar;
    private int limitAlertLife = 4;

    public void printLife (){
        System.out.println(nombre + " life: "+ currentLife);
        int lifeLimit = (currentLife * maxLife/maxSize);
        for (int i = 0; i < currentLife; i++) {
            if (i < lifeLimit ){
                System.out.println(caracterBar);
            }else{
                System.out.println(" ");
            }
        }
    }
    //constructor
    /**
     * para setear maxlife, name como valores por default
     * @param maxLife
     * @param minLife
     * @param currentLife
     * @param maxSize
     * @param nombre
     * @param caracterBar
     */
    public lifeBar(int maxLife, int minLife, int currentLife, int maxSize, String nombre, char caracterBar) {
        this.maxLife = maxLife;
        this.nombre = nombre;
        this.minLife = 0;
        this.currentLife = maxLife;
        this.maxSize = 20;
        this.caracterBar = '#';                     // atributos-constructors crean una plantilla 
    }
    public int Attack(int damage){    
        currentLife -= damage;
        if(currentLife <= minLife)currentLife = minLife;
        return currentLife;
    }
    public int restoreLife (int healt){

        currentLife += healt;
        if (currentLife >= maxLife)
            currentLife = maxLife; 
        return currentLife;
    }
    public void setCurrentLife(int currentLife){    //
        this.currentLife = currentLife;
    }
    
    public void changeAlert(){
            int lifeLimit = (currentLife *maxSize)/maxLife;
        if (lifeLimit <= limitAlertLife) caracterBar = '+';
        else caracterBar = '#';   
    }
    public boolean equals(Object obj){          //
        boolean result = false;
        if(obj == null){
            result = false;
        }else{
            if(this == obj){
                //son el mismo objeto
                result = (this.nombre.equals(Other.nombre)&& this.currentLife == other.currentLife);
            }else{
                // no son la misma clase
            }
        }
    
    
    }



}
