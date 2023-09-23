class SentenciaBreak {

    public static void main(String[] args) {
        /*for(int i=0;i<10;i++) {
            System.out.println(i);
            if(i>4) {
                break;
            }
        }*/

        for(int i=0;i<10;i++) {
            if(i==4) {
                continue;
            }
            System.out.println(i);
        }
    }


}
