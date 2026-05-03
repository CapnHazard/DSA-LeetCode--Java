import java.util.*;

public class rhombus {
    public static void main(String[] args){
        System.out.print("n = ");
        Scanner sc = new Scanner(System.in);
        sc.close();
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=n; j>=1; j--){
                System.out.print("* ");
            }
            System.out.println("  ");
        }
    }
}
