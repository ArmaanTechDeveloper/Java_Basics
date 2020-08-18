import java.util.*;

class selectionsort{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        // Input constructs

        int a[]=new int [5];
        int i;
        for(i=0;i<a.length;i++){
            System.out.println("Enter your "+i+" number");
            a[i]=sc.nextInt();
        }
        //loop constructs
        for(i=0;i<a.length;i++){
            if(a[i]%2==0)
            System.out.println(" This is an even number " +a[i]);
        }


        sc.close();
    }
}