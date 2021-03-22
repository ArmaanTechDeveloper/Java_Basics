interface MusicPlayer{
    void playMusic();
}
interface application{
    void runApplication();
    default void launchWhatsapp(){
        System.out.println("Launching Whatsapp ... ");
    }
}
class cellphoneop{
    public void Ring(){
        System.out.println(" Ringing ....");
    }
}
class smartPhoneop extends cellphoneop implements MusicPlayer , application{
    public void playMusic(){
        System.out.println(" Playing music...");
    }
    public void runApplication(){
        System.out.println(" Launching application ... ");
    }
}

public class interfacestwo{
    public static void main(String[] args) {
        smartPhoneop ob = new smartPhoneop();
        ob.launchWhatsapp();
        ob.Ring();
        ob.runApplication();
        ob.playMusic();
    
    }
}