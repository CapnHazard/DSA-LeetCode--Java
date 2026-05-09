import java.util.*;
public class SingleNumber {
    public int singleNumber(int [] nums) {
        int a = nums[0];
        for(int i = 1; i < nums.length; i++) {
            a = nums[i] ^ a;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int nums [] = new int[size];
        System.out.println("Enter elements: ");
        for(int i = 0; i < size; i++) {
            System.out.print("-> ");
            nums[i] = sc.nextInt();
        }
        SingleNumber obj = new SingleNumber();
        System.out.println(obj.singleNumber(nums));
        sc.close();
    }
}
