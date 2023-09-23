import java.util.HashMap;
import java.util.Map;

class MapHashMap {

    public static void main(String[] args) {
        Map<String, Integer> diccionario = new HashMap<String, Integer>();
        int valor;

        /*diccionario.put("edad", 18); //añadimos el par clave = "edad" / valor = 18 
        diccionario.put("año", 2022); //añadimos el par clave = "año" / valor = 2022
        diccionario.put("edad", 34); //Sustituimo el valor de la clave "edad"*/

        diccionario = Map.of("edad", 18, "año", 2022);

        //Recorremos el HashMap y mostramos las claves y los valores
        for (String clave : diccionario.keySet()) { 
            valor = diccionario.get(clave);
            System.out.println(clave + ": " + valor);
        }
    }
}
