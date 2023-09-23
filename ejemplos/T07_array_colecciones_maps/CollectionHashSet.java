import java.util.HashSet;
import java.util.Set;

class CollectionHashSet {

    public static void main(String[] args) {
        //HashSet<Integer> conjunto = new HashSet<Integer>();
        Set<Integer> conjunto = new HashSet<>();
        //Integer n = new Integer(10);

        /*conjunto.add(2);
        conjunto.add(10);
        conjunto.add(3);
        conjunto.add(23);
        conjunto.add(99);*/

        //conjunto = Set.of(2, 10, 3, 23, 99);

        
        conjunto.add(2);
        conjunto.add(10);
        conjunto.add(3);
        conjunto.add(23);
        conjunto.add(99);
        conjunto.add(10);


        if(!conjunto.add(10)) {
            System.out.println("El número ya está en la lista");
        }


        for (Integer number : conjunto) {
            System.out.println(number);
        }

        /*if (!conjunto.add(n)) {
            System.out.println("Número ya en la lista.");
        }*/
    }
}
