class baseCircle{
    public int radius;
    public int height;

    public void setSide(int side, int h){
        this.radius = side;
        this.height = h;
    }
    public double areaCircle(){
        return Math.PI*this.radius*this.radius;
    }
    public double volumeCircle(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
class cylinder3 extends baseCircle{
    public int radius , height;

    public void setcylinder(int side, int h){
        this.radius = side;
        this.height = h;
    }
    public double areacylinder(){
        return Math.PI*this.radius*this.radius;
    }
    public double volumecylinder(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

//cylinder 2 is circle and cylinder 3 is cylinder :)

public class ps_10_prob1{
    public static void main(String[] args) {
        cylinder3 obj = new cylinder3();
        obj.setSide(20,30);
        obj.setcylinder(10, 10);
        double a = obj.areaCircle();
        double b = obj.volumeCircle();
        double k = obj.areacylinder();
        double l = obj.volumecylinder();
        System.out.println(" area and volume of rectangle is "+a+b);
        System.out.println(" area and volune of cube is "+k+l);

    }
}