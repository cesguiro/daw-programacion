import java.util.Random;
import java.util.Scanner;

class Ejercicio5b {

    public static void main(String[] args) {
        int min, max;
        Scanner reader = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Escribe el mínimo: ");
        min = reader.nextInt();
        System.out.print("Escribe el máximo: ");
        max = reader.nextInt();

        int number = random.nextInt(max - min + 1) + min;

        System.out.println(number);
    }

}