
import java.util.*;
public class Butterfly_pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.close();
        int n = sc.nextInt();
        //upper part
        for(int i=1; i<=n; i++){
            //1st part stars
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            //spaces
            for(int j=1; j<=(2*(n-i)); j++){
                System.out.print("  ");
            }
            //2nd part stars
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println("   ");
        }
        //lower part
        for(int i=n; i>=1; i--){
            //1st part stars
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            //spaces
            for(int j=1; j<=(2*(n-i)); j++){
                System.out.print("  ");
            }
            //2nd part stars
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println("  ");
        }
    }
}