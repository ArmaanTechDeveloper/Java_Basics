import java.util.Scanner;

public class matirix_sum {

    public void LeftDiagonalSum(int a[][]) {
        int i, LeftDiagonalSum = 0, j;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                if (i == j) {
                    LeftDiagonalSum = LeftDiagonalSum + a[i][j];
                }
            }
        }
        System.out.println(" The sum of left diagonal elements of the array is " + LeftDiagonalSum);
    }

    public void RightDiagonalSum(int a[][]) {
        int i, j, RightDiagonalSum = 0;
        for (i = 0; i < a.length; i++) {
            for (j = a.length - 1; j >= 0; j--) {
                if ((i + j) == (a.length - 1)) {
                    RightDiagonalSum = RightDiagonalSum + a[i][j];
                }
            }
        }
        System.out.println(" The sum of right diagonal elements of the array is " + RightDiagonalSum);
    }

    public void OuterElementsSum(int a[][]) {
        int i, j, FullMatrixSum = 0, InnerElementSum = 0;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                FullMatrixSum = FullMatrixSum + a[i][j];
                if ((i != 0 && j != 0) && (i != a.length - 1 && j != a.length - 1)) {
                    InnerElementSum = InnerElementSum + a[i][j];
                }
            }
        }
        System.out.println(" The sum of outer elements of the array is " + (FullMatrixSum - InnerElementSum));
    }

    public void InnerElementSum(int a[][]) {
        int i, j, InnerElementSum = 0;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                if ((i != 0 && j != 0) && (i != a.length - 1 && j != a.length - 1)) {
                    InnerElementSum = InnerElementSum + a[i][j];
                }
            }
        }
        System.out.println(" The sum of inner elements of the array is " + InnerElementSum);
    }

    public static void main(String[] args) {
        matirix_sum ob = new matirix_sum();
        Scanner sc = new Scanner (System.in);
        int a[][] = new int [4] [4] ; 
        int i , j;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                System.out.println(" Enter the " + (i + " " + j) + " element of the array ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println(" choose from the choices given below ");
        System.out.println(" 'lds' - left diagonal sum ");
        System.out.println(" 'rds' - right diagonal sum ");
        System.out.println(" 'oes' - outer elements sum ");
        System.out.println(" 'ies' - inner elements sum ");
        String p = sc.next();
        String choice = p.toLowerCase();
    
        switch(choice){
            case "lds" :
            ob.LeftDiagonalSum(a);
            break;
            case "rds" :
            ob.RightDiagonalSum(a);
            break;
            case "oes" :
            ob.OuterElementsSum(a);
            break;
            case "ies" :
            ob.InnerElementSum(a);
            break;
            default :
            System.out.println(" Invalid input ");
        }
    }
}
