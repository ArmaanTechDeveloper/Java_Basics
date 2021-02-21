import java.util.Scanner;

public class matrix_diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        //System.out.println(" Enter elements of the array ");
        int i, j, LeftDiagonalSum = 0 , FullMatrixSum = 0 , RightDiagonalSum = 0 , InnerElementSum = 0;

        // for (i = 0; i < a.length; i++) {
        //     for (j = 0; j < a.length; j++) {
        //         System.out.println(" Enter the " + (i + " " + j) + " element of the array ");
        //         a[i][j] = sc.nextInt();
        //     }
        // }
        
        // Left diagonal sum of the matrices 
        // for (i = 0; i < a.length; i++) {
        //     for (j = 0; j < a.length; j++) {
        //         if (i == j) {
        //             LeftDiagonalSum = LeftDiagonalSum + a[i][j];
        //             System.out.println(a[i][j]);
        //         }
        //     }
        // }
        // System.out.println(" The sum of the left diagonal is "+LeftDiagonalSum);

        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                FullMatrixSum = FullMatrixSum + a[i][j];
                if((i!= 0 && j !=0) && (i!=a.length-1 && j!= a.length-1)){
                    InnerElementSum = InnerElementSum + a[i][j];
                System.out.print(a[i][j]+",");
                }
            }
        }
        System.out.println(" The sum of the inner elements of the matrix is "+InnerElementSum);
        System.out.println(" The sum of the outer elements of matirix is " + (FullMatrixSum - InnerElementSum));

        // for (i = 0; i < a.length; i++) {
        //     for (j = a.length - 1 ; j >=0 ; j--) {
        //         if((i+j)==(a.length-1)){
        //             RightDiagonalSum = RightDiagonalSum + a[i][j];
        //         }
        //     }
        // }
        // System.out.println(" The sum of the right diagonal is "+ RightDiagonalSum);
    }
}
