import java.util.Scanner;

import javax.security.sasl.SaslException;

class Ejercicio1b {

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
        if(b == 0) {
            return -0f;
        }
        return ((float) a) / ((float) b);
    }

    public static void main(String[] args) {
        int a, b;
        float division;
        Scanner reader = new Scanner(System.in);

        System.out.print("Escribe el primer número: ");
        a = reader.nextInt();
        System.out.print("Escribe el segundo número: ");
        b = reader.nextInt();
        System.out.println("Suma: " + Integer.toString(sumar(a, b)));
        System.out.println("Resta: " + Integer.toString(restar(a, b)));
        System.out.println("Multiplicación: " + Integer.toString(multiplicar(a, b)));
        division = dividir(a, b);
        if (division != -0f) {
            System.out.println("División: " + Float.toString(division));            
        } else {
            System.out.println("Error: división por 0");            
        }
    }

}
