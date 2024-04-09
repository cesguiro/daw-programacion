public class Calculadora {

    private static int resultado;

    public static int sumar(int number1, int number2) {
        //return number1 + number2;
        resultado = number1 + number2;
        return resultado;
    }

    public static int restar(int number1, int number2) {
        //return number1 - number2;
        resultado = number1 - number2;
        return resultado;
    }

    public static int multiplicar(int number1, int number2) {
        //return number1 * number2;
        resultado = number1 * number2;
        return resultado;
    }

    public static int dividir(int number1, int number2) {
        //return number1 / number2;
        resultado = number1 / number2;
        return resultado;

    }
}
