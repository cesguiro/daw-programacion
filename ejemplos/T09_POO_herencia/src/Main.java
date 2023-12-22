public class Main {

    public static void main(String[] args) {
        /*Coche coche = new Coche(
                "Kia",
                "Niro",
                0,
                true,
                new float[] {2.4f, 2.4f, 2.4f, 2.4f}
        );
        System.out.println(coche);
        coche.acelerar(10);
        coche.cambiarRueda();
        coche.reducirPresion(0, 0.5f);
        coche.aumentarPresion(1, 0.3f);
        coche.frenar(3);
        coche.cambiarRueda();
        System.out.println(coche);*/

        /*CocheHerencia cocheHerencia = new CocheHerencia(
                "Kia",
                "Niro",
                0,
                new float[] {2.4f, 2.4f, 2.4f, 2.4f}
        );
        System.out.println(cocheHerencia);*/

        Parking parking = new Parking();
        Vehiculo coche1 = new CocheHerencia(
                "ford",
                "fiesta",
                10,
                null,
                true

        );
        parking.aparcar(coche1);

        Vehiculo moto1 = new MotoHerencia(
                "yamaha",
                "YZR",
                0,
                null
        );
        parking.aparcar(moto1);

        System.out.println(parking);
    }
}
