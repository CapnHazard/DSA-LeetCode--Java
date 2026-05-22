import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class SetMatrixZero {
    public void setZeroes(int [][] matrix) {
        
        int rowLen = matrix.length; int colLen = matrix[0].length;
        HashSet <Integer> row = new HashSet<>();
        HashSet <Integer> col = new HashSet<>();
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < colLen; j++) {
                if(matrix[i][j] == 0) {
                row.add(i);
                col.add(j);
            }
            }
        }
        for(int i = 0; i < rowLen; i++) {
            for(int j = 0; j < colLen; j++) {
                if(row.contains(i) || col.contains(j)) {
                    matrix[i][j] = 0;
                }
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
        SetMatrixZero obj = new SetMatrixZero();
        obj.setZeroes(matrix);
        sc.close();
    }
}
/*
            if(matrix[i][k] == 0 || matrix[k][i] == 0) {
                zeroRow = i;
                zeroCol = k;
            }
            for(int z = 0; z < rowLen; z++) {
                matrix[z][zeroCol] = 0;
            }
            for(int y = 0; y < colLen; y++) {
                matrix[zeroRow][y] = 0;
            }
*/