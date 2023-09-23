import java.util.Scanner;

class Ejercicio5b {

    
    public static void main(String[] args) {
        int numero, factorial = 1;
        Scanner reader = new Scanner(System.in);

        System.out.print("Escribe un número:");
        numero = reader.nextInt();

        for(int index=2; index<=numero;index++) {
            factorial *= index;
        }
        
        System.out.println("El factorial es " + factorial);
    }
}
