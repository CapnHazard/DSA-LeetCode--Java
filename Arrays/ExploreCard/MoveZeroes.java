import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if(nums.length == 1) System.out.println(Arrays.toString(nums));
        int left = 0;
        for(int right = 1; right < nums.length; right++) {
            if(nums[left] == 0 && nums[right] != 0) {
                nums[left] = nums[right];
                nums[right] = 0;
                left++;
            }
            if(nums[left] != 0) {
                left++;
            }
        }
        System.out.println(Arrays.toString(nums));
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

        MoveZeroes obj = new MoveZeroes();
        obj.moveZeroes(nums);
        sc.close();
    }
}
