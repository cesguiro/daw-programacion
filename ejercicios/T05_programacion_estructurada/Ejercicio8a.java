import java.util.Scanner;

class Ejercicio8a {

    public static void main(String[] args) {
        int numero;
        Scanner reader = new Scanner(System.in);

        System.out.print("Escribe un número:");
        numero = reader.nextInt();

        for (int index = 1; index<10; index++) {
            System.out.println(numero + "*" + index + " = " + (numero * index));
        }
    }

}
