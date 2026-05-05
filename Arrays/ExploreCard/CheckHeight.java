import java.util.Arrays;
import java.util.Scanner;

public class CheckHeight {
    public int heightChecker(int [] heights) {
        int expected [] = new int [heights.length];
        int count = 0;
        for(int i = 0; i < heights.length; i++) {
            expected[i] = heights[i];
        }
        Arrays.sort(expected);
        for(int i = 0; i < heights.length; i++) {
            if(expected[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int heights [] = new int [size];
        System.out.println("Enter elements of array: ");
        for(int i = 0; i < size; i++) {
            System.out.print("-> ");
            heights[i] = sc.nextInt();
        }

        CheckHeight obj = new CheckHeight();
        System.out.println(obj.heightChecker(heights));
        sc.close();
    }
}
