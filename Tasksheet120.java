import java.util.*;
public class Tasksheet120 {

    public static void main(String[] args) {
        
        TotalSum4();
        TotalSum5();
        TotalSum10();
        }

        public static void TotalSum4(){
            int sum = 0;

            int total [] = {1,2,3,4};

            for (int i=0; i < total.length; i++) {

                sum += total[i];

                total[i] = sum;

            }

            System.out.println("Cummulative sum of 4 is: ");
            System.out.println(Arrays.toString(total));
        }

        public static void TotalSum5(){
        int add = 0;

        int equal [] = {1,2,3,4,5};

        for (int i=0; i < equal.length; i++) {

            add += equal[i];

            equal[i] = add;

        }

        System.out.println("Cummulative sum of 5 is: ");
        System.out.println(Arrays.toString(equal));
    }

    public static void TotalSum10(){
        int plus = 0;

        int cummulative [] = {1,2,3,4,5,6,7,8,9,10};

        for (int i=0; i < cummulative.length; i++) {

            plus += cummulative[i];

            cummulative[i] = plus;

        }

        System.out.println("Cummulative sum of 10 is: ");
        System.out.println(Arrays.toString(cummulative));
    }
}
