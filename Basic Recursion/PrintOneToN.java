import java.util.Scanner;

public class PrintOneToN{
    public void print(int x){
        
        if(x==0){
            //System.out.println("Invalid input");
            return;
        }
        print(x-1);
        System.out.println(x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = sc.nextInt();
        PrintOneToN obj = new PrintOneToN();
        obj.print(x);
        sc.close();
    }
}
