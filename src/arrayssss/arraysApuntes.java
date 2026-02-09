package arrayssss;
import java.util.Arrays;

public class arraysApuntes {
    public static void main(String[] args) {

    // como inicializar un array?

    //1. indicando su dimension

    int[] nums = new int [0];

    //2. incializacion directa

    int[] nums2 = {100, 200, 150, 300, 350};

    //3. asignadole espacio en memoria y luego, usandolo

    int[] nume3;

    String [] stringArray;

    // -----acceso de elementos de un array-----

    int valor3 = nums2[2];
    System.out.println(valor3); // mostrara 150

    nums2[2] = 35; // cambiar el valor de 150 a 35
    
    System.out.println(nums2.length); //tamano del array

    // acceder a los elementos del array usando un blucle for

    for (int i = 0; i < nums2.length; i++) {
        System.out.println("Elemento con index " + (i+1) + " "+ nums2[i]);
    }
    System.out.println();

    //añadir valores a un array 

    stringArray = new String[3]; 
    stringArray[0] = "david";
    stringArray[1] = "daniela";
    stringArray[2] = "Noland";

    for (int i = 0; i < stringArray.length; i++) {
        System.out.println("nombres del array " + (i+1) + " " +stringArray[i]);
        System.out.println();
    }

    String [] names = new String[3];  //declaració de l'array de 5 elements String, els quals encara no s'ha creat (són nuls)
names[0] = new String("John");
String nom1 = "dori"; // se puede darle valor a un index de un array usando una variable
names[1] =  nom1;
names[2] = new String("Louis");

    for (int i = 0; i < names.length; i++) {
        System.out.println("names "+(i+1)+ " "+names[i]);
    }
    System.out.println();
    System.out.println("printear un array usando un metodo: ");
    printeadorArrays(names);

    //buclea each 
    System.out.println();
    System.out.println("printear con bucle each");

    printBucleEach();


    //ORDENES UTILIZ CON ARRAYS

    int[] numbers = {5 , 3 , 6 , 9 , 4};

    //ordenar array

    Arrays.sort(numbers);
    System.out.println(numbers);

    // busqueda binaria (the array must be ordered! ) //del index 4 al 8 busca el 3
    int index = Arrays.binarySearch(numbers, 4, 8, 3); 
    System.out.println(index);  //key es el numero que buscara en la array

    //comparar arrays
    int[] arr1 = {1,2,3};
    int[] arr2 = {1,2,2};
    boolean iguales = Arrays.equals(arr1, arr2); // FALSE
    System.out.println("resultado al comparar arrays: " +iguales);

    // Rellenar array con un valor FILL
    Arrays.fill(numbers, 0); // todos seran 0

    //copiar array

    //int[] copia = Arrays.copyOf(int[] original, index);
    int[] copia = Arrays.copyOf(numbers, numbers.length);
    int[] copiaParcial = Arrays.copyOfRange(numbers, 1, 2); // los numeros son los indices;

    System.out.println(copia);
    System.out.println(copiaParcial);

    // convert in readeable
    String arrayStr = Arrays.toString(numbers);
    System.out.println(arrayStr); // [1, 2, 3, 4, 5]

    System.out.println();

    //metodo Printa Matriz (ARRAY 2D)
    printMatriz2D();
    System.out.println();

    //metodo Printa matriz (ARRAY 3D)
    printMatriz3D();

    }



    
    //METODOS
    static public void printeadorArrays(String [] names){
        for(int i=0; i < names.length; i++){               //este metodo recorera las array
            System.out.println(names[i]);                  // y las printeara...
        }
    }

    // BUCLE EACH METOD
    static public void printBucleEach(){
        int [] intArr = {1, 2, 3, 4, 5};
        for (int elemet : intArr) {
            System.out.print(elemet);
        }
    }
    //metodos de manipulacion manual

    // INVERTIR un array 
    public static void invertirArray(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {   //paso 1 configurar el bucle para recorrer la MITAD
            int temp = arr[i];                  //paso 2 guardar temporalmente el valor actual
            arr[i] = arr[arr.length - 1 - i];   //paso 3 mover el valor opuesto a la posicion actual
            arr[arr.length - 1 - i] = temp;     //paso 4 colocar el valor guardado en la posicion opuesta
        }
        // modifica el array original
    }

    // Encontrar maximo/minimo
    public static int maximoArray(int[] arr) {
    int max = arr[0];                           // Paso 1: Asume que el primero es el máximo
    for (int num : arr) {                       // Paso 2: Recorre todos los elementos
        if (num > max) max = num;               // Paso 3: Si encuentras uno mayor, actualiza
    }
    return max;                                 // Paso 4: Devuelve el máximo encontrado
}

    // Sumar elementos
    public static int sumaArray(int[] arr){
        int suma = 0;                           // paso 1 inicializar acumulador 0
        for (int num : arr) {                   //paso 2 recorrer cada elemento del array
            suma += num;                        //paso 3 suma y acumula
        }
        return suma;                            //paso 4 devuelve el resultado 
    }

    //ARRAY 2D (filas x columnas)

    public static void printMatriz2D(){
    int[][] matriz = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };

    // Recorrer matriz con bucles anidados
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
    }
    }

    //recorrer Matriz3D con bucles 
    public static void printMatriz3D(){
        int [][][] cubo = new int [3] [3] [3];

        //llenar con valores que muestren las cordenadas
        for (int z = 0; z < cubo.length; z++) {
            for (int y = 0; y < cubo[z].length; y++) {
                for (int x = 0; x < cubo[z][y].length; x++) {
                    cubo[z][y][x] = (z *100)+ (y*10) + x ;
                }
            }
        }
        imprimirCuboCompacto(cubo);
    }

    // IMPRIMIR POR CAPAZ
    public static void imprimirCuboPorCapas(int[][][] cubo){
        System.out.println("=== CUBO 3D ("+cubo.length + " x " +cubo[0].length + " x "+
        cubo[0][0].length + ") ===\n");

        for(int z = 0; z < cubo.length; z++){
            System.out.println("--- capa "+ z + " ---");

            for (int y = 0; y < cubo[z].length; y++) {
                for (int x = 0; x < cubo[z][y].length; x++) {
                    System.out.print(cubo[z][y][x]+ " ");
                }
                System.out.println(); // Nueca linea despues de cada fila
            }
            System.out.println(); //espacio entre capas
        }
    }

    // IMPRIMIR CUBO COMPACTO
    public static void imprimirCuboCompacto(int [][][] cubo){
        System.out.println("Vista 3D compacta");

        for (int z = 0; z < cubo.length; z++) {
            System.out.print("Z" + z + ": ");

            for (int y = 0; y < cubo[z].length; y++) {
                System.out.print("[ ");

                for (int x = 0; x < cubo[z][y].length; x++) {
                    System.out.print(cubo[z][y][x]);
                    if(x < cubo[z][y].length - 1) System.out.print(",");
                }
                System.out.print(" ]");
                if (y < cubo[z].length - 1) System.out.println(""); {
                    
                }
            }
            System.out.println();
            System.out.println();
        }
    }


}
