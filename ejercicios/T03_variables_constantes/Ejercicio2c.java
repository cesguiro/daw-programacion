import java.util.Scanner;

class Ejercicio2c {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number;

        System.out.print("Introduce un número: ");
        number = reader.nextInt();

        System.out.println(number + " x 1 = " + (float) number * 1);
        System.out.println(number + " x 2 = " + number * 2f);
        System.out.println(number + " x 3 = " + number * 3f);
        System.out.println(number + " x 4 = " + number * 4f);
        System.out.println(number + " x 5 = " + number * 5f);
        System.out.println(number + " x 6 = " + number * 6f);
        System.out.println(number + " x 7 = " + number * 7f);
        System.out.println(number + " x 8 = " + number * 8f);
        System.out.println(number + " x 9 = " + number * 9f);
    }
}