import java.util.*;
public class NumWithEvenNoOfDigits {
    public int findNumbers(int [] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            String a = Integer.toString(nums[i]); //or String.valueOf(nums[i]);
            int n = a.length();
            if(n % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int nums [] = new int [size];
        System.out.println("Enter elements of array: ");
        for(int i = 0; i < size; i++) {
            System.out.print("-> ");
            nums[i] = sc.nextInt();
        }
        NumWithEvenNoOfDigits obj = new NumWithEvenNoOfDigits();
        System.out.println(obj.findNumbers(nums));
        sc.close();
    }
}
