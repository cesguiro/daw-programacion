import java.util.Arrays;

public class Vehiculo {
    protected String marca, modelo;
    protected int velocidad = 10;
    protected float[] presionRuedas;

    public Vehiculo(String marca, String modelo, int velocidad, float[] presionRuedas) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.presionRuedas = presionRuedas;
    }

    public void acelerar(int incremento) {
        this.velocidad += incremento;
    }

    public void frenar(int decremento) {
        this.velocidad -= decremento;
    }

    public void aumentarPresion(int rueda, float presion){
        presionRuedas[rueda] = Math.round((presionRuedas[rueda] + presion) * 10.0) / 10.0f;
    }

    public void reducirPresion(int rueda, float presion) {
        presionRuedas[rueda] = Math.round((presionRuedas[rueda] - presion) * 10.0) / 10.0f;
    }

    @Override
    public String toString(){
        return "Marca: " + this.marca +
                "\nModelo: " + this.modelo +
                "\nVelocidad: " + this.velocidad +
                "\nPresión ruedas: " + Arrays.toString(this.presionRuedas);
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

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public float[] getPresionRuedas() {
        return presionRuedas;
    }

    public void setPresionRuedas(float[] presionRuedas) {
        this.presionRuedas = presionRuedas;
    }
}
