//SOLUTION JUST BELOW IS BETTER, MORE LOGICAL, MORE REUSABLE.
import java.util.*;
public class ReverseNum{
    public int reverse_num(int n){
        int revNum = 0;
        while(n>0){
            int lastDigit = n % 10;
            revNum = (revNum * 10) + lastDigit;
            n = n/10;
        }
        System.out.print("Reversed number is: "+ revNum);
        return revNum;
    }
    public static void main(String[] args) {
        ReverseNum obj = new ReverseNum();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to be revresed: ");
        int x = sc.nextInt();
        obj.reverse_num(x);
        sc.close();
    }
}



/* 
 
import java.util.*;
public class reverse_num{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int length = String.valueOf(number).length();
        System.out.println("Length of number: " + length);
        int array [] = new int[length];
        for(int i=0; i<length; i++){
            array[i] = number%10;
            number = number/10;
        }
        System.out.print("Reversed number: ");
        for(int i=0; i<length; i++){
            System.out.print(array[i]);
        }
    }
}
    */