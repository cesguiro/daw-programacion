import java.util.Scanner;

public class Ejercicio2c {

    static int option;
    
    static void showMenu(){
        Scanner reader = new Scanner(System.in);

        System.out.println("1.- Opción A");
        System.out.println("2.- Opción B");
        System.out.println("3.- Opción C");
        System.out.println("0.- Salir");
        System.out.println("--------------------");
        System.out.print("Opción:");
        option = reader.nextInt();
    }

    public static void main(String[] args) {
        do {
            showMenu();
            System.out.println("Ha elegido la opción " + Integer.toString(option));                    
        } while (option != 0);
    }
}
