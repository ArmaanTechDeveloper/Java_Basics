import java.util.*;

class question_9{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        
        System.out.println(" Enter your word to check palindrome or not ");
        String s = sc.next();

        int l = s.length();

        String w="";
        int i;

        for(i=l-1;i>=0;i--){
            char ch = s.charAt(i);
            w=w+ch;
        }

        if(w.equals(s)){
            System.out.println(" The word you entered is a palindrome word ");
        }
        else{
            System.out.println(" The word you entered is not a palindrome word ");
        }

        sc.close();
    }
}