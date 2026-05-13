import java.util.Scanner;

public class MaximumSubArray {
    public int maxSubArray(int [] nums) {
        //Kadane Algo
        int maxsum = nums[0];
        int sum = maxsum; 
        for(int i = 1; i < nums.length; i++) {
            if(sum < 0) {
                sum = 0;
            }
            sum += nums[i];
            maxsum = Math.max(maxsum, sum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int nums [] = new int [size];
        System.out.println("Enter elements of array: ");
        for(int i = 0; i < size; i++) {
            System.out.print("-> ");
            nums[i] = sc.nextInt();
        }
        MaximumSubArray obj = new MaximumSubArray();
        System.out.println(obj.maxSubArray(nums));
        sc.close();
    }
}
