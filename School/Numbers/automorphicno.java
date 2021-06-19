package Numbers;

import java.util.Scanner;

public class automorphicno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int t = n;
        int count = 0;

        while(n != 0){
            count ++;
            n = n / 10;
        }


        boolean check = true;
        int square = t * t;
        System.out.println("square - "+square);

        
        int digitOfSquare , digitOfNumber;
        for(int i = 1 ; i <= count ; i++){
            digitOfSquare = square % 10;
            digitOfNumber = t % 10;
            
            
            if(digitOfSquare != digitOfNumber){

                check = false;
                break;
            }

            square = square /10;
            t = t/10;
        }
        if(check){
            System.out.println("Auto morphic number ");
        }
        else{
            System.out.println("Not an Auto-morphic number");
        }
    }
}
