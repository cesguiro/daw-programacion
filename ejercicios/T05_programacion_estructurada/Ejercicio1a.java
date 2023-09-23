import java.util.Scanner;

public class Ejercicio1a {
    
    public static void main(String[] args) {
        int edad;
        Scanner reader = new Scanner(System.in);

        System.out.print("Escribe tu edad: ");
        edad = reader.nextInt();

        if (edad>=18) {
            System.out.println("Puedes pasar");
        } else {
            System.out.println("No puedes pasar");
        }
    }
}
