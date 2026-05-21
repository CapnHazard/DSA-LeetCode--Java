import java.util.Scanner;
//10 22 12 3 0 6
//22 10 12 3 0 6
public class LeadersInArray {
    public void findLeaders(int [] nums) {
        int max = nums[nums.length-1];
        for(int i = nums.length-1; i > 0; i--) {
            if(nums[i] > max) {
                max = nums[i];
            }
            if(nums[i-1] >= max) {
                System.out.println(nums[i-1]);
            }
        }
        System.out.println(nums[nums.length-1]);
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
        LeadersInArray obj = new LeadersInArray();
        obj.findLeaders(nums);
        sc.close();
    }
}

/*
BRUTE FORCE APPROACH: 
    public void findLeaders(int [] nums) {
        for(int i = 0; i < nums.length; i++) {
            boolean leader = true;
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] < nums[j]) {
                    leader = false;
                } 
            }
            if(leader == true) {
                System.out.print(nums[i] + " ");
            }
        }
    }
*/ 