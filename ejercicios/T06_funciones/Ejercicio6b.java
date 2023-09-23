import java.util.Scanner;

public class Ejercicio6b {
    
    static int sumarEnteros(int number) {
        int suma;
        if(number == 0) {
            return 0;
        } else if(number > 0){
            suma = number + sumarEnteros(number - 1);
        } else {
            suma = number + sumarEnteros(number + 1);
        }
        return suma;
    }

    public static void main(String[] args) {
        int number;
        Scanner reader = new Scanner(System.in);

        System.out.print("Escribe un número: ");
        number = reader.nextInt();
        System.out.println("Resultado: " + sumarEnteros(number));
    }
}
