/*

    Program to check magic number using recursion 

    
    Made by ArmaanTechDeveloper on 01-08-2021
    Github id : https://github.com/ArmaanTechDeveloper

*/



import java.util.Scanner;

public class magicrecur {
    public int magicnumber(int n) {
        if (n >= 0 && n < 10) {
            return n;
        } else {
            return n % 10 + magicnumber(n / 10);
        }
        
    }

    public static void main(String[] args) {
        magicrecur obj = new magicrecur();

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int k = obj.magicnumber(n);
        int number = k;
        int reverse = 0;
        while (k != 0) {
            int remainder = k % 10;
            reverse = reverse * 10 + remainder;
            k = k / 10;
        }
        if((number * reverse ) == n){
            System.out.println("magic number");
        }
        else{
            System.out.println("not a magic number");
        }

    }
}