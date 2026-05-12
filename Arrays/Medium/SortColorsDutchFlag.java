import java.util.Arrays;
import java.util.Scanner;

public class SortColorsDutchFlag {
    public void sortColorsDutchFlag(int nums []) {
        int low = 0; int mid = 0; int high = nums.length-1;
        while(mid <= high) {
            int temp = 0;
            if(nums[mid] == 0) {
                temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                mid++; low++;
            }
            else if(nums[mid] == 1) {
                mid++;
            }
            else if(nums[mid] == 2) {
                temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
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
        SortColorsDutchFlag obj = new SortColorsDutchFlag();
        obj.sortColorsDutchFlag(nums);
        sc.close();
    }
}