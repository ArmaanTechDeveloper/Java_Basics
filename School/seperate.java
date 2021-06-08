import java.util.Scanner;

public class seperate {
    public static void main (){
        Scanner sc = new Scanner (System.in);

        // inputting the string 
        System.out.println(" Enter the string ");
        String word = sc.nextLine();

        // intitializing the check condition condition 
        int length = word.length();
        char check = word.charAt(length-1);
        System.out.println(check);
        // terminating the sentence
        for(String element : word.split(" ")){

        }
    }
}