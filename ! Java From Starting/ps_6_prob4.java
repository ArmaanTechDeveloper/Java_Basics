import java.util.*;

class ps_6_prob4 {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        int[][] mat1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] mat2 = { { 2, 6, 13 }, { 3, 7, 1 } };
        int[][] result = { { 0, 0, 0 }, { 0, 0, 0 } };


        for (int i = 0; i < mat1.length; i++) { // row number of times
            for (int j = 0; j < mat1[i].length; j++) { // column number of times
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        for (int i = 0; i < mat1.length; i++) { // row number of times
            for (int j = 0; j < mat1[i].length; j++) { // column number of times
                System.out.print(result[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}