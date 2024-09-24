package scanner;

import java.util.Scanner;

public class Scn {


    public static void textLength(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text");
        String text = scanner.nextLine();
        char[] a = new char[text.length()];
        System.out.println(a.length);
    }


    public static void printNewLine(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the text");
        String a= scanner.nextLine();
        char[] b = a.toCharArray();
        for (char c:b
             ) {
            System.out.println(c);
        }
    }
    public static void repetitiveString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the text");
        String a = scanner.nextLine();
        System.out.println("please enter the count");
        int b = scanner.nextInt();
        for (int i = 0; i < b; i++) {
            System.out.print(a);
        }
    }

}
