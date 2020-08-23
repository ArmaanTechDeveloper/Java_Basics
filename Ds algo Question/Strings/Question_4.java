import java.util.*;

class question_4 {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the string ");
        String s = sc.next();

        char ch;
        char c;
        int l = s.length();
        int co = 0;

        for (int j = 0; j < s.length(); j++) {
            ch = s.charAt(j);
            for (int i = 0; i < s.length(); i++) {
                c = s.charAt(i);
                if (ch == c) {
                    co = co + 1;
                }
            }
            if(co>1){
                System.out.println(ch);
            }
            co = 0;
        }
        sc.close();
    }
}