class SentenciaDoWhile {

    public static void main(String[] args) {
        int number = 1;

        /*do {
            System.out.println(number);
            number++;
        } while (number < 10);*/

        number = 10;
        do {
            System.out.println("Bucle do-while: " + number);
            number++;
        } while(number < 10);

        number = 10;

        while (number < 10) {
            System.out.println("Bucle while: " + number);
            number++;            
        }

    }

}
