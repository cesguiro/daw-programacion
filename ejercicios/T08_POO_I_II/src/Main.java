import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Coche coche1 = new Coche(
                "Kia",
                "Niro",
                "Gris",
                1234
        );


        /**
         * Ejercicio 1
         */
        System.out.println("Mi coche es un " +
                coche1.marca +
                " "  + coche1.modelo +
                " de color " + coche1.color +
                " con número de bastidor " + coche1.numBastidor
        );

        /**
         * Ejercicio 2
         */
        System.out.println(coche1);

        /**
         * Ejercicio 3
         */
        /*coche1.frenar();
        System.out.println(coche1);
        coche1.acelerar();
        coche1.acelerar();
        System.out.println(coche1);
        coche1.frenar();
        System.out.println(coche1);*/

        /**
         * Ejercicio 4
         */
        /*coche1.acelerar(20);
        System.out.println(coche1);
        coche1.frenar(15);
        System.out.println(coche1);*/

        /**
         * Ejercicio 5, 6, 7
         */
        Coche coche2 = new Coche(
                "Ford",
                "Fiesta",
                "blanco",
                5678
        );

        Coche coche3 = new Coche(
                "Renault",
                "Scenic",
                "negro",
                9123
        );

        Flota flota = new Flota();

        flota.addCoche(coche1);
        flota.addCoche(coche2);
        flota.addCoche(coche3);
        System.out.println(flota);

        /**
         * Ejercicio 5, 6
         */
        /*if(!flota.removeCoche(9123)) {
            System.out.println("No se encuentra el coche en la flota");
        }
        System.out.println(flota);*/

        /**
         * Ejercicio 7
         */
        /*System.out.print("Introduce el número de bastidor: ");
        int numBastidor = reader.nextInt();
        if(!flota.removeCoche(numBastidor)) {
            System.out.println("No existe ningún coche con número de bastidor " + numBastidor);
        } else {
            System.out.println("Se ha eliminado el coche con número de bastidor " + numBastidor);
        }
        System.out.println(flota);*/

        /**
         * Ejercicio 8
         */
        Conductor conductor1 = new Conductor("Pepe");
        Conductor conductor2 = new Conductor("María");
        System.out.println(conductor1);
        System.out.println(conductor2);
        conductor1.asignarCoche(1234, flota);
        System.out.println(conductor1);

        /**
         * Ejercicio 10, 11
         */
        /*if(!conductor1.removeCoche()) {
            System.out.println("Este conductor no tiene asignado ningún coche");
        }
        if(!conductor2.removeCoche()) {
            System.out.println("Este conductor no tiene asignado ningún coche");
        }
        System.out.println(conductor1);*/

        /**
         * Ejercicio 12
         */
        /*Coche cocheBuscado = flota.buscarCoche(1234);
        if(cocheBuscado != null) {
            conductor2.setCoche(cocheBuscado);
        }
        System.out.println(conductor2);*/
    }
}
