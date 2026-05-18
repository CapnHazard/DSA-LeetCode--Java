import java.util.*;

public class NextPermutation {
    public void nextPermutation(int [] nums) {
        int dip = -1; 
        for(int i = nums.length-1; i > 0; i--) {
            if(nums[i-1] < nums[i]) {
                dip = i-1;
                break;
            }
        }
        if(dip == -1) {
            int left = 0; int right = nums.length-1;
                while(left <= right) {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                    left++; right--;
                }
                return;
        }
        int x = nums[dip];
        for(int i = nums.length-1; i > dip; i--) {
            if(nums[i] > x) {
                int temp = nums[dip];
                nums[dip] = nums[i];
                nums[i] = temp;
                break;
            }
        }
        int i = dip+1;
        int j = nums.length-1;
        while(i <= j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++; j--;
            
        }
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
        NextPermutation obj = new NextPermutation();
        obj.nextPermutation(nums);
        sc.close();
    }
}
