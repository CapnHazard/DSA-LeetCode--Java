import java.util.*;

public class DuplicateZero {
    public void duplicateZeros(int [] arr) {
        int duplicateArray [] = new int [arr.length];
        int j = 0;
        for(int i = 0; i < arr.length && j < arr.length; i++) {
            duplicateArray[j] = arr[i];
            j++;
            if(arr[i] == 0 && j < arr.length) {
                duplicateArray[j] = 0;
                j++;
            }
        }
        for(int i = 0; i < arr.length; i++) {
            arr[i] = duplicateArray[i];
        }
        System.out.println(Arrays.toString(arr));
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
        DuplicateZero obj = new DuplicateZero();
        obj.duplicateZeros(arr);
        sc.close();
    }
}
