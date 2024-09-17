package loop_array;

import java.util.Scanner;

public class Ex6 {

    public static void minMaxNumber(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j <numbers.length ; j++) {
                if (numbers[i]>numbers[j]){
                    int a = numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=a;
                }
            }
        }

        System.out.println("min number is = " + numbers[0]);
        System.out.println("max number is = " + numbers[numbers.length-1]);

















        
    }
}
