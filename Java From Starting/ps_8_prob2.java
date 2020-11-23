class cellphone{
    public void ringing(){
        System.out.println(" Ringing...");
    }
    public void vibrate(){
        System.out.println(" Vibrating...");
    }
    public void callfriend(){
        System.out.println(" calling a friend...");
    }

}

public class ps_8_prob2 {
    public static void main(String[] args) {
        cellphone asus = new cellphone();
        System.out.println(" ");
        asus.callfriend();
        asus.ringing();
        asus.vibrate();
    }
}
