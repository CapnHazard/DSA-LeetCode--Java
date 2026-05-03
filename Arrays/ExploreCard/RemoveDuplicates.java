import java.util.*;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        int k = 1;
        for(int right = 1; right < nums.length && left < nums.length; right++) {
            if(nums[right] != nums[left]) {
                left++;
                nums[left] = nums[right];
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
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

        RemoveDuplicates obj = new RemoveDuplicates();
        System.out.println(obj.removeDuplicates(nums));
        sc.close();

    }
}
