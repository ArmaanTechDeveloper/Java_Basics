//ring lift and disconnect

abstract class telephonetest{
    public void ring(){
        System.out.println(" ringing ....");
    }
    abstract void lift();
    abstract void disconnect();
}
class smartelephone extends telephonetest{
    public void lift(){
        System.out.println(" lifting.....");
    }
    public void disconnect(){
        System.out.println(" disconnecting");
    }
}

public class ps_11_prob4{
    public static void main(String[] args) {
        telephonetest ob = new smartelephone();
        ob.ring();
    }
}