public class twoDmaxElement {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 8, 6, 7 }, { 1 , 50 , 20 } };
        int i, j, max = 0;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {

                max = arr[i][0];

                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
                // System.out.print(max+"<"+arr[i][j] + ",");
            }
            System.out.println(max);
        }
    }
}
