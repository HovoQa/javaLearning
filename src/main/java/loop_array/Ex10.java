package loop_array;

public class Ex10 {


    public static void fibonacchiSequence(int n) {
        int[] sequence = new int[n];
        int current = 0;
        int next = 1;
        int result = 0;
        for (int i = 0; i < n; i++) {
            sequence[i] = result;
            result = current + next;
            current = next;
            next = result;
        }
        for (int a : sequence
        ) {
            System.out.println(+a);
        }
    }
}
