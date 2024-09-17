package loop_array;

public class Ex1 {

    public static void order(int a,int b,int c){
        if(a>b && b>c){
            System.out.println("Աճող " + a + b +c );
        } else if (a<b && b<c) {
            System.out.println(" Նվազող" + c + b + a);
        }else System.out.println("ոչ մեկը");
    }
}
