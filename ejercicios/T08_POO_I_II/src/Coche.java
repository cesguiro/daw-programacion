public class Coche {

    String marca;
    String modelo;
    String color;
    int numBastidor;
    int velocidad = 0;

    public Coche(String marca, String modelo, String color, int numBastidor) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.numBastidor = numBastidor;
    }

    public Coche() {

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumBastidor() {
        return numBastidor;
    }

    public void setNumBastidor(int numBastidor) {
        this.numBastidor = numBastidor;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", numBastidor=" + numBastidor +
                ", velocidad=" + velocidad +
                '}';
    }

    /**
     * Ejercicio 3
     */
    public void acelerar(){
        this.velocidad += 5;
    }

    public void frenar(){
        this.velocidad -= 5;
        if(this.velocidad < 0) {
            this.velocidad = 0;
        }
    }

    /**
     * Ejercicio 4
     */
    public void acelerar(int incremento) {
        this.velocidad += incremento;
    }

    public void frenar(int decremento) {
        this.velocidad -= decremento;
    }
}
