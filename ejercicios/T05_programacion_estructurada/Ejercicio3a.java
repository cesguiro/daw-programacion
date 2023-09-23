import java.util.Scanner;

class Ejercicio3a {

    public static void main(String[] args) {
        int numero;
        Scanner reader = new Scanner(System.in);

        System.out.print("Escribe un número:");
        numero = reader.nextInt();

        if(numero%2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
}
