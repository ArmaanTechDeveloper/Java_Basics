import java.util.*;

class problem{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        
        System.out.println(" Enter the  M th term");
        int m = sc.nextInt();

        int a[] = new int [m];


        int i,count=0,j,k;

        for(j=0;j<a.length;j++){
            a[j] = sc.nextInt();
        }


        for(i=0;i<a.length-1;i++){
            count = count+a[i];
        }

        k = a[m-1];

        int min = Math.min(count,k);
        System.out.println(min);


        sc.close();
    }
}