import java.util.Scanner;

class Ejercicio1b {

    public static void main(String[] args) {
        int edad;
        Scanner reader = new Scanner(System.in);
        String frase = "Puedes pasar";

        System.out.print("Escribe tu edad: ");
        edad = reader.nextInt();

        if(edad < 18) {
            frase = "No puedes pasar";
        }

        System.out.println(frase);
    }
}
