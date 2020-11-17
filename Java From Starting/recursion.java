public class recursion {
    static int recur(int a){
        if(a==0 || a==1){
            return 1;
        }
        else{
            int c = a * recur(a-1); // here the method is called again by the method only
            return c;
        }
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(" The factorial of n is "+recur(n));
    }
}
