import java.util.Scanner;

class Ejercicio2a {

    public static void main(String[] args) {
        float number;
        Scanner reader = new Scanner(System.in);

        System.out.print("Escribe un número: ");
        number = reader.nextFloat();

        System.out.println("Raíz cuadrada: " + Math.sqrt(number));
    }

}