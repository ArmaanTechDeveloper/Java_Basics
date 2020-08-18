import java.util.*;

class question_19{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        
        int binary,i=1,j,q;
        int arr[]=new int [100];

        System.out.println(" Enter decimal number ");
        binary = sc.nextInt();

        q = binary;

        while (q!=0){
            arr[i++] = q%2;
            q = q/2;
        }
        System.out.println(" Binary number is ");
        for(j=i+1;j>0;j++){
            System.out.println(arr[j]);
        }
        System.out.println("\n");
        sc.close();
    }
}