import java.util.Scanner;

class Ejercicio1d {

    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);

        float base;
        float height;
        float area;

        System.out.print("Introduce la base: ");
        base = reader.nextFloat();
        System.out.print("Introduce la altura: ");
        height = reader.nextFloat();

        area = (base * height) / 2;
        System.out.println("El área del triángulo es " + area);
    }
}