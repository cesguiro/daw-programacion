import java.util.Arrays;

public class Moto {
    private String marca, modelo;
    private int velocidad;
    private float[] presionRuedas = new float[2];

    public Moto(String marca, String modelo, int velocidad, float[] presionRuedas) {
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
        System.out.println(presion);
        presionRuedas[rueda] = Math.round((presionRuedas[rueda] - presion) * 10.0) / 10.0f;
    }

    @Override
    public String toString(){
        return "Marca: " + this.marca +
                "\nModelo: " + this.modelo +
                "\nVelocidad: " + this.velocidad +
                "\nPresión ruedas: " + Arrays.toString(this.presionRuedas);
    }

}
