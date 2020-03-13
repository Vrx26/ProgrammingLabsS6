public class Main {
    /**
     * 1st lab of technologies of programming course  - for javadoc
     */
    public static void main(String[] args) {
        System.out.println("task 1");
        System.out.println("Starting project");


        System.out.println("\n task 2");
        byte v_byte = 127;
        short v_short = 129;
        int v_int = 120000;
        long v_long = 12;
        char v_char = 'a';
        boolean v_boolean = true;
        float v_float = 0;
        double v_double = 0.12345;

        System.out.println("byte: " + v_byte);
        System.out.println("short: " + v_short);
        System.out.println("int: " + v_int);
        System.out.println("long: " + v_long);
        System.out.println("char: " + v_char);
        System.out.println("boolean: " + v_boolean);
        System.out.println("float: " + v_float);
        System.out.println("double: " + v_double);


        System.out.println("\n task 3");
        for (int i = (int)'a'; i <= (int)'z'; i++)
            System.out.print((char)i);

        System.out.println();
        long begin = new java.util.Date().getTime();
        long perf=0;
        for (perf = 0; perf <= 100000000; perf++) {
        }
        long end = new java.util.Date().getTime();
        System.out.println(end - begin);


        System.out.println("\n task 5-1");
        int[] mas = {12,43,12,-65,778,123,32,76};
        int max = mas[0];
        for (int val=1; val<mas.length; val++)
        {
            if (mas[val] > max)
                max = mas[val];
        }
        System.out.println(max);


        System.out.println("\n task 5-2");
        int[][] matrix = new int[3][3];
        for (int i=0; i < 3; i++)
            for (int j=0; j < 3; j++)
                matrix[i][j]=(int)Math.round(Math.random()*10);

        System.out.println("original:");
        for (int i=0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        for (int i=0; i < 3; i++) {
            for (int j = i; j < 3; j++) {
                int k = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = k;
            }
        }

        System.out.println("transposed:");
        for (int i=0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

}
