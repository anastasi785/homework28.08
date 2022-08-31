public class Main {
    public static void main(String[] args) {
        //Задание 1
        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        System.out.println(weights[0]);
        System.out.println(weights[1]);
        System.out.println(weights[2]);
        double[] weight1 = {1.57, 7.654, 9.986};
        System.out.println(weight1[0]);
        System.out.println(weight1[1]);
        System.out.println(weight1[2]);
        char[]numbers = {34,41};
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);


        // задание 2
        for (int i = weights.length; i <= 1; i++)
            System.out.println(i + ",");
        //задание 3

        for (int i = weight1.length; i >= 1; i--)

            System.out.println( i+",");

        //задание 4
        int i = weights[0];
        int results=0;
        for (i = 1; i < 2; i = +1) ;
        if (weights[i] % 2 != 0){
                results=results+1;}
            System.out.println(i);

        }

    }


