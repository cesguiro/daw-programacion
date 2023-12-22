import java.util.UUID;

public class GeneradorId {

    private static GeneradorId instance;

    private GeneradorId(){
    }

    public static GeneradorId getInstance(){
        if(instance == null) {
            instance = new GeneradorId();
        }
        return instance;
    }

    public UUID getUuid() {
        return UUID.randomUUID();
    }
}
