public class lec5prob8 {

    // floyds triangle problem
    public static void main(String[] args) {
        int n = 5;
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}
