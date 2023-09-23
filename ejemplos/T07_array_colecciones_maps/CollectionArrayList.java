import java.util.ArrayList;
import java.util.List;

class CollectionArrayList {

    
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        lista.add(1); // Añade un elemento al final de la lista.
        lista.add(3); // Añade otro elemento al final de la lista.
        lista.add(1,2); // Añade en la posición 1 el elemento 2.
        lista.add(lista.get(1)+lista.get(2)); // Suma los valores contenidos en la posición 1 y 2, y lo agrega al final.
        lista.remove(0); // Elimina el primer elementos de la lista.
        for (Integer elemento: lista) {
            System.out.println("Elemento:" + elemento); // Muestra la lista.
        }

        lista.clear();

        lista.add(1); 
        lista.add(2); 
        lista.add(3); 
        lista.add(2);
        lista.set(lista.indexOf(2), 20);
        for (Integer elemento: lista) {
            System.out.println("Elemento:" + elemento); // Muestra la lista.
        }

        //lista = List.of(1, 3, 5, 67);
    }
}
