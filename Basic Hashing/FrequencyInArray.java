//key -> array elements
//value -> frequency

import java.util.*;

public class FrequencyInArray {
    public HashMap<Integer, Integer> CountFrequency(int arr[]) {
        HashMap <Integer, Integer> hm = new HashMap<>();
        for( int num : arr ) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        return hm;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr [] = new int [size];
        for(int i = 0; i < size; i++) {
            System.out.print("->");
            arr[i] = sc.nextInt();
        }
        FrequencyInArray obj = new FrequencyInArray();
        System.out.println(obj.CountFrequency(arr));
        sc.close();
    }
}