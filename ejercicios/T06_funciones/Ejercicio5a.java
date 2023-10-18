import java.util.Scanner;

class Ejercicio5a {

    static int area(int lado) {
        return lado * lado;
    }

    static int area(int base, int altura) {
        return (base * altura) / 2;
    }
    
    public static void main(String[] args) {
        int lado = 4, base = 2, altura = 4;
        Scanner reader = new Scanner(System.in);
        reader.nex
        System.out.println("Área del cuadrado: " + area(lado));
        System.out.println("Área del triángulo: " + area(base, altura));
    }
}
