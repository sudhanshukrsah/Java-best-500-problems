//Check whether a number is prime.

//public class q3 {
//    public static void main(String[] args){
//
//    int x = 7;
//      if (x%1 == 0 && x%x == 0){
//          System.out.println("x is prime number");
//      }
//      else {
//          System.out.println("x is not a prime number");
//      }
//    }
//}
public class q3 {
    public static void main(String[] args) {
        int x = 7;
        boolean isPrime = true;
        if (x <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(x + " is a prime number");
        } else {
            System.out.println(x + " is not a prime number");
        }
    }
}
