import java.util.Scanner;

public class WordWise {
    String str;

    public void readsent() {
        Scanner k = new Scanner(System.in);
        System.out.println(" Enter the string ");
        String s = k.nextLine();
        s = s.toLowerCase();
        this.str = s;
    }

    public int freq_vowel(String S) {
        int i, j, k = 0;
        
        char ch;
        String p = " ";
        int l = S.length();
        for (i = 0; i < l; i++) {
            ch = S.charAt(i);
            if(ch == ' '){
                p = s.substring();
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                k = k + 1;
            }
        }
        }
        return k;
    }

    public void arrange() {
        int vowel = freq_vowel(this.str);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }
        System.out.println(" The frequency of vowel is ");
        System.out.println(vowel);
    }

    public static void main(String[] args) {
        WordWise w = new WordWise();
        w.readsent();
        w.arrange();
    }
}