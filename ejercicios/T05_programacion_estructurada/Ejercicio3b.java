import java.util.Scanner;

class Ejercicio3b {

    public static void main(String[] args) {
        int numero;
        boolean par;
        Scanner reader = new Scanner(System.in);

        System.out.print("Escribe un número:");
        numero = reader.nextInt();

        par = (numero%2 == 0)? true: false;

        if(par) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
}
