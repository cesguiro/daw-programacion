import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        System.out.println(Calculadora.sumar(3, 4));
        System.out.println(Calculadora.multiplicar(4, 5));

        //Singleton singleton = new Singleton();
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2);

        GeneradorId generadorId = GeneradorId.getInstance();
        UUID uuid1 = generadorId.getUuid();
        UUID uuid2 = generadorId.getUuid();

        System.out.println(uuid1);
        System.out.println(uuid2);
    }
}
