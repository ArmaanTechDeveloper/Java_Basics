import java.util.Scanner;

// Contructor acts as a default method to run when the object of the class is created
// Contructor does not return anything
// Constructor with same name but different arguments can be overloaded 

class rectangle2 {

    private int length;
    private int breadth;

    public rectangle2() {
        this.length = 20;
        this.breadth = 10;
    }

    public rectangle2(int l) {
        this.length = l;
    }

    public rectangle2(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public int getl() {
        return length;
    }

    public int getb() {
        return breadth;
    }
}

public class constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the length and breadth of the rectangle ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        rectangle2 r = new rectangle2(x, y);
        System.out.println(" The value of length from constructor is : " + r.getl());
        System.out.println(" The value of breadth from constructor is : " + r.getb());
        sc.close();
    }
}
