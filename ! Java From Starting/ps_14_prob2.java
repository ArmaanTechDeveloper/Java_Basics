// Wap to print haha during arithmetic exception and hehe during illegal argument 

public class ps_14_prob2 {
    public static void main(String[] args) {
        int a = 12;
        int b = 14;

        try{
            int c = a / b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Ha ha");
        }
        catch(IllegalArgumentException k){
            System.out.println("hehe");
        }
    }
}
