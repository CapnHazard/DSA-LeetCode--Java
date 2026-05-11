import java.util.HashMap;
import java.util.Scanner;

public class LongestSubArraySumZero {
    public int findLengthOfSubArray(int nums []) {
        int sum = 0; int length = 0;
        HashMap <Integer, Integer> hm = new HashMap<>();
        hm.put(0, -1);
        for(int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if(hm.containsKey(sum)) {
                length = Math.max(length, i - hm.get(sum));
            } else {
                hm.put(sum, i);
            }
        }
        return length;
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
        LongestSubArraySumZero obj = new LongestSubArraySumZero();
        System.out.println(obj.findLengthOfSubArray(nums));
        sc.close();
    }
}