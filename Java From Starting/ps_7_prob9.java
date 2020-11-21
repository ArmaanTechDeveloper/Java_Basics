import java.util.Scanner;

public class ps_7_prob9 {
    static int convert(int temp) {
        int result = ((temp / 5) * 9) + 32;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the temperature in celsius ");
        int c = sc.nextInt();

        int convert = convert(c);
        System.out.println(" The temperature in farenheit is " +convert+"F");

    }
}
