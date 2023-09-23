import java.util.Scanner;

public class Ejercicio2c {
    static Scanner reader = new Scanner(System.in);
    
    public static void main(String[] args) {
        int arraySize;
        int[] numeros;

        System.out.print("Tamaño del array: ");
        arraySize = reader.nextInt();
        numeros = new int[arraySize];        
        
        inicializaArray(arraySize, numeros);
        muestraArray(numeros);
    }

    private static void inicializaArray(int arraySize, int[] numeros) {
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Escribe el elmento " + i + ": ");
            numeros[i] = reader.nextInt();
        }        
    }

    private static void muestraArray(int[] numeros) {
        for (int numero : numeros) {
            System.out.println(numero);
        }    
    }
}
