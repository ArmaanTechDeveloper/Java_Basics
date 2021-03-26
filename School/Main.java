import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the term of the first sequence");
        int term1 , term2 , MatchCount;
        term1 = sc.nextInt();
        System.out.println(" Enter the term of the second sequence");
        term2 = sc.nextInt();
        System.out.println(" Enter the Match count");
        MatchCount = sc.nextInt();
        int ar2[] = new int [term2];
        int ar1[] = new int [term1];
        System.out.println("Enter the elements of the first array");
        for(int i = 0 ; i < ar1.length ;  i++){
            ar1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of the second array");
        for(int i = 0 ; i < ar2.length ;  i++){
            ar2[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0 ; i < ar1.length ;  i++){
            int first = ar1[i];
            for(int j = 0 ; j < ar2.length ;  j++){
                int second = ar2[j];
                if(first == second ){
                    count ++;
                }
            }
        }
        if(MatchCount <= count){
            System.out.println(" same series ");
        }
        else{
            System.out.println(" Not same ");
        }

    }
}