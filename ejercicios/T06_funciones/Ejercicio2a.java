import java.util.Scanner;

public class Ejercicio2a {
    
    static int showMenu(){
        int option;
        Scanner reader = new Scanner(System.in);

        System.out.println("1.- Opción A");
        System.out.println("2.- Opción B");
        System.out.println("3.- Opción C");
        System.out.println("--------------------");
        System.out.print("Opción:");
        option = reader.nextInt();
        return option;
    }

    public static void main(String[] args) {
        int option;

        option = showMenu();
        System.out.println("Ha elegido la opción " + Integer.toString(option));        
    }
}
