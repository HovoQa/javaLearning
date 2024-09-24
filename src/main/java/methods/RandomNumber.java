package methods;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {




    public static void findNumber(int n) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = random.nextInt(0,n);
        System.out.println("Մութքագրեք թիվ  0 -ից " + n +" միջակայքում");
        int input = scanner.nextInt();
        while (input!=number){
            if(input>number) {
                System.out.println("ձեր մուտքագրած թիվը մեծ է է փորձեք նորից");
                input = scanner.nextInt();
            }
            else if (input<number) {
                System.out.println("ձեր մուտքագրած թիվը փոքր է փորձեք նորից");
                input = scanner.nextInt();
            }
        }
        System.out.println("success  you find number");
    }
}
