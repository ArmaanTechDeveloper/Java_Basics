import java.util.*;

class question_2{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);

        String output1="False",output2="False";
        
        System.out.println(" Enter your M number");
        int m = sc.nextInt();

        System.out.println(" Enter your N number ");
        int n = sc.nextInt();

        int a[] = new int [10];

        int i,j;
        System.out.println(" Enter the terms of the array ");
        for(i=0;i<5;i++){
            a[i] = sc.nextInt();
        }
        for(j=0;j<5;j++){
            if(m==a[j]){
                output1 = "True";
            }
            if(n==a[j]){
                output2 = "True";
            }
        }
        if(output1 == "True" && output2 == "True"){
            System.out.println(" True");
        }
        else{
            System.out.println(" False ");
        }

        sc.close();
    }
}