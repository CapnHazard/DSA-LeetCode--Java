import java.util.Scanner;

public class UglyNumber {
    public boolean isUgly(int n) {
        if(n <= 0) return false;

        while(n % 2 == 0) {
            n = n/2;
        }
        while(n % 3 == 0) {
            n = n/3;
        }
        while(n % 5 == 0) {
            n = n/5;
        }
        return n == 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        UglyNumber obj = new UglyNumber();
        System.out.println(obj.isUgly(n));
        sc.close();
    }
}
