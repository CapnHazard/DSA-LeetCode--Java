import java.util.*;
class CheckRoatedSorted {
    public boolean check(int[] nums) {
        boolean isSortedAndRotated = true;
        int drop = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i-1] > nums[i] || nums[nums.length-1] > nums[0]) {
                drop += 1;
            } 
        }
        if(drop == 0 || drop == 1) {
            isSortedAndRotated = true;
        } else {
            isSortedAndRotated = false;
        }
        return isSortedAndRotated;
    }
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int nums [] = new int [size];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < size; i++) {
            System.out.print("-> ");
            nums[i] = sc.nextInt();
        }
        CheckRoatedSorted obj = new CheckRoatedSorted();
        System.out.println(obj.check(nums));
        sc.close();
    }
}