import java.util.Scanner;

class cylindrical {
    private int radius;
    private int height;
    private int test;
    private int length;
    private int breadth;

    public cylindrical(int a) {
        this.test = a;
        System.out.println(" The value of the test variable is " + test);
    }

    public cylindrical(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setRadius(int r) {
        this.radius = r;
    }

    public void setHeight(int h) {
        this.height = h;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public void volume() {
        double v = Math.PI * radius * radius * height;
        System.out.println(" The volume is " + v);
    }

    public void surfaceArea() {
        double s = 2 * Math.PI * radius * height;
        System.out.println(" The surface area of the cylinder is " + s);
    }
}

public class ps_9_redo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println(" Enter the length ");
        x = sc.nextInt();
        System.out.println(" Enter the breadth ");
        y = sc.nextInt();
        cylindrical ob = new cylindrical(x, y);
        int r, h;
        System.out.println(" Enter the radius of the cylinder ");
        r = sc.nextInt();
        System.out.println(" Enter the height of the cylinder ");
        h = sc.nextInt();
        ob.setRadius(r);
        ob.setHeight(h);
        System.out.println(" The radius you entered is " + ob.getRadius());
        System.out.println(" The height you entered is " + ob.getHeight());
        ob.volume();
        ob.surfaceArea();
        sc.close();
    }
}
