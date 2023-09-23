class Ejercicio4a {

    static int sumar(int... numbers) {
        int suma = 0;
        for (int i = 0; i < numbers.length; i++) {
            suma += numbers[i];
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.println("Resultado: " + sumar(2, 3));
        System.out.println("Resultado: " + sumar(2, 3, 8));
    }

}
