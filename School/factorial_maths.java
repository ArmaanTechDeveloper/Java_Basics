import java.util.Scanner;

class findfactorial {
    public int input() {
        System.out.println(" Enter the number to find the factorial : ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        return input;

    }

    public long factorial(int fac) {
        int i; 
        long fact = 1;
        for (i = 1; i <= fac; i++) {
            fact = fact * i;
        }
        return fact;
    }
}

public class factorial_maths {
    public static void main(String[] args) {
        findfactorial ob = new findfactorial();
        int in = ob.input();
        long fact = ob.factorial(in);
        System.out.println(" The factorial is " + fact);
    }
}
