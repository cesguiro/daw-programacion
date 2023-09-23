class Recursividad {

    static int factorialIterativo(int number) {
        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    static int factorialRecursivo(int number) {
        if (number == 1) {
            return 1;
        } else {
            return (number * factorialRecursivo(number-1));
        }
    }
    
    public static void main(String[] args) {
        int a = 5;

        System.out.println(factorialIterativo(a));
        System.out.println(factorialRecursivo(a));
    }
}
