



public class recursionsum {
    static int sum(int n){
        if(n==1){
            return 1;
        }
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(" ");
        int c = sum(4);
        System.out.println("The sum of the numbers is "+c);

    }
}
