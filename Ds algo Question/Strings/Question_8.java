import java.util.*;

class question_8{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        
        System.out.println(" Enter the character ");
        char ch = sc.next().charAt(0);

        int number = (int) ch;
        System.out.println(" The ASCII code for your character is : "+number);

        System.out.println(" Enter the ASCII code to convert it into a character");
        int num = sc.nextInt();

        char c = (char) num;
        System.out.println(" The character for your number is : "+c);
        sc.close();
    }
}