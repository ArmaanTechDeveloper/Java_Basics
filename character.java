import java.util.*;

class character {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string to print one by one ");
        String in = sc.next();

        char ch;
        int i;
        int l = in.length();

        for (i = 0; i < l; i++) {
            ch = in.charAt(i);
            System.out.println(ch);
        }
        sc.close();
    }
}