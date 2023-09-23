import java.util.Scanner;

class Ejercicio3a {

    static int greater(int a, int b) {
        return (a>=b)? a: b;
    }

    public static void main(String[] args) {
        int number1, number2;
        Scanner reader = new Scanner(System.in);

        System.out.print("Escribe el primer número: ");
        number1 = reader.nextInt();
        System.out.print("Escribe el segundo número: ");
        number2 = reader.nextInt();
        System.out.println("El mayor es " + Integer.toString(greater(number1, number2)));
    }

}
