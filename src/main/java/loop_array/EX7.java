package loop_array;

import java.util.Scanner;

public class EX7 {

    public static void sum(int numberCount){
        Scanner scn = new Scanner(System.in);
        do {
            int sum = 0;
            for (int i = 0; i < numberCount; i++) {
                System.out.println("please enter the number");
                if (scn.hasNextInt()) {
                    sum = sum + scn.nextInt();
                } else System.out.println("incorrect input");
            }
            System.out.println("sum is" + sum);
            System.out.println(" if you have a continue please enter next number " );
        }while (scn.hasNextInt());
    }

}
