public class recursionpower {
    static int powers(int n,int p){
        if(p == 0){
            return 1;
        }
        return n * powers(n,p-1);
    }
    public static void main(String[] args) {
        System.out.println(powers(3,4));
    }
}
