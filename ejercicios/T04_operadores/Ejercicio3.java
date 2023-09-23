import java.util.Scanner;

class Ejercicio3 {

    public static void main(String[] args) {
        float number;
        int pow;
        Scanner reader = new Scanner(System.in);

        System.out.print("Escribe un número: ");
        number = reader.nextFloat();
        reader.nextLine();
        System.out.print("Escribe la potencia: ");
        pow = reader.nextInt();

        System.out.println("Resultado: " + String.format("%.2f", Math.pow(number, pow)));
    }

}