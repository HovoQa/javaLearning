package loop_array;

public class Ex9 {


    public static void armstrongNumber(int start,int end){
        int sum;
        for (int i = start; i < end; i++){
                if (i > 0 && i < 10){
                    sum = (int)Math.pow(i%10,1);
                }
                else if(i>9 && i<99){
                    sum  = (int)Math.pow(i/10,2) + (int)Math.pow(i%10,2);
                }else  sum = (int)Math.pow(i/100,3)+(int)Math.pow(i%100/10,3) + (int)Math.pow(i%100%10,3);

            if(i==sum) System.out.println(+sum);

        }

    }

}
