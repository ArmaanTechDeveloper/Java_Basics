interface tvremotetest{
    public void button();
     
}
interface smartremote extends tvremotetest{
    public void yellowbutton();
}
class televisiontest implements smartremote{
    public void button(){
        System.out.println(" button....");
    }
    public void yellowbutton(){
        System.out.println("yellowbutton....");
    }
}

public class ps_11prob7 {
    public static void main(String[] args) {
        televisiontest ob = new televisiontest();
        ob.button();
        ob.yellowbutton();
    }
}
