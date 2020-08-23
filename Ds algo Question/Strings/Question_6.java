import java.util.*;

class question_6 {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the string ");
        String s = sc.next();

        int i, l;
        String w = "";
        l = s.length();
        for (i = l - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            w = w + ch;
        }
        System.out.println(w);
        sc.close();
    }
}