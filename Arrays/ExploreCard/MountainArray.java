import java.util.Scanner;

public class MountainArray {
    public boolean validMountainArray(int[] arr) {
        boolean isMountainArray = false;
        boolean peakFound = false;
        int left = 0;
        int index = 0;
        
        if(arr.length < 3) {
            System.out.println("Size should be greater than equal to 3");
            return false;
        }

        for(int right = 1; right < arr.length && left < arr.length; right++) {
            isMountainArray = true;
            if(arr[right] == arr[left]) return false;
            if(arr[right] < arr[left] && !peakFound) {
                index = left;
                peakFound = true;
            }
            left++;
        }
        if(index == 0 || index == arr.length-1) return false;
        
        for(int i = index; i < arr.length-1; i++) {
            if(arr[i] <= arr[i+1]) {
                return false;
            }
        }

        return isMountainArray;
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

        MountainArray obj = new MountainArray();
        System.out.println(obj.validMountainArray(arr));
        sc.close();
    }
}

