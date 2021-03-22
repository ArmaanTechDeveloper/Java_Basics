import java.util.*;

class ps_6_prob1 {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        // create an array of 5 floats and calculate their sum

        float[] integer = new float[5];
        System.out.println(" Enter the elements of an array ");
        int i;
        for (i = 0; i < integer.length; i++) {
            System.out.println(" Enter " + i + " element");
            integer[i] = sc.nextFloat();
        }
        float c = 0;

        for (float element : integer) {
            c = c + element;
            System.out.println(element);
        }
        System.out.println(" The sum of the array is " + c);
        sc.close();
    }
}