import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {
    public int majorityElement(int nums []) {
        HashMap <Integer, Integer> hm = new HashMap<>();
        int x = Math.floorDiv(nums.length, 2);
        for(int i = 0; i < nums.length; i++) {
            if(hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            } else {
                hm.put(nums[i], 1);
            } 
        }
        for(int key : hm.keySet()) {
            if(hm.get(key) > x) {
                return key;
            }
        }
        return -1;
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
        MajorityElement obj = new MajorityElement();
        System.out.println(obj.majorityElement(nums));
        sc.close();
    }
}
