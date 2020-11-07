import java.util.*;

class odd_even {
    Scanner sc = new Scanner(System.in);
    static int orignal[], arrange[];
    int n;

    //variable declaration
    odd_even(int k) {
        n = k;
        orignal = new int[n];
        arrange = new int[n];
    }

    public static void main(String[] args) {
        odd_even ob = new odd_even(10);
        ob.accept();
        ob.arrange();
        ob.display1();
        ob.display2();
    }

    static void accept(){
        System.out.println(" Enter the numbers ");
        for(int i = 0;i<n;i++){
            orignal[i] = sc.nextInt();
        }

    static void arrange() {
        int position = 0;
        for (int i = 0; i < n; i++) {
            int n = orignal[i];
            if (n % 2 != 0) {
                arrange[position] = n;
                position++;
            }
        }
        for (int i = 0; i < n; i++) {
            int n = orignal[i];
            if (n % 2 == 0) {
                arrange[position] = n;
                position++;
            }
        }
    }

    static void display1(){
        System.out.println(" Original array ");
        for(int element : orignal){
            System.out.println(element);
        }

    static void display2() {
        System.out.println(" arranged array ");
        for (int element : arrange) {
            System.out.println(element);
        }
    }
}