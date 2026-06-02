import java.util.Scanner;

public class SqrtX {
    public int findSqrt(int x) {
        if(x == 0 || x == 1) return x;
        int low = 1;
        int high = x/2;
        int ans = 0;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if( (long) mid * mid == x) {
                ans = mid;
                break;
            } else if( (long) mid * mid < x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = sc.nextInt();
        SqrtX obj = new SqrtX();
        System.out.println(obj.findSqrt(x));
        sc.close();
    }
}
