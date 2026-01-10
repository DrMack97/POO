package mainCp.cpMenu;

public class cpMenu {
    private String procesador;
    private String discoDuro;
    private String display;
    public boolean switchedOn;
    public boolean screenSaverOn;

    // constructor
    public cpMenu(String procesador, String discoDuro, String display) {
        this.procesador = procesador;
        this.discoDuro = discoDuro;
        this.display = display;
        this.switchedOn = false;
        this.screenSaverOn = false;
    }

    // getter and setters
    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(String discoDuro) {
        this.discoDuro = discoDuro;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "cpMenu [procesador=" + procesador + ", discoDuro=" + discoDuro + ", display=" + display
                + ", switchedOn=" + switchedOn + ", screenSaverOn=" + screenSaverOn + "]";
    }

    // recursividad
    // checks si boton esta activado
    public boolean isSwitchedOn() {
        return switchedOn;
        // checks si la pantalla esta encendida
    }
    public boolean isScreenSaverOn() {
        return screenSaverOn;
    }

    // metodos
    public void switchOn() {
        if (!isSwitchedOn()) {
            switchedOn = true;
            System.out.println("pantalla encendida");
        } else {
            System.out.println("pantalla apagada");
        }
    }
    // SwitchOn enciende y apaga el ordenador 
    public void switchOff() {
        if (isSwitchedOn()) {
            screenSaverOn = false;
            switchedOn = false;
            System.out.println("la compu esta apagada");
        } else {
            System.out.println("la compu esta encendida");
        }
    }
    public void TurnScreenSaverOn(){
        if (isSwitchedOn()) {
            if (!isScreenSaverOn()) {
                screenSaverOn = true;
                System.out.println("guarda pantallas activo");
            }else{
                System.out.println("guardapantallas apagado");
            }
        }else{
                System.out.println("la compu esta apagada");
        }
    }
    // screenSaver enciende y apaga el guarda pantallas 
    public void TurnScreenSaverOff(){
        if (isSwitchedOn()) {
            if (isScreenSaverOn()) {
                screenSaverOn = false;
                System.out.println("guarda pantallas apagado");
            }else{
                System.out.println("guardapantallas encendido");
            }
        }else{
                System.out.println("la compu esta apagada");
        }

    }
}
