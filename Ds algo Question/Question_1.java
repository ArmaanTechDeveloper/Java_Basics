import java.util.*;

class question_1{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        
// WAP to take 10 input from user and print the rest of 10

        int a[] = new int[20];

        int i,j;

        System.out.println(" Enter 10 Numbers ");
        for(i=0 ; i<10 ; i++){
            a[i] = sc.nextInt();
        }
        for(j=0 ; j<10 ; j++){
            System.out.print(a[j]+ ",");
        }
        sc.close();
    }
}
