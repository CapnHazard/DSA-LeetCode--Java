import java.util.Arrays;
import java.util.Scanner;
public class UnionSortedArray {
    public int [] uniteAndSort(int arr1[] , int arr2[]) {
        int totalSize = arr1.length + arr2.length;
        int union [] = new int [totalSize];
        int i = 0; int j = 0; int u = 0;
        //smaller element added to union[] and respective array pointer increments
        while(i < arr1.length && j < arr2.length && u < totalSize) {
            if(arr1[i] < arr2[j]) {
                //to check if last added element is same as current element, to avoid duplicates
                if(u == 0 || union[u-1] != arr1[i]){
                    union[u] = arr1[i];
                    u++;
                }
                i++; 
            } else if(arr2[j] < arr1[i]) {
                if(u == 0 || union[u-1] != arr2[j]){
                    union[u] = arr2[j];
                    u++;
                }
                j++;
            } else if(arr1[i] == arr2[j]) {
                if(u == 0 || union[u-1] != arr2[j]) {
                    union[u] = arr2[j];
                    u++;
                }
                i++; j++;
            }
        }
        //to handle remaining elements
        while(i < arr1.length) {
            if(u == 0 || union[u-1] != arr1[i]) {
                union[u] = arr1[i];
                u++;
            }
            i++; 
        }
        while(j < arr2.length) {
            if(u == 0 || union[u-1] != arr2[j]) {
                union[u] = arr2[j];
                u++;
            }
            j++;
        }
        return Arrays.copyOf(union, u); //eliminate trailing zeroes!
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of arr1 (m): ");
        int m = sc.nextInt();
        int arr1 [] = new int [m];
        System.out.print("Enter size of arr2 (n): ");
        int n = sc.nextInt();
        int arr2 [] = new int [n];
        System.out.println("Enter elements in arr1: ");
        for(int i = 0; i < m; i++) {
            System.out.print("-> ");
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter elements in arr2: ");
        for(int i = 0; i < n; i++) {
            System.out.print("-> ");
            arr2[i] = sc.nextInt();
        }
        UnionSortedArray obj = new UnionSortedArray();
        System.out.println(Arrays.toString(obj.uniteAndSort(arr1, arr2)));
        sc.close();
    }
}
