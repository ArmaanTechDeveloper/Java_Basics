import java.util.Scanner;

public class ps_7_prob7 {
    static void repeat(int times) {
        int number = 4;
        if (times <= 0) {
            return;
        }
        repeat(times - 1);
        System.out.println(times);
    }

    public static void main(String[] args) {
        repeat(3);
    }
}
