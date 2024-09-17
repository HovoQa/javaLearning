package loop_array;

public class Ex3 {
    public static void action(char action,int a,int b){

        switch (action){
            case '+' :
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b );
                break;
            case '*':
                System.out.println( a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
        }
    }
}
