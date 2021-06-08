import java.util.Scanner;

public class happyNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number to check happy or not ");
        int num = sc.nextInt();
        int sum = 0;
        while (num >9){
            while(num > 0 ){
                int digit = num %10 ;
                sum = sum + (digit * digit);
                num /= 10;
            }
            num = sum;
            sum = 0 ; 
        }
        if(num == 1){
            System.out.println(" Happy number ");
        }
        else{
            System.out.println(" Not a happy number ");
        }
    }
}