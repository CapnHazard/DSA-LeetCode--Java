import java.util.*;

public class SecondLargest {
    public int FindSecondLargest(int arr []) {
        Arrays.sort(arr);
        return arr[arr.length-2];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr [] = new int[size];
        System.out.println("Enter elements: ");
        for(int i = 0; i < size; i++) {
            System.out.print("-> ");
            arr[i] = sc.nextInt();
        }
        SecondLargest obj = new SecondLargest();
        System.out.println("Second largest number is: " + obj.FindSecondLargest(arr));
        sc.close();
    }
}
