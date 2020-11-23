class Tommy{
    public void hit(){
        System.out.println(" Hitting...");
    }
    public void fire(){
        System.out.println(" Fireing...");
    }
    public void run(){
        System.out.println(" Running...");
    }
}

public class ps_8_prob5 {
    public static void main(String[] args) {
        Tommy t = new Tommy();
        t.hit();
        t.fire();
        t.run();
    }
}
