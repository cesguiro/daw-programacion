import java.util.Scanner;

class Ejercicio5a {

    
    public static void main(String[] args) {
        int numero, factorial = 1;
        Scanner reader = new Scanner(System.in);

        System.out.print("Escribe un número:");
        numero = reader.nextInt();

        while (numero>1) {
            factorial *= numero;
            numero--;
        }
        
        System.out.println("El factorial es " + factorial);
    }
}
