import java.util.*;

class question_10{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        
        
        int a[] = {-1,2,-6,5,6,-9,4};
        int[] sort = new int [7];

        int i,j;
        for(i=0;i<a.length;i++){
            for(j = 0;j<sort.length;j++){
            if(a[i]<0){
                sort[j] = a[i];
            }
        }
    }
        for(i=0;i<a.length;i++){
            for(j = 0;j<sort.length;j++){
            if(a[i]>0){
                sort[j] = a[i];
            }
        }
    }
        for(int element : sort){
            System.out.print(element +" ");
        }
        
        sc.close();
    }
}