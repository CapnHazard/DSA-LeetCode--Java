import java.util.Scanner;

public class MajorityElementBoyerMoore {
    public int findMajorityElement(int nums []) {
        int candidate = nums[0];
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(count == 0) {
                candidate = nums[i];
                count = 1;
            } else if(candidate == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
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
        MajorityElementBoyerMoore obj = new MajorityElementBoyerMoore();
        System.out.println(obj.findMajorityElement(nums));
        sc.close();
    }
}
