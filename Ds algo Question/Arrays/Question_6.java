import java.util.*;

class question_6{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        
        System.out.println(" Enter the size of the array ");
        int  sa = sc.nextInt();
        int a[] = new int [sa];

        System.out.println(" Enter your elements of the array ");
        int k;
        for(k=0;k<sa;k++){
            a[k] = sc.nextInt();
        }

        int i , j , temp;
        for(i=0;i<a.length-1;i++){
            for(j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                }
            }
        }
        for(i=0;i<a.length;i++){
            System.out.print(a[i] + " , ");
        }

        int in1 , in2;
        System.out.println(" Enter your 2 Kth term ");
        in1 = sc.nextInt();
        in2 = sc.nextInt();

        for(i=a[in1];i<a[in2];i++){
            System.out.println(a[0] + a[in2]);
        }
        sc.close();
    }
}