import java.util.HashSet;
import java.util.Scanner;

public class LongestConsecutiveSequence {
    //[100, 4, 200, 1, 3, 2]
    // 0  1  2  3  4  5  6  7  8  9 
    //[0, 3, 7, 2, 5, 8, 4, 6, 0, 1] 

    public int findLongestSeq(int [] nums) {
        HashSet <Integer> hs = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }
        int a = 0; int max = 0; 
        for(int i = 0; i < nums.length; i++) {
            if(!hs.contains(nums[i] - 1)) {
                a = 1;
                while(hs.contains(nums[i] + 1)) {
                    nums[i]++;
                    a++;
                }
                max = Math.max(max, a);
            }
        }
        return max;
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
        LongestConsecutiveSequence obj = new LongestConsecutiveSequence();
        System.out.println(obj.findLongestSeq(nums));
        sc.close();
    }
}
