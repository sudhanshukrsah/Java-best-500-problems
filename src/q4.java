//Find factorial of n (iterative & recursive)

public class q4 {
    public static void main(String[] args) {
    int n = 5;
    int factorial = 1;
    for(int i = 1; i <= n; i++){
        factorial = factorial*i;

    }
        System.out.println("factorial of " + n + " is " + factorial);
    }
}
