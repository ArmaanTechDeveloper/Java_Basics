import java.util.Scanner;

public class methods {

    static int average(int a, int b) {
        int c = (a + b) / 2;
        return c;
    }
    static void change (int a){
        a=68;
    }
    static void change2(int []a){
        a[0] = 60;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the first number ");
        int x = sc.nextInt();

        System.out.println(" Enter the second number ");
        int y = sc.nextInt();

        int z = average(x, y);

        System.out.println(" The average of the numbers is " + z);

        // If an address is passed then the value of variable is copied to the method

        change(x);
        System.out.println(" The value of x after running the method is "+x);

        // Let's try passing an array and changing it 
        // As array is an object then the value of array changes

        int [] flt = {20,30,40,80};
        change2(flt);
        System.out.println(flt[0]);
        
        // Hence the value of the flt array changes

        

    }
}