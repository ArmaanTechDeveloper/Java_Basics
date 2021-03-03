public class ArraymaxElement {
    public static void main(String[] args) {
        int a[] = { 2, 5, 6, 3, 7, 8, 9, 1, 0, 2 };
        int i, j;
        int max = a[0];
        for (i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(" max is " + max);
    }
}