/*
OPTIMAL SOLUTION:  if you go right to left, you already know the running maximum to the right at each step.
*/
import java.util.*;
public class ReplaceWithGreatestOnRight { 
    public int [] replaceElements(int [] arr) {
        int max = -1;
        for(int i = arr.length-1; i >= 0 ; i--) {
            int current = arr[i];
            arr[i] = max;
            max = Math.max(max, current);
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int [] arr = new int [size];
        System.out.println("Enter elements of array: ");
        for(int i = 0; i < size; i++) {
            System.out.print("-> ");
            arr[i] = sc.nextInt();
        }

        ReplaceWithGreatestOnRight obj = new ReplaceWithGreatestOnRight();
        System.out.println(Arrays.toString(obj.replaceElements(arr)));
        sc.close();
    }
}

/* Solution has Time Complexity = O(n^2)
import java.util.Arrays;
import java.util.Scanner;

public class ReplaceWithGreatestOnRight {
    public int[] replaceElements(int[] arr) {

        if(arr.length == 1){
            arr[0] = -1;
            return arr;
        }

        int m = 1;
        
        for(int i = 0 ; i < arr.length && m < arr.length; i++) {
            int start = arr[m];

            if(m == arr.length-1){
                arr[m] = -1;
            }
            
            for(int j = i + 1; j < arr.length; j++) {
                if(start < arr[j]) {
                    start = arr[j];
                }
            }
            arr[i] = start;
            m++;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int [] arr = new int [size];
        System.out.println("Enter elements of array: ");
        for(int i = 0; i < size; i++) {
            System.out.print("-> ");
            arr[i] = sc.nextInt();
        }

        ReplaceWithGreatestOnRight obj = new ReplaceWithGreatestOnRight();
        System.out.println(Arrays.toString(obj.replaceElements(arr)));
        sc.close();
    }
}
*/