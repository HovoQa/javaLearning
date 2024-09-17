package loop_array;

public class Ex8 {


    public static void powerCalculate(int n , int k){
        int sum = 1;
        for (int i = 0; i < k; i++) {
            sum = sum * n;
        }
        System.out.println(sum);
    }
}
