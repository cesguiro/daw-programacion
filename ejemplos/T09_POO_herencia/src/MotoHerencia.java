public class MotoHerencia extends Vehiculo{

    public MotoHerencia(String marca, String modelo, int velocidad, float[] presionRuedas) {
        super(marca, modelo, velocidad, presionRuedas);
    }

    @Override
    public String toString() {
        return "MotoHerencia{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
