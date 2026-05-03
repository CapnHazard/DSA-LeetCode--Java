import java.util.*;

public class num_pyr {
    public static void main(String[] args){
        System.out.print("n = ");
        Scanner sc = new Scanner(System.in);
        sc.close();
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=n; j>n-i; j--){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
    }
}
//only works for single digit n ie 1 to 9. As spacing is thrown off when n becomes 2 digit.