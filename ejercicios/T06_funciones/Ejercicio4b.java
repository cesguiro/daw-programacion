class Ejercicio4b {

    static int sumarImpares(int... numbers) {
        int suma = 0;
        for (int i = 0; i < numbers.length; i++) {
            if((numbers[i]%2) == 1)
                suma += numbers[i];
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.println("Resultado: " + sumarImpares(2, 3, 5, 6, 9));
        System.out.println("Resultado: " + sumarImpares(2, 3, 8, 1));
    }

}
