// We cannot use more than one abstract class but we can use interface more than one which implements to make a solid class

interface Bicycle{
    void speedup();
    void brake();
}
interface indiabase{
    void country();
}
class herohonda implements Bicycle , indiabase{
    public void speedup(){
        System.out.println(" speeding up the bicycle ");
    }
    public void brake(){
        System.out.println(" Applying brakes to the bicycle ");
    }
    public void country(){
        System.out.println(" Using this bicycle from india ");
    }

}
public class interfaces{
    public static void main(String[] args) {
        herohonda h = new herohonda();
        h.speedup();
        h.brake();
        h.country();
    }
}