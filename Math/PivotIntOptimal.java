import java.util.Scanner;

public class PivotIntOptimal {
    public int pivot(int n) {
        int x = (int) Math.sqrt(n*(n+1)/2);
        if(x * x == n*(n+1)/2) {
            return x;
        }
        return -1;
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
