import java.util.Scanner;

public class SumNumbers {
    public int Sum(int x){
        if(x==0) return 0;
        
        return x + Sum(x-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = sc.nextInt();
        SumNumbers obj = new SumNumbers();
        
        System.out.println(obj.Sum(x));
        sc.close();
    }
}
