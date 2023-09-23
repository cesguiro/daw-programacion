class SentenciaSwitch2 {

    public static void main(String[] args) {
        int numero = 3;

        /*switch (numero) {
            case 1:
                System.out.println("El número es 1");
                break;
            case 2:
                System.out.println("El número es 2");
                break;
            case 3:
                System.out.println("El número es 3");
                break;
            case 4:
                System.out.println("El número es 4");
                break;
            default:
                System.out.println("El número es mayor que 4");
                break;
        }*/

        switch (numero) {
            case 1 -> System.out.println("El número es 1");
            case 2 -> System.out.println("El número es 2");
            case 3 -> System.out.println("El número es 3");
            case 4 -> System.out.println("El número es 4");
            default -> System.out.println("El número es mayor que 4");
        }
    }

}
