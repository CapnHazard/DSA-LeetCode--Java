//Hash Table
/*
import java.util.*;
public class practice {
    public static void main(String[] args) {
        Hashtable <Integer, String> hash_table = new Hashtable <Integer, String>();

        hash_table.put(1, "Banana Man");
        hash_table.put(2, "orange boy");
        hash_table.put(3, "Ethan Winters");
        hash_table.put(4, "Lady Dimitrescu");
        hash_table.put(5, "Resident Evil");
        
        System.out.println(hash_table);
    }
}
*/
import java.util.*;

public class practice {
    public HashMap<Integer, Integer> CountFrequency(int arr[]) {
        HashMap <Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(hm.get(arr[i]) == null) {
                hm.put(arr[i], 1);
            } else {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
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
        practice obj = new practice();
        System.out.println(obj.CountFrequency(arr));
        sc.close();
    }
}