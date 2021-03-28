abstract class penABC{
    abstract void write();
    abstract void refill();
}

class FountainPenABC extends penABC{
    public void write(){
        System.out.println(" this is the write function ");
    }
    public void refill(){
        System.out.println(" this is the refill function ");
    }
    public void changeNib(){
        System.out.println(" changing nib ");
    }
}

public class ps_11_prob1{
    public static void main(String []args){
        FountainPenABC ob = new FountainPenABC();
        ob.write();
        ob.refill();
        ob.changeNib();
    }
}