import java.util.Scanner;

public class CheckDoubleExists {
        public boolean checkIfExist(int[] arr) {
        boolean isDouble = true;
        //int j = 0; 
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == 2 * arr[j] || arr[j] == 2 * arr[i]) {
                    isDouble = true;
                    return isDouble;
                } else {
                    isDouble = false;
                }
            }
        }
        return isDouble;
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

        CheckDoubleExists obj = new CheckDoubleExists();
        System.out.println(obj.checkIfExist(arr));
        sc.close();
    }
}
