class monkeytest{
    public void jump(){
        System.out.println(" This is the jump method in the monkey class");
    }
    public void bite(){
        System.out.println(" This is the bite method in the monkey class ");
    }

}
interface BasicAnimalstest{
    void eat();
    void sleep();
}

class Humantest extends monkeytest implements BasicAnimalstest{
    public void eat(){
        System.out.println(" This is the eat method of the interface ");
    }
    public void sleep(){
        System.out.println(" This is the sleep method of the interface ");
    }
}

public class ps_11_prob3 {
    public static void main(String[] args) {
        Humantest ob = new Humantest();
        ob.jump();
        ob.bite();
        ob.eat();
        ob.sleep();
    }
}
