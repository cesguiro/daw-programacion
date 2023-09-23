class LlamadaFuncion {

    static int add(int number1, int number2) {
        return number1 + number2;
    }

    static void changeNumber(int number1) {
        number1 = 10;
    }

    static void changeString(String cadena) {
        cadena = "Hola universo";
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int result;
        String cadena = "Hola mundo";

        result = add(a, b);

        System.out.println(a);
        changeNumber(a);
        System.out.println(a);

        System.out.println(cadena);
        changeString(cadena);
        System.out.println(cadena);
        
    }

}
