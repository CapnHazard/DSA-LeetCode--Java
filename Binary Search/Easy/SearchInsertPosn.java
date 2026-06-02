import java.util.Scanner;

public class SearchInsertPosn {
    public int searchInsert(int nums [], int target) {
        int low = 0; 
        int high = nums.length-1;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
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
        SearchInsertPosn obj = new SearchInsertPosn();
        System.out.println(obj.searchInsert(nums, target));
        sc.close();
    }
}
