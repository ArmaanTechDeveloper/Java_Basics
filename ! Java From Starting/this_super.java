class base2{
    int x;
    base2(){
        System.out.println(" This is the first constructor");
    }
    public void setX(int k){
        this.x = k;
    }
    public int getX(){
        return x;
    }
    base2(int k){
        System.out.println(" I am second constructor of base class : "+k);
    }
}
class derived3 extends base2{

    derived3(){
        System.out.println(" This is the second constructor");
    }
    derived3(int k){
        super(k);
        System.out.println(" This is the second constructor with value of k : "+k);
    }
    

}
public class this_super {
    public static void main(String[] args) {
        derived3 d = new derived3(5);
        d.setX(366);
        System.out.println(d.getX());
    }
}
