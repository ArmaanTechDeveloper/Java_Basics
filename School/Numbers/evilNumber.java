package Numbers;
/*
    dividing the number with 2 and 
*/
import java.util.Scanner;

public class evilNumber {
    static void checkEvilNumber(int n)
    {
        // array to store binary number
        int[] binaryNum = new int[40];
   
        int i = 0;
        while (n > 0) 
        {

            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        int count = 0;
        // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--){
            if(binaryNum[j] == 1){
                count ++;
            }
        }

        if(count%2 == 0){
            System.out.println("Evil Number");
        }
        else{
            System.out.println(" Not an evil number");
        }
    }
      
    // driver program
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int n = sc.nextInt();
        checkEvilNumber(n);
        sc.close();
    }
}
