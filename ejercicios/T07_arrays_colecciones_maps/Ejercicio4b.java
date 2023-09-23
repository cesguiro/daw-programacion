import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio4b {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int numero;
        Set<Integer> numeros = new HashSet<>();

        do {
            System.out.print("Escribe un número (0 para salir): ");
            numero = reader.nextInt();
            numeros.add(numero);
        } while(numero != 0);

        numeros.remove(0);
        System.out.println(numeros);
    }    
}
