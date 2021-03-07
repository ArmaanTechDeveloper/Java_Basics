import java.util.Scanner;

public class duplicate_character {

    public String inputWord() {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the word to remove the consecutive element in the word ");
        String w = sc.next();
        return w;
    }

    public void RemoveConsecutiveChar(String s) {
        int i, SecondIndex, l , FirstIndex;
        l = s.length();
        for (i = 0; i < l -1 ; i++) {
            char ch = s.charAt(i);
            FirstIndex = i;
            SecondIndex = FirstIndex + 1;
            char ch0 = s.charAt(SecondIndex);
            if(ch0 == ch){
                System.out.print("");
            }
            else{
                System.out.print(ch);
            }
             
        }
        System.out.print(s.charAt(l-1));
        
    }

    public static void main(String[] args) {
        duplicate_character ob = new duplicate_character();
        ob.RemoveConsecutiveChar(ob.inputWord());

    }
}