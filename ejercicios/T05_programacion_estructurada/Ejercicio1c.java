import java.util.Scanner;

class Ejercicio1c {

    public static void main(String[] args) {
        int edad;
        Scanner reader = new Scanner(System.in);
        String frase;

        System.out.print("Escribe tu edad: ");
        edad = reader.nextInt();

        frase = (edad<18)? "No puedes pasar": "Puedes pasar";

        System.out.println(frase);
    }
}
