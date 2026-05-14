import java.util.Arrays;
import java.util.Scanner;

public class RearrangeBySign {
    public int[] rearrangeArray(int [] nums) {
        int arr[] = new int [nums.length]; 
        int p = 0; int n = nums.length/2;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                arr[p] = nums[i];
                p++;
            } else {
                arr[n] = nums[i];
                n++;
            }
        }
        p = 0; n = nums.length/2;
        for(int i = 0; i < nums.length && p < n && n < nums.length; i=i+2) {
            nums[i] = arr[p];
            p++;
            nums[i+1] = arr[n];
            n++;
        }
        return nums;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int nums [] = new int [size];
        System.out.println("Enter elements: ");
        for(int i = 0; i < size; i++) {
            System.out.print("-> ");
            nums[i] = sc.nextInt();
        }
        RearrangeBySign obj = new RearrangeBySign();
        System.out.println(Arrays.toString(obj.rearrangeArray(nums)));
        sc.close();
    }
}
