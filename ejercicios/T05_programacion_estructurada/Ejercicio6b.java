import java.util.Scanner;

class Ejercicio6b {

    public static void main(String[] args) {
        int numero;
        Scanner reader = new Scanner(System.in);

        System.out.print("Escribe un número:");
        numero = reader.nextInt();

        for(int index=1; index<=numero; index++) {
            if((index%2)==0) {
                System.out.println(index);
            }
        }
    }
}
