class ParametrosLongitudVariable {

    
    static void myFunction(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        myFunction(a, b);
        myFunction(a, b, c);
        myFunction(a, b, c, d);
    }
}
