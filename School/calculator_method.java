import java.util.Scanner;

public class calculator_method {
    public void add(int a, int b) {
        int c = a + b;
        System.out.println(" The sum of the entered numbers is : " + c);
    }

    public void substract(int a, int b) {
        int c = a - b;
        System.out.println(" The difference of the entered numbers is : " + c);
    }

    public void multiply(int a, int b) {
        int c = a * b;
        System.out.println(" The multiplication between the two numbers is  : " + c);
    }

    public void divide(int a, int b) {
        int c = a / b;
        System.out.println(" The division of the entered numbers is : " + c);
    }

    public static void main(String[] args) {
        calculator_method ob = new calculator_method();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number of times you want to do the calculation ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println(" 'a' for add , 's' to substract , 'm' to multiply , 'd' for divide ");
            char in = sc.next().charAt(0);
            System.out.println(" Enter two numbers ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            switch(in){
                case 'a':
                ob.add(x, y);
                break;
                case 's':
                ob.substract(x, y);
                break;
                case 'm':
                ob.multiply(x, y);
                break;
                case 'd':
                ob.divide(x, y);
                break;
                default :
                System.out.println(" Invalid input ");
                break;
            }
        }
        sc.close();
    }
}
