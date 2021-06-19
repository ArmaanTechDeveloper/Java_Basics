package Conversion.Decimalto;

import java.util.Scanner;

public class Binary {

    public int[] DecimalToBinary(int dec){

        int []binaryNum = new int[10];
        int index = 0;
        while (dec > 0) 
        {
            binaryNum[index] = dec % 2;
            dec = dec / 2;
            index++;
        }
        int startPoint = 0 , endPoint = binaryNum.length - 1 , temp;

        while(startPoint < endPoint){

            temp = binaryNum[startPoint];
            binaryNum[startPoint] = binaryNum[endPoint];
            binaryNum[endPoint] = temp;
        }
        return binaryNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Binary ob = new Binary();

        int binarynumber[] = new int [10];

        System.out.println(" Enter the Decimal number ");
        int decimal = sc.nextInt();
        binarynumber = ob.DecimalToBinary(decimal);

        
        for(int element : binarynumber){
            System.out.print(element);
        }

    }
}
