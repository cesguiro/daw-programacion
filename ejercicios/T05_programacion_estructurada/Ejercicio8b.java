import java.util.Scanner;

class Ejercicio8b {

    public static void main(String[] args) {
        int numero, resultado, suma;
        Scanner reader = new Scanner(System.in);

        System.out.print("Escribe un número:");
        numero = reader.nextInt();

        for (int index = 1; index<10; index++) {
            resultado = numero * index;
            System.out.println(numero + "*" + index + " = " + resultado);
            suma = 1;
            for(int j = 2; j<=resultado; j++) {
                suma += j;
            }
            System.out.println("Suma: " + suma);
        }
    }

}
