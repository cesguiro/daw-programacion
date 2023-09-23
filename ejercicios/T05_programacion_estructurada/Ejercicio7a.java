import java.util.Scanner;

class Ejercicio7a {
    
    public static void main(String[] args) {
        int numero, index;
        boolean found = false;
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Escribe un número:");
        numero = reader.nextInt();
        index = numero +1;

        while (!found) {
            if((index%numero) == 0) {
                found = true;
            }
            index++;
        }

        System.out.println(index-1);
    }
}
