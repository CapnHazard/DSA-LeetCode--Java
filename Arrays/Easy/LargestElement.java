
import java.util.*;

public class LargestElement {
    public int FindLargest(int arr[]) {
        int a = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(a < arr[i]) {
                a = arr[i];
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int arr [] = new int[size];
        System.out.println("Enter elements: ");
        for(int i = 0; i < size; i++) {
            System.out.print("-> ");
            arr[i] = sc.nextInt();
        }
        LargestElement obj = new LargestElement();
        System.out.println("Largest number is: " + obj.FindLargest(arr));
        sc.close();
    }
}
