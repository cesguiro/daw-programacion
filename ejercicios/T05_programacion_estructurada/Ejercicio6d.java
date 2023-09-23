import java.util.Scanner;

class Ejercicio6d {

    public static void main(String[] args) {
        int numero;
        String resultado = "";
        Scanner reader = new Scanner(System.in);

        System.out.print("Escribe un número:");
        numero = reader.nextInt();

        for(int index=1; index<=numero; index++) {
            if((index%2)!=0) {
                continue;
            }
            resultado += index + ", ";
        }

        resultado = resultado.substring(0, resultado.length()-2);

        System.out.println(resultado);
    }
}
