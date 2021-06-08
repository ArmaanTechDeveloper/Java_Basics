import java.util.Scanner;

public class seperate{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        // inputting the string 
        System.out.println(" Enter the string ");
        String word = sc.nextLine();

        // intitializing the check condition condition 
        int length = word.length();
        char check = word.charAt(length-1);

        // checking the sentence
        if(check == '.' || check == '?' || check == '!'){
        //removing the last character
        word = word.replace(".", "");word = word.replace("?", "");word = word.replace("!", "");
        // terminating the sentence
        for(String element : word.split(" ")){

            String join = "";
            String outputFinal;
            char[] try1 = element.toCharArray();
 
            for (int i = try1.length - 2; i >= 0; i--){
                join = join + try1[i];
            }
        outputFinal = element + join;
        System.out.print(outputFinal + " ");
        }
    }
    else{
        System.out.println(" Invalid input ");
    }
    }
}