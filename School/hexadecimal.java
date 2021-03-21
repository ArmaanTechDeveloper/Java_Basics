import java.util.Scanner;

public class hexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // inputting the decimal number 
        System.out.println(" Enter the decimal number ");
        int dec = sc.nextInt();

        //converting and printing into hexadecimal 
        System.out.println("The number to hexadecimal is - "+Integer.toHexString(dec));
    }
}
