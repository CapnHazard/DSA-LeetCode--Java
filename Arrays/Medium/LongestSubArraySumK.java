//only for positive values of K.
import java.util.Scanner;

public class LongestSubArraySumK {
    public int findLengthOfSubArray(int nums [], int k) {
        int length = 0; int maxLength = 0;
        int left = 0;
        int currentSum = 0; 
        for(int right = 0; right < nums.length && left < nums.length; right++) {
            currentSum = nums[right] + currentSum;

            if(currentSum > k) {
                currentSum = currentSum - nums[left];
                left++; 
            }
            if(currentSum == k) {
                length = right - left + 1;
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
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
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        LongestSubArraySumK obj = new LongestSubArraySumK();
        System.out.println(obj.findLengthOfSubArray(nums, k));
        sc.close();
    }
}
