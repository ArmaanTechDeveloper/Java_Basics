public class lec5prob7 {
    public static void main(String[] args) {
        int n = 5;
        int k = n + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
