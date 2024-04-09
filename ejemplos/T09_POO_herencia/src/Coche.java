import java.util.Arrays;

public class Coche {

    private String marca, modelo;
    private int velocidad;
    private float[] presionRuedas = new float[4];
    private boolean ruedaRepuesto;

    public Coche(String marca, String modelo, int velocidad, boolean ruedaRepuesto, float[] presionRuedas) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.ruedaRepuesto = ruedaRepuesto;
        this.presionRuedas = presionRuedas;
    }

    public void acelerar(int incremento) {
        this.velocidad += incremento;
    }

    public void frenar(int decremento) {
        this.velocidad -= decremento;
    }

    public void cambiarRueda(){
        if(this.ruedaRepuesto) {
            this.ruedaRepuesto = false;
        } else {
            System.out.println("No existe rueda de repuesto");
        }
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
                "\nRueda repuesto: " + this.ruedaRepuesto +
                "\nPresión ruedas: " + Arrays.toString(this.presionRuedas);
    }
}