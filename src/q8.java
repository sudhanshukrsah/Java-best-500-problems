//Count digits of a number without string conversion

public class q8 {
    public static void main(String[] args){

        int num = 123;
        int count = 0;

        int temp = num;
        if (temp == 0){
            count = 1;

        }
        else{
            while(temp!=0){
                temp = temp/10;
                count++;
            }

        }
        System.out.println(count);
    }
}