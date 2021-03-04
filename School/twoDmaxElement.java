public class twoDmaxElement {
    int arr[][] = new int[3][3];

    twoDmaxElement(int a[][]) {
        this.arr = a;
    }

    void calculateMaxSum() {
        int i, j, max = 0;
        for (i = 0; i < arr.length; i++) {
            max = arr[i][0];
            for (j = 0; j < arr.length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
            System.out.println(max);
        }
    }

    public static void main(String[] args) {
        int k[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        twoDmaxElement ob = new twoDmaxElement(k);
        ob.calculateMaxSum();
    }
}