package mainCar.CarBuilder;

public class car {
    private String marca;
    private String modelo;
    private String gasolinaTipo;
    private boolean motorOn = false;
    private boolean ventanaOn = false;
    private int velocidad = 0;
    private String marcha;

    // constructor
    public car(String marca, String modelo, String gasolinaTipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.gasolinaTipo = gasolinaTipo;
    }

    // getters setters and ToString
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getGasolinaTipo() {
        return gasolinaTipo;
    }

    public void setGasolinaTipo(String gasolinaTipo) {
        this.gasolinaTipo = gasolinaTipo;
    }

    @Override
    public String toString() {
        return "car [marca=" + marca + ", modelo=" + modelo + ", gasolinaTipo=" + gasolinaTipo + "]";
    }

    // hecho usando get *codigo fuente*
    public boolean isMotorOn() {
        return motorOn;
    }

    public boolean isVentanaOn() {
        return ventanaOn;
    }

    public void turnMotorOn() {
        if (!isMotorOn()) {
            System.out.println("Motor encendido");
            motorOn = true;
        } else {
            System.out.println("Motor apagado");
        }
    }

    public void turnMotorOff() {
        if (isMotorOn()) {
            motorOn = false;
            ventanaOn = false;
            System.out.println("El Motor esta ahora apagado");
        } else {
            System.out.println("Motor encendido");
        }
    }

    public void turnVentanaOn() {
        if (isMotorOn()) {
            if (!isVentanaOn()) {
                ventanaOn = true;
                System.out.println("la ventana esta abajo");
            } else {
                System.out.println("ventana cerrada");
            }
        } else {
            System.out.println("el motor esta apagado");
        }
    }

    public void turnVentanaOff() {
        if (isMotorOn()) {
            if (isVentanaOn()) {
                ventanaOn = false;
                System.out.println("la ventana esta cerrada ahora");
            } else {
                System.out.println("la ventana esta abajo");
            }
        } else {
            System.out.println("el motor esta apagado2");
        }
    }

    public void acelerate() {
            String linea= "";
            char recorrido = '#';
        if (!isMotorOn()) {
            velocidad += 5;
            System.out.println("CL : "+velocidad);
            for (int i = 0; i < velocidad; i++) {
                System.out.print(linea += recorrido);
            }
            System.out.println();
            System.out.println("acelerate more? (y/n)");
        }else{
            System.out.println("motor apagado");
        }
    }
}
