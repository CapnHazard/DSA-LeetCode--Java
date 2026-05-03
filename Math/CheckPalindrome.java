//SOLUTION BELOW IS AS PER LEETCODE, IT IS MUCH BETTER AS IT COVERS EDGE CASES TOO :)
import java.util.Scanner;
class CheckPalindrome{
    public boolean isPalindrome(int x){
        int copy = x;
        int revNum = 0;
        int sign = (x<0) ? -1 : 1 ;
        x = Math.abs(x);
        while(copy>0){
            int lastDigit = copy % 10;
            if(revNum > Integer.MAX_VALUE/10 || revNum < Integer.MIN_VALUE/10){
                break;
            }
            revNum = (revNum*10) + lastDigit;
            copy = copy/10;
        }
        return sign*revNum == x;
    }
    public static void main(String[] args) {
        CheckPalindrome obj = new CheckPalindrome();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(obj.isPalindrome(input)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
        sc.close();
    }
}



/*
import java.util.Scanner;

public class CheckPallindrome {
    public int IsPallindrome(int n){
        int copy = n;
        int revNum = 0 ;
        while(copy>0){
            int lastDigit = copy%10;
            revNum = (revNum*10) + lastDigit;
            copy = copy/10;
        }
        if(revNum == n){
            System.out.println("Pallindrome");
        } else {
            System.out.println("Not pallindrome");
        }
        return revNum;
    }
    public static void main(String[] args) {
        CheckPallindrome obj = new CheckPallindrome();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        obj.IsPallindrome(input);
    }
}
*/