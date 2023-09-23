import java.util.Scanner;

public class Ejercicio2b {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int arraySize;
        int[] numeros;

        System.out.print("Tamaño del array: ");
        arraySize = reader.nextInt();
        numeros = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.print("Escribe el elmento " + i + ": ");
            numeros[i] = reader.nextInt();
        }

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }

}
