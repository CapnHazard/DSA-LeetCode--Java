import java.util.Scanner;
import java.util.Arrays;
public class ReverseArray {
    public int [] Reverse(int arr[], int size){
        if(size == 0){
            return null;
        }
        if(arr.length - size >= size - 1){

            return arr;
        }
        int c = arr[size-1];
        arr[size-1] = arr[arr.length - size];
        arr[arr.length - size] = c;
        return Reverse(arr, size-1);
    }
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int [size];
        System.out.println("Enter elements of array: ");
        for(int i=0; i<size; i++){
            System.out.print("-> ");
            arr[i] = sc.nextInt();
        }
        ReverseArray obj = new ReverseArray();
        System.out.println("Reversed array: " + Arrays.toString(obj.Reverse(arr, size)));
        sc.close();
    }
}
