import java.util.Scanner;

public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int [] ans = new int [2*nums.length];
        int n = nums.length;
        for(int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[n] = nums[i];
            n++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int nums [] = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.print("-> ");
            nums[i] = sc.nextInt();
        }
        ConcatenationOfArray obj = new ConcatenationOfArray();
        System.out.println(obj.getConcatenation(nums));
        sc.close();
    }
}
