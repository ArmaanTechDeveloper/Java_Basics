import java.util.Scanner;

public class DecimalToHexadecimal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputting the number to convert to hexadecimal
        System.out.print(" Enter the number to convert to Hexa decimal : ");
        int number = sc.nextInt();

        // variable to pick one by one the number 
        int pickingNumber;

        // To convert the number
        char hexadecimal[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        // To convert the number into a string because the hexadecimal number is a string 
        String FinalNumber = "";

        // terminating the number 
        while(number !=0){
            pickingNumber = number % 16;
            FinalNumber = hexadecimal[pickingNumber]+FinalNumber;
            number /= 16;
        }
        // printing the number
        System.out.println("The number obtained is : "+FinalNumber);
        // closing the package
        sc.close();
    }
}

/*
    Program to convert Decimal number to hexa decimal number 
    written by ArmaanTechDeveloper
    on Friday , 26th march 2021
*/