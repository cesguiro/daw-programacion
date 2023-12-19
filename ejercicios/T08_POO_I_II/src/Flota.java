import java.util.ArrayList;
import java.util.List;

public class Flota {

    List<Coche> cocheList = new ArrayList<>();

    public void addCoche(Coche coche) {
        cocheList.add(coche);
    }

    public boolean removeCoche(int numBastidor){
        for (Coche coche: cocheList) {
            if(coche.getNumBastidor() == numBastidor) {
                cocheList.remove(coche);
                return true;
            }
        }
        return false;
    }

    public Coche buscarCoche(int numBastidor){
        for (Coche coche: cocheList) {
            if(coche.getNumBastidor() == numBastidor) {
                return coche;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Flota{" +
                "cocheList=" + cocheList +
                '}';
    }
}
