import java.util.Arrays;
import java.util.Scanner;

public class SortColors {
    public void sortColors(int [] nums) {
        int zero = 0; int one = 0; int two = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                zero++;
            } else if(nums[i] == 1) {
                one++;
            } else if(nums[i] == 2) {
                two++;
            }
        }
        for(int i = 0; i < zero; i++) {
            nums[i] = 0;
        }
        for(int i = zero; i < zero + one; i++) {
            nums[i] = 1;
        }
        for(int i = zero + one; i < zero + one + two; i++) {
            nums[i] = 2;
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int nums [] = new int [size];
        System.out.println("Enter elements: ");
        for(int i = 0; i < size; i++) {
            System.out.print("-> ");
            nums[i] = sc.nextInt();
        }
        SortColors obj = new SortColors();
        obj.sortColors(nums);
        sc.close();
    }
}
