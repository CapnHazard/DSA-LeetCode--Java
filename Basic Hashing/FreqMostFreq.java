//LeetCode Q1838. Frequency of MOst Frequent Element (atmost 'k' operations)
import java.util.*;
class FreqMostFreq {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        long totalCount = 0;
        int maxFreq = 1;
        for(int right = 1; right < nums.length; right++) {
            totalCount += (long) (nums[right] - nums[right - 1]) * (right - left);

            while(totalCount > k) {
                totalCount -= nums[right] - nums[left];
                left++;
            }
            maxFreq = Math.max(maxFreq, right - left + 1);
        }
        return maxFreq;
    }
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int nums [] = new int [size];
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        System.out.println("Enter elements of array: ");
        for(int i = 0; i < size; i++) {
            System.out.print("-> ");
            nums[i] = sc.nextInt();
        }
        FreqMostFreq obj = new FreqMostFreq();
        System.out.println(obj.maxFrequency(nums, k));
        sc.close();
    }
}