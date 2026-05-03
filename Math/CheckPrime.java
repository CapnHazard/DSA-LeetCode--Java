import java.lang.Math;
import java.util.Scanner;

public class CheckPrime {
    public void IsPrime(int x){
        int limit = (int) Math.sqrt(x);
        boolean isPrime = true;
        if(x==1){
            System.out.println("Not prime");
            return;
        }
        for(int i=2; i<=limit; i++){
            if(x%i == 0){
                isPrime = false;  
            }
        } 
        if(isPrime == true){
            System.out.println("Prime");
        } else if(isPrime == false){
            System.out.println("Not prime");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = sc.nextInt();
        CheckPrime obj = new CheckPrime();
        obj.IsPrime(x);
        sc.close();
    }
}
