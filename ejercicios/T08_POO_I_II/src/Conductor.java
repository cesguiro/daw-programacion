public class Conductor {

    String nombre;
    Coche coche;

    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public void asignarCoche(int numBastidor, Flota flota) {
        Coche coche = flota.buscarCoche(numBastidor);
        if(coche != null) {
            this.coche = coche;
        }
    }
    
    @Override
    public String toString() {
        if(coche != null) {
            return "Conductor{" +
                    "nombre='" + nombre + '\'' +
                    ", coche=" + coche +
                    '}';
        }

        return nombre + " no tiene asignado ningún coche";
    }

    public boolean removeCoche() {
        if(this.coche != null) {
            this.coche = null;
            return true;
        }
        return false;
    }
}
