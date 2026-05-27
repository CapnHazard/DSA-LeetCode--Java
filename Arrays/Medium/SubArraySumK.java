import java.util.HashMap;
import java.util.Scanner;

public class SubArraySumK {
    public int subarraySum(int [] nums, int k) {
        int count = 0; int sum = 0;
        HashMap <Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(map.containsKey(sum - k)) {
                count += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int [] nums = new int [size];
        for(int i = 0; i < size; i++) {
            System.out.print("-> ");
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        SubArraySumK obj = new SubArraySumK();
        System.out.println(obj.subarraySum(nums, k));
        sc.close();
    }
}
