import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        int i;
        for (i = 0; i < a.length; i++) {
            System.out.println(" Enter Your element of the array ");
            a[i] = sc.nextInt();
        }
        for(int element : a){
            System.out.println(element);
        }
    }
}