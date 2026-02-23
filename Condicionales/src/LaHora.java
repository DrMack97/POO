import java.util.Scanner;

public class LaHora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //variables 
        int hora;
        int minutos;
        int segundos;
        int segadic; 
    //entradas
            System.out.println("=================================LA HORA=====================================");
        System.out.println("ingrese Hora: ");
            hora = sc.nextInt();
        System.out.println("ingrese Min: ");
            minutos = sc.nextInt();
        System.out.println("ingrese Seg: ");
            segundos = sc.nextInt();
        System.out.println("ingrese Segundos adiccionales: ");
            segadic = sc.nextInt();
    //proceso CONVERTIR TODO A SEGUNDOS///////
        int HoraA = hora * 3600 + minutos * 60 + segundos;
        int HoraF = HoraA + segadic;

        int TotalSegEnUnDia = 24 * 3600;
        HoraF %= TotalSegEnUnDia;
        int horaActual = HoraF / 3600;
        int minutosActual = (HoraF % 3600) / 60;
        int segundosActual = HoraF % 60;
        
    //salida 
        System.out.printf("\nHora actual: %02d:%02d:%02d\n", hora, minutos, segundos);
        System.out.println("tiempo agregado: " + segadic + " seg ");
        System.out.printf("Hora futura: %02d:%02d:%02d\n", horaActual, minutosActual, segundosActual);

    sc.close();
        
    }

}
