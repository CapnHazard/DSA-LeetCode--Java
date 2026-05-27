import java.util.*;

public class PivotInteger {
    public int pivotInt(int n) {
        int x = 0; int sum1 = 0; int sum2 = 0;
        for(int i = 1; i <= n; i++) {
            sum1 = sum1 + i;
            sum2 = 0;
            for(int j = i; j <= n; j++) {
                sum2 = sum2 + j;
            }
            if(sum1 == sum2) {
                x = i;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        PivotInteger obj = new PivotInteger();
        System.out.println(obj.pivotInt(n));
        sc.close();
    }
}
