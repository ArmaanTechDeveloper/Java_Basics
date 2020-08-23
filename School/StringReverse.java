import java.util.*;

class StringReverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        swapParis(s1);
    }

    public static void swapParis(String s1) {
        StringBuffer sb = new StringBuffer();
        int l = s1.length();
        if (l % 2 == 0) {
            for (int i = 0; i < s1.length() - 1; i = i + 2) {
                char a = s1.charAt(i);
                char b = s1.charAt(i + 1);
                sb.append(b).append(a);
            }
            System.out.println(sb);
        } else {
            for (int i = 0; i < s1.length() - 1; i = i + 2) {
                char a = s1.charAt(i);
                char b = s1.charAt(i + 1);
                sb.append(b).append(a);
                System.out.println(sb);
            }
            sb.append(s1.charAt(l - 1));
            System.out.println(sb);
        }
    }
}