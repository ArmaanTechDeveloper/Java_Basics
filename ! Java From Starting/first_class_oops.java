import java.util.Scanner;

class averageCalculate {
    Scanner k = new Scanner(System.in);

    public void initialprint() {
        System.out.println(" Enter 3 number to find the average ");
    }

    int x, y, z;
    int[] arr = new int[3];

    public double averageCalculator() {
        double totalsum = x + y + z;
        double average = Math.floor(totalsum / 3);
        return average;
    }

    public void inpandprint() {
        System.out.println(" Enter your name ");
        String name = k.nextLine();
        System.out.println(" Your name is " + name);
    }

}

class floorfunction {
    public double lowerValue(double k) {
        double lower = Math.floor(k);
        return lower;
    }
    public double upperValue(double k) {
        double upper = Math.ceil(k);
        return upper;
    }
}

public class first_class_oops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" This is a test class which calculates the average of 3 numbers ");
        averageCalculate cal = new averageCalculate();
        floorfunction lowVal = new floorfunction();

        cal.initialprint();

        cal.x = sc.nextInt();
        cal.y = sc.nextInt();
        cal.z = sc.nextInt();

        System.out.println(" The average of the numbers is " + (cal.averageCalculator()));
        cal.inpandprint();
        double widthLow = lowVal.lowerValue(6.354);
        double lengthup = lowVal.upperValue(9.23);

        System.out.println(" The upper value of length is "+lengthup);
        System.out.println(" The lower width is "+widthLow);

    }
}