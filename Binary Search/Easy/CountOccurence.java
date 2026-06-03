import java.util.Scanner;

public class CountOccurence {
    public int count(int nums[], int target) {
        int start = 0; int end = 0;
        int low = 0; int high = nums.length-1;

        //for start index
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(nums[mid] == target) {
                start = mid;
                high = mid - 1;
            } else if(nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        //for end index
        low = 0; high = nums.length-1;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(nums[mid] == target) {
                end = mid;
                low = mid + 1;
            } else if(nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        int count = end - start + 1; //since duplicates in a sorted array are always contiguous
        return count;
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
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        CountOccurence obj = new CountOccurence();
        System.out.println("Frequency of target: " + obj.count(nums, target));
        sc.close();
    }
}
