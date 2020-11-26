class rect{
    private int length;
    private int breadth;
    public rect(){
        this.length = 4;
        this.breadth = 5;
    }
    public rect(int k,int n){
        this.length = k;
        this.breadth = n;
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    
}
public class ps_9_prob4 {
    public static void main(String[] args) {
        rect s = new rect(12,23);
        System.out.println(""+s.getLength()+" "+s.getBreadth());

    }
}
