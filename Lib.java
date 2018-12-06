import java.util.Scanner;
import java.util.Random;
public class Lib{
    public static Random rdn=new Random(System.in);
    public static Scanner lector=new Scanner(System.in);

    /**
     * Limpia la pantalla
     */
    public static limpiaPantalla(){
        System.out.print("\u001B[H\u001B[2J");
        System.out.flush();
    }    

    /**
     * funcion VOID que recibe una matriz y la muestra por pantalla con un printf de cinco elementos
     * @param matriz
     */
    public static void muestraMatriz(int [][] matriz){
        for(int i=0;i<matriz.length;i++){
            for(int j =0; j< matriz[0].length;j++){
                System.out.printf("%5d ",matriz[i][j]);
                
            }
            System.out.println("");
        }

    }
    /**
     * Array enteros aleatorios entre rango de enteros
     * Genera un array de enteros entre los valores asignados como max y min
     * @param array
     * @param max
     * @param min
     */
    public static void creaArrayAleatorio(int[] array,int max, int min){

        for(int i=0; i<array.length;i++){
            array[i]=rdn.nextInt(max-min+1)+min;
        }

    }
    /**
     *  Array letras mayusculas aleatorio
     * Recibe un array y lo rellena de letras mayusculas aleatorias, VOID
     * @param array
     */
    public static void crearArrayLetrasAleatorio(char[] array){

        for(int i=0; i<array.length;i++){
            array[i]=(char)(rdn.nextInt(90-65+1)+65);
            
        }

    }
    /**
     * Array abecedario
     * Genera el abecedario en mayusculas (26 caracteres) y lo guarda en un array de caracteres
     * @param abc
     */
    public static void generaAbecedario(char[] abc){
        int contador=0;
        for(int i =65;i<=90;i++){
            abc[contador]=(char)(i);
            contador++;
        }
        
    }
    /**
    * Muestra el contenido de un array
    * @param v Array a mostrar
    */
   public static void mostrarArray(int[] v) {
      System.out.println("v = " + Arrays.toString(v));
   }

    
    /**
     * Inicializa el array a la variable que le pasamos
     * @param array
     * @param num
     */
    public static void inicializaArrays(int[] array, int num){
        for(int j=0;j<array.length;j++){
            array[j]=num;
        }
    }
    /**
     * Inicializa array de doubles
     * @param array
     * @param num
     */
    public static void inicializaArrays(double[] array, double num){
        for(int j=0;j<array.length;j++){
            array[j]=num;
        }
    }
    /**
     * Aleatorio double
     * @param max
     * @param min
     * @return
     */
    public static double aleatorio(double max, double min){
        double aleat= rdn.nextDouble()*(max-min);
        return aleat;
    }
    /**
     * Recibe un parametro en milisegundos y aplica un retardo al programa
     * @param ms
     */
    public static void sleep(int ms){

        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
        }
    }
}
 /**
    * Realiza una búsqueda binaria o dicotómica en un array ordenado
    * @param vector Array sobre el que se realizará la búsqueda
    * @param num Número a buscar
    * @return La posición donde se encuentra el número buscado o -1 si no se encuentra
    */
   public static int busquedaDicotomica(int[] vector, int num){
      int centro;
      int inf = 0;
      int sup = vector.length - 1;
      iteraciones = 0;
       while(inf <= sup) {
         iteraciones++;
         centro = (sup + inf) / 2;
         if(vector[centro] == num) {
            return centro;
         } else if(num < vector[centro] ){
            sup = centro - 1;
         } else {
            inf = centro + 1;
         }         
       }
       return -1;
   }
 public static void ordernaBurbuja(int[] vector) {
      boolean hayCambios = true;
      while(hayCambios) {
         hayCambios = false;
         for(int i = 0; i < vector.length - 1; i++) {
            //Si el elemento actual es mayor que el elemento siguiente los intercambiamos
            if(vector[i] > vector[i+1]) {
               intercambio(v, i, i+1);
               hayCambios = true;
            }
         }
      }
   }
