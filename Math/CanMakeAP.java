import java.util.*;
public class CanMakeAP {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        boolean isAP = true;
        for(int i = 0; i < arr.length-1; i++) {
            int difference = arr[1] - arr[0];
            if(arr[i+1] - arr[i] != difference) {
                isAP = false;
            } 
        }
        return isAP;
    }
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int arr [] = new int [size];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < size; i++) {
            System.out.print("-> ");
            arr[i] = sc.nextInt();
        }
        CanMakeAP obj = new CanMakeAP();
        System.out.println(obj.canMakeArithmeticProgression(arr));
        sc.close();
    }
}
