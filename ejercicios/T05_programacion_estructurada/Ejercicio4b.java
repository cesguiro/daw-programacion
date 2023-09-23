import java.util.Scanner;

class Ejercicio4b {

    
    public static void main(String[] args) {
        String color;
        Scanner reader = new Scanner(System.in);

        System.out.print("Escribe un color:");
        color = reader.nextLine();

        switch (color.toLowerCase()) {
            case "rojo" -> System.out.println("Color de la sangre");
            case "azul" -> System.out.println("Color del cielo");
            case "amarillo" -> System.out.println("Color del sol");
            default -> System.out.println("Lo siento, ese color es muy aburrido");
        }
    }
}
