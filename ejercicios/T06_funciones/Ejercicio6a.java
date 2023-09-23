import java.util.Scanner;

public class Ejercicio6a {
    
    static int sumarNaturales(int number) {
        int suma;
        if(number == 1) {
            return 1;
        } else {
            suma = number + sumarNaturales(number - 1);
        }
        return suma;
    }

    public static void main(String[] args) {
        int number;
        Scanner reader = new Scanner(System.in);

        System.out.print("Escribe un número: ");
        number = reader.nextInt();
        System.out.println("Resultado: " + sumarNaturales(number));
    }
}
