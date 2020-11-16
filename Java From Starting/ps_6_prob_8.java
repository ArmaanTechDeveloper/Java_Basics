import java.util.*;

class ps_6_prob8 {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        // wite a java program to find whether a array is sorted or not

        System.out.println(" Enter the size of the array ");
        int N = sc.nextInt();

        int[] element = new int[N];

        int i, j;
        boolean check = true;
        for (i = 0; i < element.length; i++) {
            System.out.println(" Enter " + i + " element");
            element[i] = sc.nextInt();
        }
        for (j = 0; j < element.length-1; j++) {
            if (element[j] > element[j + 1]) {
                check = false;
                break;
            }
        }
        if(check){
            System.out.println(" The array is sorted ");
        }
        else{
            System.out.println(" The array is not sorted ");
        }
        sc.close();
    }
}