import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio4a {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int numero, tamanyoConjunto;
        Set<Integer> numeros = new HashSet<>();

        System.out.print("Tamaño del conjunto: ");
        tamanyoConjunto = reader.nextInt(); 
        for(int i = 0; i < tamanyoConjunto; i++) {
            System.out.print("Escribe un número: ");
            numero = reader.nextInt();
            numeros.add(numero);
        }
        System.out.println(numeros);
    }
}
