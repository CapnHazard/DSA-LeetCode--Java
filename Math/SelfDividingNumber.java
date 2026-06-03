import java.util.*;

public class SelfDividingNumber {
    public List <Integer> selfDividing(int left, int right) {
        List <Integer> ls = new ArrayList<>();
        for(int i = left; i <= right; i++) {
            int copy = i;
            boolean div = true;
            int digit = i % 10;
            while(copy > 0) {
                digit = copy % 10;
                if(digit == 0) {
                    div = false;
                    break;
                } 
                if(i%digit != 0) {
                    div = false;
                    break;
                }
                copy /= 10;
            }
            if(div == true) {
                ls.add(i);
            }
        }
        return ls;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter left value: ");
        int left = sc.nextInt();
        System.out.print("Enter right value: ");
        int right = sc.nextInt();
        if(left >= right) {
            System.err.println("Left value should be less than right value.");
        }
        SelfDividingNumber obj = new SelfDividingNumber();
        System.out.println(obj.selfDividing(left, right));
        sc.close();
    }
}
