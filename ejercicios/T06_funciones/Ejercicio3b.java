import java.util.Scanner;

class Ejercicio3b {

    static int compare(int a, int b) {
        int result = (a>b)? 1 : (a<b)? -1: 0;
        if (a>b) {
            return 1;
        } else if(a<b){
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int number1, number2;
        Scanner reader = new Scanner(System.in);

        System.out.print("Escribe el primer número: ");
        number1 = reader.nextInt();
        System.out.print("Escribe el segundo número: ");
        number2 = reader.nextInt();
        switch (compare(number1, number2)) {
            case 1 -> System.out.println("El mayor es " + number1);
            case -1 -> System.out.println("El mayor es " + number2);
            default -> System.out.println("Los números son iguales");
                
        }
    }

}
