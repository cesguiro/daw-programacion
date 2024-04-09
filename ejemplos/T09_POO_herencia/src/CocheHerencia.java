import java.util.Arrays;

public class CocheHerencia extends Vehiculo{

    boolean ruedaRepuesto;

    public CocheHerencia(String marca, String modelo, int velocidad, float[] presionRuedas, boolean ruedaRepuesto) {
        super(marca, modelo, velocidad, presionRuedas);
        this.ruedaRepuesto = ruedaRepuesto;
    }


    @Override
    public void acelerar(int incremento) {
        super.acelerar(incremento);
        this.velocidad += 10;
    }

    @Override
    public String toString() {
        return "CocheHerencia{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
