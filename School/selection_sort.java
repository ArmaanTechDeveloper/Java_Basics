public class selection_sort {
    public static void main(String[] args) {
        int a[] = { 3, -1, 8, 5, 4, 6 };
        int n = a.length;
        int i, j, minindex;
        for (i = 0; i < n - 1; i++) {
            minindex = i;
            for (j = i; j < n; j++) {
                if (a[j] < a[minindex]) {
                    minindex = j;
                }
            }
            int temp = a[i];
            a[i] = a[minindex];
            a[minindex] = temp;
        }
        for (int item : a) {
            System.out.print(item);
        }
    }
}
