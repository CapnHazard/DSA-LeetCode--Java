import java.util.Arrays;
import java.util.Scanner;

public class SortByParity {
    public int [] sortArrayByParity(int [] nums) {
        int left = 0;
        int right = nums.length-1;
        while(left < right) {
            if(nums[left] % 2 == 0) {
                left++;
            } else if(nums[right] % 2 != 0) {
                right--;
            } else {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left]  = temp;
                left++;
                right--;
            }
        }
        return nums;
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

        SortByParity obj = new SortByParity();
        System.out.println(Arrays.toString(obj.sortArrayByParity(nums)));
        sc.close();
    }
}
