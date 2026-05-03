import java.util.*;
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0) {
            System.out.println(Arrays.toString(nums1));
        } 
        if(m==0) {
            System.out.println(Arrays.toString(nums2));
        }
        int j = 0;
        for(int i = m; i < m + n && j < m + n; i++) {
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int nums1 [] = new int [m + n];
        int nums2 [] = new int [n];

        System.out.println("Enter elements for nums1: ");
        for(int i = 0; i < m; i++) {
            System.out.print("-> ");
            nums1[i] = sc.nextInt();
        }
        System.out.println("Enter elements for nums2: ");
        for(int i = 0; i < n; i++) {
            System.out.print("-> ");
            nums2[i] = sc.nextInt();
        }

        MergeSortedArray obj = new MergeSortedArray();
        obj.merge(nums1, m, nums2, n);
        sc.close();
    }
}
