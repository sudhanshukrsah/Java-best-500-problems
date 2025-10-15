//Fibonacci series (iterative & recursive & DP)
public class q5 {
    public static void main(String[] args) {
        int n = 10;
        int first = 0;
        int second = 1;

        System.out.print("fibonacci: " + first + " " + second );

        for (int i = 2; i < n; i++) {
          int next = first + second;
            System.out.print(" " +next);
            first = second;
            second = next;

        }

    }
}
