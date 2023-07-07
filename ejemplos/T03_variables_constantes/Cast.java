class Cast {

    public static void main(String[] args) {
        //Conversión de tipos
        int a = 5;
        double b;

        b = (double) a;
        System.out.println(b);

        //Uso de paréntesis para convertir el resultado de la operación entera
        double c = 5;
        double d = 4;
        int result;

        result = (int) (c * d);
        System.out.println(result);

        //Pérdida de información
        int e = 9;
        int f = 2;
        float g;

        g = (float) (e/f);
        System.out.println(g);

        //Forma correcta
        g = (float) e / f;
        System.out.println(g);
    }
}