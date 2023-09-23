class SentenciaIf {
    
    public static void main(String[] args) {
        int number = 3;

        /*if(number<5) 
        {
            System.out.println("El número es menor que 5");
        }
        if(number >= 5)
        {
            System.out.println("El número es mayor o igual que 5");
        }*/

        /*if(number<5) 
        {
            System.out.println("El número es menor que 5");
        } else {
            System.out.println("El número es mayor o igual que 5");
        }*/

        /*if(number<5 && number>2)
        {
            System.out.println("El número es menor que 5 y mayor que 2");
        }*/

        if(number<5)
        {
            System.out.println("El número es menor que 5");
        } else if (number < 8) {
            System.out.println("El número está en el rango [5, 8[");
        } else if (number <10){
            System.out.println("El número está en el rango [8, 10[");
        } else {
            System.out.println("El número es mayor que 10");
        }

        System.out.println("Fin del programa");
    }
}
