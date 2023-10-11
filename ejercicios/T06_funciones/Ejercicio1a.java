import java.util.Scanner;

class Ejercicio1a {

    static int sumar(int a, int b) {
        return a + b;
    }

    static int restar(int a, int b) {
        return a - b;
    }

    static int multiplicar(int a, int b){
        return a * b;
    }

    static float dividir(int a, int b){
        return a / b;
    }

    public static void main(String[] args) {
        int a, b;
        Scanner reader = new Scanner(System.in);

        System.out.print("Escribe el primer número: ");
        a = reader.nextInt();
        System.out.print("Escribe el segundo número: ");
        b = reader.nextInt();
        System.out.println("Suma: " + sumar(a, b));
        System.out.println("Resta: " + restar(a, b));
        System.out.println("Multiplicación: " + multiplicar(a, b));
        System.out.println("División: " + dividir(a, b));
    }

}
