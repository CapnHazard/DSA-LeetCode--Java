//Better approach
import java.lang.Math;
import java.util.Scanner;
public class PrintDivisors{
    public void ShowDivisors(int x){
        //logic: if d divides n, then n/d also divides n.
        int limit = (int) Math.sqrt(x);
        System.out.println("Divisors of " + x + " are: ");
        for(int i=1; i<=limit; i++){
            if(x%i == 0 && i != x/i){
                System.out.println(i + " " + x/i);
            } else if(x%i == 0){
                System.out.println(i);
            }
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = sc.nextInt();
        PrintDivisors obj = new PrintDivisors();
        obj.ShowDivisors(x);
        sc.close();
    }
}
/*
import java.util.Scanner;

public class PrintDivisors {
    public void ShowDivisors(int x){
        System.out.println("Divisors of " + x + " are: ");
        for(int i=1; i<=x; i++){
            if(x%i == 0){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x= sc.nextInt();
        PrintDivisors obj = new PrintDivisors();
        obj.ShowDivisors(x);
        sc.close();
    }
}
*/