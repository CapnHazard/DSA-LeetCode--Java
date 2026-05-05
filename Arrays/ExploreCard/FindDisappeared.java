import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindDisappeared {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List <Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1; // -1 as arrays are 0-indexed
            if(nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                result.add(i+1);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int nums [] = new int [size];
        for(int i = 0; i < size; i++) {
            System.out.print("-> ");
            nums[i] = sc.nextInt();
        }

        FindDisappeared obj = new FindDisappeared();
        System.out.println(obj.findDisappearedNumbers(nums));
        sc.close();
    }
}
