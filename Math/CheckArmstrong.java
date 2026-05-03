import java.lang.Math;
import java.util.Scanner;
public class CheckArmstrong {
    public boolean IsArmstrong(int x){
        int copy = x;
        int digits = 0;
        int ArmstrongNumber = 0;
        while(copy>0){
            copy = copy/10;
            digits++;
        }
        int n = digits;
        copy = x;
        while(n>0){
            int LastDigit = copy % 10;
            ArmstrongNumber += Math.pow(LastDigit, digits);
            copy = copy/10;
            n--;
        }
        return ArmstrongNumber == x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = sc.nextInt();
        CheckArmstrong obj = new CheckArmstrong();
        if(obj.IsArmstrong(x)){
            System.out.println(x + " is Armstrong number.");
        } else {
            System.out.println(x + " is not Armstrong number.");
        }
        sc.close();
    }
}
