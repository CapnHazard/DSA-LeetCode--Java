import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public int[] twoSum(int nums [], int target) {
        int x = 0; int i = 0;
        HashMap <Integer, Integer> hm = new HashMap<>();
        for(i = 0; i < nums.length; i++) {
            x = target-nums[i];
            if(hm.containsKey(x)) {
                return new int [] {hm.get(x), i};
            } else {
                hm.put(nums[i], i);
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int nums[] = new int [size];
        System.out.println("Enter elements: ");
        for(int i = 0; i < nums.length; i++) {
            System.out.print("-> ");
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        TwoSum obj = new TwoSum();
        System.out.println(Arrays.toString(obj.twoSum(nums, target)));
        sc.close();
    }
}
