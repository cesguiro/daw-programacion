public class Ejercicio1c {

    public static void main(String[] args) {
    
        int[] numeros = {1, 2, 3, 5, 8, 13, 21, 34, 55};

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] *= numeros[i];
        }

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
