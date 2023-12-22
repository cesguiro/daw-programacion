import java.util.ArrayList;
import java.util.List;

public class Parking {

    List<Vehiculo> plazas = new ArrayList<>();

    public void aparcar(Vehiculo vehiculo) {
        plazas.add(vehiculo);
    }


    @Override
    public String toString() {
        return "Parking{" +
                "plazas=" + plazas +
                '}';
    }
}
