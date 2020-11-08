import java.util.Scanner;

class marks2{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        
        System.out.println(" Enter 1st subject marks ");
        int a = sc.nextInt();
        System.out.println(" Enter 2nd subject marks ");
        int b = sc.nextInt();
        System.out.println(" Enter 3rd subject marks ");
        int c = sc.nextInt();
        System.out.println(" Enter 4th subject marks ");
        int d = sc.nextInt();
        System.out.println(" Enter 5th subject marks ");
        int e = sc.nextInt();
        System.out.println(" Enter the subject marks out of ");
        int pp = sc.nextInt();

        int total = a+b+c+d+e;
        int ppp = pp * 5;
        int percentage  = total * 100 / ppp;
        System.out.println(" The percentage marks is "+percentage);

    }
}