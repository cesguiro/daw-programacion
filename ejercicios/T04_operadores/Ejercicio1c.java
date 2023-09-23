import java.util.Scanner;

class Ejercicio1c {

    public static void main(String[] args) {
        float number, number2;

        Scanner reader = new Scanner(System.in);
        System.out.print("Escribe el primer número: ");
        number = reader.nextFloat();
        reader.nextLine();

        System.out.print("Escribe el segundo número: ");
        number2 = reader.nextFloat();

        System.out.println("Suma: " + String.format("%.2f", (number + number2)));
        System.out.println("Resta: " + String.format("%.2f", (number - number2)));
        System.out.println("Multiplicación: " + String.format("%.2f", (number * number2)));
        System.out.println("División: " + String.format("%.2f", (number / number2)));
        System.out.println("Resto de la división entera: " + String.format("%.2f", (number % number2)));
    }
}