package Exepciones;
import java.util.InputMismatchException;
import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Benvinguts a Provenfy!");

        BackendProvenfy bp = new BackendProvenfy(true);

        boolean exit = false;

        Scanner sc = new Scanner(System.in);

        

        do{
            try{

            System.out.println("0- Triar cançó");
            System.out.println("1- Sortir");

            int option = sc.nextInt();
            sc.nextLine();
            
            switch(option){
                case 0: 
                    //Logica per triar i reproduir tema 
                    System.out.println("Indica quin ID de cançó vols escoltar (0 a 2):");
                    int id = sc.nextInt();
                    String selectedSong = bp.selectSongId(id);
                    System.out.println("Reproduint canço amb nom = "+ selectedSong);
                    break; 
                case 1:
                    //Sortir 
                    exit = true;
                    break;
                default: 
                    break;

            }

            }catch(InputMismatchException ime){
                System.out.println("Error: Id no numèric, has de ser un enter.");
            }catch(ArrayIndexOutOfBoundsException aiooe){
                System.out.println("Error: has triat un ID que no esta a la llista.");
            }catch(ContentPremiumException cpe){
                System.out.println(cpe.getMessage());
            }


        }while(!exit);

        sc.close();
        

    }
}
