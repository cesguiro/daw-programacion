import java.util.Scanner;

class Ejercicio2b {

    public static void main(String[] args) {
        int numero1, numero2, mayor;
        Scanner reader = new Scanner(System.in);

        System.out.print("Escribe el primer número:");
        numero1 = reader.nextInt();
        System.out.print("Escribe el segundo número:");
        numero2 = reader.nextInt();

        mayor = (numero1>=numero2)? numero1:numero2;

        System.out.println("El mayor de los 2 números es " + mayor);
    }
}
