public class Loops {

    public static void main(String[] args) {

        //for loop
        //The sum of the numbers from 1 to 10:
        /*int result = 0;
        for (int i = 1; i <= 10; i++) {

            result += i;

            System.out.println(result);

        }
         */

        //The sum of odd numbers from 1 to 10:
        /*int a = 0;
        for (int j = 1; j <= 10; j+=2){

            a += j;

            System.out.println(a);
        }
         */

        //while loop
        int k = 1;
        int b = 0;
        while (k <= 10 ) {

            b += k;
            k++;

            System.out.println(b);
        }

        //do-while loop
        int l = 100;
        do {
            System.out.println(l);
            l += 2;
        } while (l < 10);

        System.out.println("Loop is over");  //Even if the loop is wrong, it runs at least once.

    }

}
