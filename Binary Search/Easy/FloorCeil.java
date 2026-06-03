import java.util.Scanner;

public class FloorCeil {
    public void findFloorCeil(int nums [], int k) {
        int low = 0;
        int high = nums.length-1;
        int ceil = 0;
        int floor = 0;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(nums[mid] == k) {
                floor = nums[mid];
                ceil = floor;
                break;
            } else if(nums[mid] < k) {
                floor = nums[mid];
                low = mid + 1;
            } else {
                ceil = nums[mid];
                high = mid - 1;
            }
        }
        System.out.println("Ceiling:" + ceil + "\nFloor: " + floor);
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
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        FloorCeil obj = new FloorCeil();
        obj.findFloorCeil(nums, k);
        sc.close();
    }
}
 