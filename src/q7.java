//Check Armstrong number
//🧠 What is an Armstrong Number?
//
//👉 An Armstrong number (also called a Narcissistic number) is a number that is equal to the sum of the cubes (or power of digits) of its own digits.


public class q7 {
    public static void main(String[] args) {
        int num = 153;
        int result = 0;

        // Count digits

        int n = 0;
        int temp = num;
        while (temp != 0) {
            temp = temp / 10;
            n++;
        }

        // Calculate sum of each digit raised to n-th power
        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            result += Math.pow(digit, n); 
            temp = temp / 10;
        }

        //compare with num

        if (result == num) {
            System.out.println(num + " " + " is Armstronge Number");
            
        }
        else {
            System.out.println(num + " " + " is not Armstronge Number");
        }



    }
}
