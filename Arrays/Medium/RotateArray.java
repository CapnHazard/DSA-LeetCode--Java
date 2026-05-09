import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public void rotate(int [] nums, int k) {
        //rotate array
        k = k % nums.length;
        int left = 0;
        int right = nums.length-1;
        while(left <= right) {
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            right--;
            left++;
        }
        
        right = k-1;
        left = 0;
        while(left <= right) {
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            right--; left++;
        }
        
        right = nums.length-1;
        left = k;
        while(left <= right) {
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            right--; left++;
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int nums [] = new int [size];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < size; i++) {
            System.out.print("-> ");
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        RotateArray obj = new RotateArray();
        obj.rotate(nums, k);
        sc.close();
    }
}
