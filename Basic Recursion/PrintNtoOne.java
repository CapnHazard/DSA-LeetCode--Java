import java.util.Scanner;

public class PrintNtoOne {
    public void printr(int x){
        if(x<=0){
            //System.out.println("Invalid input");
            return;
        }
        System.out.println(x);
        if(x>0){
            printr(x-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = sc.nextInt();
        PrintNtoOne obj = new PrintNtoOne();
        obj.printr(x);
        sc.close();
    }
}
