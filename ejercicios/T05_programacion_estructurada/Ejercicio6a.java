import java.util.Scanner;

class Ejercicio6a {

    public static void main(String[] args) {
        int numero, index = 1;
        Scanner reader = new Scanner(System.in);

        System.out.print("Escribe un número:");
        numero = reader.nextInt();

        do {
            if((index%2)==0) {
                System.out.println(index);
            }
            index++;
        } while (index<=numero);
    }
}
