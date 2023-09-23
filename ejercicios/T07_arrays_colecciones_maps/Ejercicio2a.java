import java.lang.reflect.Array;
import java.util.Scanner;

public class Ejercicio2a {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Escribe el elmento " + i + ": ");
            numeros[i] = reader.nextInt();
        }

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
