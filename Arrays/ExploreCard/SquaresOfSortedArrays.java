import java.util.*;
public class SquaresOfSortedArrays {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int nums [] = new int[size];
        System.out.println("Enter elements: ");
        for(int i = 0; i < size; i++) {
            System.out.print("-> ");
            nums[i] = sc.nextInt();
        }
        SquaresOfSortedArrays obj = new SquaresOfSortedArrays();
        System.out.println(Arrays.toString(obj.sortedSquares(nums)));
        sc.close();
    }
}
