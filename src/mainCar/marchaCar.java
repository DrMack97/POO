package mainCar;

import java.util.InputMismatchException;
import java.util.Scanner;

import mainCar.CarBuilder.car;

public class marchaCar {

    public static void main(String[] args) {
        car cars = new car("corolla", "toyota", "dinamita");
        carMenu menu = new carMenu("1. prender/apagar motor", "2. acelerate", "3. cambio de marcha",
                "4. subir/bajar ventana", "0. salida");
        carMenu cambios = new carMenu("1. primera", "2. segunda", "3. tercera", "4. cuarta", "retro");
        boolean salida = false;
        int opcion;
        int opcionCambios;
        do {
            menu.showCarMenu('=', 5);
            opcion = menu.readOpcions();
            switch (opcion) {
                case 0:
                    salida = true;
                    break;
                case 1:
                    if (!cars.isMotorOn()) {
                        cars.turnMotorOn();
                    } else {
                        cars.turnMotorOff();
                    }
                    System.out.println(cars.isMotorOn());
                    break;
                case 2:
                    cars.acelerate();
                    break;
                case 3:
                    if (cars.isMotorOn()) {
                        cambios.showCarMenu('+', 10);
                        opcionCambios = menu.readOpcions();
                        switch (opcionCambios) {
                            case 1:
                                System.out.println("car is now in primera");
                                break;
                            case 2:
                                System.out.println("car is now in segunda");
                                break;
                            case 3:
                                System.out.println("car is now in tercera");
                                break;
                            case 4:
                                System.out.println("car is now in cuarta");
                                break;
                            case 0:
                                System.out.println("car is now in retro");
                                break;
                            default:
                                System.out.println("error");
                                break;
                        }
                    } else {
                        System.out.println(" motor apagado para hacer cambio de marcha ");
                    }
                    break;
                case 4:
                    if (cars.isMotorOn()) {
                        if (cars.isVentanaOn()) {
                            cars.turnVentanaOn();
                        } else {
                            cars.turnVentanaOff();
                        }
                    } else {
                        cars.turnVentanaOff();
                    }
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } while (!salida);
        {
            System.out.println("adeosh");
        }

    }

    static class carMenu {
        // atributos
        String opcion1, opcion2, opcion3, opcion4, opcion0;

        // haz una array para cada menu que necesites para el vehiculo
        public carMenu(String opcion1, String opcion2, String opcion3, String opcion4, String opcion0) {
            this.opcion1 = opcion1;
            this.opcion2 = opcion2;
            this.opcion3 = opcion3;
            this.opcion4 = opcion4;
            this.opcion0 = opcion0;
        }

        public void setOpcion1(String opcion1) {
            this.opcion1 = opcion1;
        }

        public void setOpcion2(String opcion2) {
            this.opcion2 = opcion2;
        }

        public void setOpcion3(String opcion3) {
            this.opcion3 = opcion3;
        }

        public void setOpcion4(String opcion4) {
            this.opcion4 = opcion4;
        }

        public void setOpcion0(String opcion0) {
            this.opcion0 = opcion0;
        }

        @Override
        public String toString() {
            return "carMenu [opcion1=" + opcion1 + ", opcion2=" + opcion2 + ", opcion3=" + opcion3 + ", opcion4="
                    + opcion4 + ", opcion0=" + opcion0 + "]";
        }

        public String showCarMenu(char caracter, int longitud) {
            String linea = "";
            System.out.println(linea + "Menu principal" + linea);
            System.out.println(opcion1 + "\n" + opcion2 + "\n" + opcion3 + "\n" + opcion4 + "\n" + opcion0);
            for (int i = 0; i < longitud; i++) {
                System.out.print(linea += caracter);
            }
            System.out.println();
            return linea;
        }

        public int readOpcions() {
            int opcion = -1;
            Scanner sc = new Scanner(System.in);
            try {
                opcion = sc.nextInt();
            } catch (InputMismatchException ime) {
                ime.printStackTrace();
            }
            return opcion;
        }
    }
}
