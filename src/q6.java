//Reverse a number (e.g., 1234 → 4321)

public class q6 {
    public static void main (String[] args){
    int num = 1234;
    int reverse = 0;

    while(num != 0){
        int digit = num%10;
        reverse =  reverse*10 + digit;
        num = num/10;

    }
        System.out.println(reverse);

    }
}
