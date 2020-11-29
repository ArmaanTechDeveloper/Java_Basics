class baseRectangle{
    // area and volume of both
    public int length;
    public int breadth;
    public int height;
    public void setLength(int length , int breadth , int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    public int area(){
        return length * breadth;
    }
    public int volume(){
        return length*breadth*height;
    }
}
class baseCuboid extends baseRectangle{
    public int side;
    public void setSide(int side){
        this.side = side;
    }
    public int areaCube(){
        return side*side;
    }
    public int volumeCube(){
        return side*side*side;
    }
}

public class ps_10_prob2 {
    public static void main(String[] args) {
        baseCuboid obj = new baseCuboid();
        obj.setLength(10, 20, 30);
        obj.setSide(30);
        int a = obj.area();
        int b = obj.volume();
        int k = obj.areaCube();
        int l = obj.volumeCube();
        System.out.println(" area and volume of rectangle is "+a+b);
        System.out.println(" area and volune of cube is "+k+l);
    }
}
