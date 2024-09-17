package loop_array;

public class EX2 {
    public static void nahanjTari(int date){

        if(date%100!=0 && date%4==0){
            System.out.println("տարին նահանջ է");
        } else if (date%400==0) {
            System.out.println("տարին նահանջ է");
        } else System.out.println("տարին նահանջ չէ");
    }
}
