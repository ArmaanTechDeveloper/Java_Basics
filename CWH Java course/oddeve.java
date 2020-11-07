import java.util.*;

class oddeve{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        

        System.out.println(" Enter the number n");
        int n = sc.nextInt();
        int p=0;
        int o[] = new int [n];
        int a[] = new int [n];

        int i,j;
        for(i=0;i<o.length;i++){
            System.out.println(" Enter the number : "+(i+1));
            o[i] = sc.nextInt();
        }

        System.out.println(" The original array is ");
        for(int element:o){
            System.out.print(" "+element+",");
        }

        for(j=0;j<o.length;j++)
        {
            if(o[j] % 2 !=0){
                a[p] = o[j];
                p++;
            }
        }
        for(j=0;j<o.length;j++)
        {
            if(o[j] % 2 ==0){
                a[p] = o[j];
                p++;
            }
        }
        System.out.println(" ");
        System.out.println(" The arranged array is ");
        for(int element : a){
            System.out.print(" "+element+",");
        }

        sc.close();
    }
}

