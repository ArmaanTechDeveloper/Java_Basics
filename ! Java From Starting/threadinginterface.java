
class threading1 implements Runnable{
    public void run(){
        int i= 0;
        while(i<1000){
        System.out.println("Hello bacho kaisa hai aap log");
        i++;
        }
    }
}
class threading2 implements Runnable{
    public void run(){
        int i= 0;
        while(i<1000){
        System.out.println("Hello i am from code with harry and welcome he here");
        i++;
        }
    }
}
public class threadinginterface{
    public static void main(String[] args) {
        threading1 bullet1 = new threading1();
        Thread gun1 = new Thread(bullet1);
        threading2 bullet2 = new threading2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}