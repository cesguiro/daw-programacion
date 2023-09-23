class PasoArrayParametro {

    static void inicilizaArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 5;
        }
    }
    public static void main(String[] args) {
        int[] numbers = new int[3];

        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----");
        inicilizaArray(numbers);
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

}
