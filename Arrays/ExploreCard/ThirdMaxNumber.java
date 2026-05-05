import java.util.Scanner;

public class ThirdMaxNumber {
    public int thirdMax(int [] nums) {
        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        boolean thirdFound = false;
        for(int i = 0; i < nums.length; i++) {
            if(max < nums[i]) {
                max = nums[i];
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if(sec_max < nums[i] && nums[i] != max) {
                sec_max = nums[i];
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != sec_max && nums[i] != max) {
                if(!thirdFound || third < nums[i]) {
                    third = nums[i];
                    thirdFound = true;
                }
            }
        }
        return thirdFound ? third : max ;
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

        ThirdMaxNumber obj = new ThirdMaxNumber();
        System.out.println(obj.thirdMax(nums));
        sc.close();
    }
}
