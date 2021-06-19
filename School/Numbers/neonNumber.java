package Numbers;

import java.util.Scanner;

public class neonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = sc.nextInt();

        int finalNumber = 0;
        int square = number * number ;
        
        while(square != 0){

            int remainder = square %10;
            finalNumber = finalNumber + remainder;
            square = square /10;

        }

        if(finalNumber == number){
            System.out.println("Neon number ");
        }
        else{
            System.out.println("Not an neon number ");
        }
    }
}
