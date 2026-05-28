import java.util.Scanner;

public class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int x [] = new int [n];
        int y [] = new int [n];
        for(int i = 0; i < n; i++) {
            x[i] = nums[i];
            y[i] = nums[n + i];
        }
        int j = 0;
        for(int i = 0; i < nums.length && j < n; i+=2) {
            nums[i] = x[j];
            nums[i+1] = y[j];
            j++;
        }
        return nums;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int nums [] = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.print("-> ");
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        ShuffleArray obj = new ShuffleArray();
        System.out.println(obj.shuffle(nums, n));
        sc.close();
    }
}
