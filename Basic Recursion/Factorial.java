import java.util.Scanner;

public class Factorial {
    public int FindFactorial(int x){
        if(x == 0 || x == 1) return 1;
        
        return x * FindFactorial(x-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = sc.nextInt();
        Factorial obj = new Factorial();
        System.out.println(x + "! = " + obj.FindFactorial(x));
        sc.close();
    }
}