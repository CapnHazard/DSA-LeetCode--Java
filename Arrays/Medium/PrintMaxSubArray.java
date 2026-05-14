import java.util.Arrays;
import java.util.Scanner;

public class PrintMaxSubArray {
    public int [] printMaxSubArray(int nums []) {
        int maxsum = nums[0]; int sum = maxsum;
        int start = 0; int end = 0; int tempStart = 0;
        for(int i = 1; i < nums.length; i++) {
            if(sum<0) sum = 0;
            if(sum == 0) tempStart = i; 
            sum = sum + nums[i];
            if(sum > maxsum) {
                maxsum = sum;
                start = tempStart;
                end = i;
            }
            maxsum = Math.max(maxsum, sum);
        }
        System.out.println("Max sum is: " + maxsum + "\nSub Array is: ");
        return Arrays.copyOfRange(nums, start, end+1);
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
        PrintMaxSubArray obj = new PrintMaxSubArray();
        System.out.println(Arrays.toString(obj.printMaxSubArray(nums)));
        sc.close();
    }
}
