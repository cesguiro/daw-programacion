class Operadores {


    public static void main(String[] args) {
        int a, b, resultado;
        char c;
        boolean e;
        String f;

        a = 5;

        c = 'a';
        //c = "b";

        e = true;
        e = false;

        f = "Hola mundo";
        System.out.println(f);
        f = "Hola \"mundo\"";
        System.out.println(f);

        b = 3;

        resultado = a + b;
        System.out.println(resultado);
        resultado = a - b;
        System.out.println(resultado);
        resultado = a * b;
        System.out.println(resultado);
        resultado = a / b;
        System.out.println(resultado);
        resultado = a % b;
        System.out.println(resultado);

        a += b;
        System.out.println(a);

        a = -3;
        System.out.println(-a);

        a = 4;
        System.out.println(a++);
        a = 4;
        System.out.println(++a);

        e = true;
        System.out.println(!e);

        a = 3;
        b = 5;
        System.out.println(a<b);

        System.out.println(a<b && a==4);
        System.out.println(a<b || a==4);

        f = "Hola mundo";
        System.out.println(f.length());

        System.out.println(f.charAt(3));

        System.out.println(f.substring(0, 3));
        System.out.println(f.substring(7));

        System.out.println(f.indexOf("mun"));
        System.out.println(f.indexOf("o", 4));

        System.out.println(f.toUpperCase());

        String g = "Hola mundo";
        System.out.println(f.equals(g));
        String h = "Hola universo";
        System.out.println(f.equals(h));
    }


}