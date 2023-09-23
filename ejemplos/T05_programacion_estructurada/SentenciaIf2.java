class SentenciaIf2 {

    public static void main(String[] args) {
        int a = 5;
        String frase;

        /*if (a<5) {
            frase = "El número es menor que 5";
        } else {
            frase = "El número es mayor que 5";
        }*/

        frase = (a<5)? "El número es menor que 5": "El número es mayor que 5";
        System.out.println(frase);
    }
}
