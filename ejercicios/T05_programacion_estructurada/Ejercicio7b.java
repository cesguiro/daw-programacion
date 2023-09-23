import java.util.Scanner;

class Ejercicio7b {
    
    public static void main(String[] args) {
        int numero, index;
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Escribe un número:");
        numero = reader.nextInt();
        index = numero +1;

        while (true) {
            if((index%numero) == 0) {
                break;
            }
            index++;
        }

        System.out.println(index);
    }
}
