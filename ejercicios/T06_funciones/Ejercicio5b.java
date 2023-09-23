import java.util.Scanner;

class Ejercicio5b {
    static int option;
    static Scanner reader = new Scanner(System.in);

    static void showMenu1(){
        System.out.println("1.- Cuadrado");
        System.out.println("2.- Triángulo");
        System.out.println("0.- Salir");
        System.out.println("--------------------");
        System.out.print("Opción:");
        option = reader.nextInt();
    }

    static int area(int lado) {
        return lado * lado;
    }

    static int area(int base, int altura) {
        return (base * altura) / 2;
    }
    
    public static void main(String[] args) {
        int lado, altura, base;

        do {
            showMenu1();
            switch (option) {
                case 1:
                    System.out.print("Lado del cuadrado: ");
                    lado = reader.nextInt();
                    System.out.println("Área: " + area(lado));
                    break;
                case 2:
                    System.out.print("Base del triángulo: ");
                    base = reader.nextInt();
                    System.out.print("Altura del triángulo: ");
                    altura = reader.nextInt();
                    System.out.println("Área: " + area(base, altura));
                    break;
            
                default:
                    break;
            }
        } while (option!=0);
    }
}
