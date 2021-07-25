import java.util.Scanner;

import ArithmeticExp.*;

public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String enter = sc.next();
        postToinfix obj = new postToinfix();
        obj.postfixToinfix(enter);
    }
}
