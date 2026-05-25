import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix {
    public List <Integer> spiralOrder(int [][] matrix) {
        List <Integer> spiral = new ArrayList<>();
        int left = 0; int right = matrix[0].length-1;
        int top = 0; int bottom = matrix.length-1;
        while(top <= bottom && left <= right) {
            //left to right ie top row traversal
            for(int i = left; i <= right; i++) {
                spiral.add(matrix[top][i]);
            }
            top++;
            //up to down ie right column traversal
            for(int i = top; i <= bottom; i++) {
                spiral.add(matrix[i][right]);
            }
            right--;
            //right to left ie bottom row traversal
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    spiral.add(matrix[bottom][i]);
                }
                bottom--;
            }
            //bottom to top ie left column traversal
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    spiral.add(matrix[i][left]);
                }
                left++;
            }
        }
        return spiral;
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
        SpiralMatrix obj = new SpiralMatrix();
        System.out.println(obj.spiralOrder(matrix));
        sc.close();        
    }
}
