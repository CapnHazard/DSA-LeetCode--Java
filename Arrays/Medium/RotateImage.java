import java.util.Arrays;
import java.util.Scanner;

public class RotateImage {
    public void rotate(int [][] matrix) {
        //transpose
        for(int i = 0; i < matrix.length; i++) {
            for(int j = i + 1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse
        for(int i = 0; i < matrix.length; i++) {
            int j = 0; int k = matrix.length-1;
            while(j <= k) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
                k--; j++;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();
        int matrix [] [] = new int [rows] [col];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print("m["+i+"]["+j+"]-> " );
                matrix[i][j] = sc.nextInt();
            }
        }
        RotateImage obj = new RotateImage();
        obj.rotate(matrix);
        sc.close();
    }
}
