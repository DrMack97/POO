package personas;

import java.util.Scanner;

public class persona {

    // dni, nombre, apellidos y edad.
    private Scanner sc = new Scanner(System.in);
    final private String DNI;
    private String nombre;
    private String apellidos;
    private int edad = 0;
    final static private int mayordeEdad = 18;

    ///////////////////////////////////////////////////////////////////////
    public persona() {
        String dni;
        do {
            dni = indiqueDNI();
            if (!validarDNI(dni)) {
                System.out.println("DNI equivocado intenta de nuevo");
            }
        } while (!validarDNI(dni));

        
        this.DNI = dni;
        this.nombre = indiqueNombre();
        this.apellidos = indiqueApellidos();
        this.edad = indiqueEdad();

        System.out.println("persona creada correctamente!");
    }
    public persona(String DNI, String nombre, String apellidos, int edad){
        if(!validarDNI(DNI)){
            throw new IllegalArgumentException("DNI Invalido "+ DNI);
        }
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    public String indiqueDNI() {
        System.out.println("indique su DNI SIUX PLAU");
        System.out.println("debe detener 8 digitos y una letra! (eje: 26673339L) ");
        return sc.nextLine();
    }

    public String indiqueNombre() {
        System.out.println("indique su nombre SIUX PLAU");
        return nombre = sc.nextLine();
    }

    public String indiqueApellidos() {
        System.out.println("indique su apellidos SIUX PLAU");
        return apellidos = sc.nextLine();
    }

    public int indiqueEdad() {
        System.out.println("indique su edad SIUX PLAU");
        edad = sc.nextInt();
        while (true) {
            if (edad == 0 | edad < 0) {
                System.out.println("incorrecta ");
            } else {
                return edad;
            }
        }
    }

    @Override
    public String toString() {
        return "persona [DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
    }

    public void imprime() {
        System.out.println("=".repeat(25) + "INFO" + "=".repeat(25));
        System.out.println(" DNI: " + DNI + "\n Nombre " + nombre + "\n Apellido " + apellidos + "\n edad " + edad);
        System.out.println("=".repeat(45));
    }

    public boolean esMayorEdad() {
        boolean esMayorEdad;
        if (edad >= mayordeEdad) {
            System.out.println("es mayor de edad ");
            esMayorEdad = true;
            return esMayorEdad;
        } else {
            System.out.println("es menor de edad ");
            esMayorEdad = false;
            return esMayorEdad;
        }
    }

    public boolean esJubilado() {
        boolean jubilado;
        if (edad >= 65) {
            System.out.println("es mayor de edad ");
            jubilado = true;
            return jubilado;
        } else {
            System.out.println("es menor de edad ");
            jubilado = false;
            return jubilado;
        }
    }

    public int diferenciaEdad(persona p) {
        int diferenciaEdad = this.edad - p.edad;
        return diferenciaEdad;
    
    }

    public static boolean validarDNI(String DNI){
        // comprobacion simple
        if (DNI == null || DNI.length() != 9) {
            return false;
        }
        // SEPARA NUMEROS DE LETRA
        String numeros = DNI.substring(0, 8);
        char letra = DNI.charAt(8);

        //VERIFICA QUE LOS PRIMEROS SEAN NUMEROS

        for (int i = 0; i < numeros.length(); i++) {
            if (!Character.isDigit(numeros.charAt(i))) {
                return false;
            }
        }
        if(!Character.isLetter(letra)){
            return false;
        }
        return true;
    }
}
