import java.util.Scanner;

class Ejercicio1b {

    public static void main(String[] args) {
        float number, number2;

        Scanner reader = new Scanner(System.in);
        System.out.print("Escribe el primer número: ");
        number = reader.nextFloat();
        reader.nextLine();

        System.out.print("Escribe el segundo número: ");
        number2 = reader.nextFloat();

        System.out.println("Suma: " + (int) (number + number2));
        System.out.println("Resta: " + (int) (number - number2));
        System.out.println("Multiplicación: " + (int) (number * number2));
        System.out.println("División: " + (int) (number / number2));
        System.out.println("Resto de la división entera: " + (int) (number % number2));
    }
}