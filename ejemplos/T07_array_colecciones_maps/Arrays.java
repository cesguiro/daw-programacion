class Arrays {

    public static void main(String[] args) {
        //int[] numbers;
        //int numbers[];
        //int[] numbers = new int[10];
        int[] numbers = {1, 3, 4, 5, 6, 7, 8, 9, 0, 1};
        int number;

        int[][] m = new int[5][5];
        //int[][] m = {{3, 5, 6}, {2, 4, 9}, {10, 2, 1}};

        //numbers = new int[10];

        numbers[3] = 10;

        number = numbers[3];

        System.out.println(numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 3;
        }

        for (int i : numbers) {
            System.out.println(i);    
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = j + 1;
            }  
        }

        for (int[] i : m) {
            for (int j : i) {
                System.out.println(j);
            }       
        }
        
        int[][] irregular = new int[3][];

        irregular[0] = new int[5];
        irregular[1] = new int[7];
        irregular[2] = new int[8];


    }
}
