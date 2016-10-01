package crackingthecodinginterview;
// rotate a matrix 90 degress

import java.util.Arrays;

/**
 * Created by davidflast on 9/30/16.
 */
public class RotateMatrix {
    public static void main(String[] args){
        int rows = 3;
        int cols = 2;
        int[][] matrix = new int[][]{
            {1,2},{4,5},{7,8}
        };

        System.out.println(Arrays.deepToString(matrix));
        int[][] rotated = rotateMatrix(matrix);
        System.out.println(Arrays.deepToString(rotated));
//        for (int i=0; i<rows; i++) {
//            for (int j=0;j<cols;j++) {
//                System.out.print( matrix[i][j]+" ");
//            }
//                System.out.println();
//        }
//        System.out.println();
//        matrix = rotateMatrix(matrix);
//        for (int i=0; i<cols; i++) {
//            for (int j=0;j<rows;j++) {
//                System.out.print( matrix[i][j]+" ");
//            }
//                System.out.println();
//            }
    }

    public static int[][]rotateMatrix(int [][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        int [][] rotatedMatrix = new int[col][row];
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                rotatedMatrix[j][row - 1 - i] = matrix[i][j];
            }
        }
        return rotatedMatrix;
    }
}
