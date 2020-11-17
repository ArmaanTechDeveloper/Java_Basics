public class varargs {
    // if you need to make an parameter necessary then add int x like in the comment
    static int sum(/*int x,*/int... a) {
        int result = 0;
        for (int element : a) {
            result = result + element;
        }
        return result;
    }

    public static void main(String[] args) {
        // To print the sum of a contunuous series we create varargs like this
        int a = 20, b = 30, c = 40;
        System.out.println(" The sum of a is " + sum(a));
        System.out.println(" The sum of a , b is " + sum(a, b));
        System.out.println(" The sum of a , b, c is " + sum(a, b, c));
        System.out.println(" The sum of nothing is " + sum());


    }
}
