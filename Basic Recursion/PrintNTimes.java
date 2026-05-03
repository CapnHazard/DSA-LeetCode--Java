import java.util.Scanner;

public class PrintNTimes{
    public void print(String x, int n){
        System.out.println(x);
        if(n==1){
            System.out.println("Done");
        } else {
            print(x, n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String x = sc.nextLine();
        System.out.println("Number: ");
        int n = sc.nextInt();
        PrintNTimes obj = new PrintNTimes();
        obj.print(x, n);
        sc.close();
    }
}