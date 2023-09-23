class Sobrecarga {

    static void myFunction(int a) {
        System.out.println("Llamada al método con un parámetro de tipo entero");
    }

    static void myFunction(float a) {
        System.out.println("Llamada al método con un parámetro de tipo float");
    }

    static void myFunction(int a, int b) {
        System.out.println("Llamada al método con dos parámetros de tipo entero");
    }

    static int myFunction() {
        System.out.println("Llamada al método sin parámetros. devolvemos el número 5");
        return 5;
    }


    public static void main(String[] args) {
        int a=1, b=2;
        float c=3.0f;

        myFunction(a);
        myFunction(c);
        myFunction(a, b);
        myFunction();
    }
}
