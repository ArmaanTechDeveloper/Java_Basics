import java.util.Scanner;

public class BinaryToDecimal{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print(" Enter the Binary number : ");
    int InputBinaryNumber = sc.nextInt();

    int FinalDecimalNumber = 0 , power = 0 , OnebyOneDigit;


    while(InputBinaryNumber != 0){
      OnebyOneDigit = InputBinaryNumber % 10;
      FinalDecimalNumber = FinalDecimalNumber + (OnebyOneDigit * (int) Math.pow(2,power++));
      InputBinaryNumber = InputBinaryNumber / 10;
    }
    System.out.println(" Decimal Number - "+FinalDecimalNumber);
  }
}


/*
  Binary Number to Decimal number conversion 
  Input  : 10100
  Output : 20

  completed on 22nd March 2021 by ArmaanTechDeveloper
*/