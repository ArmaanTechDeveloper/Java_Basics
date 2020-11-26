
class cylinder{

    private int radius;
    private int height;

    public void setRadius(int k){
        this.radius = k;
    }
    public int getRadius(){
        return radius;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }
}
public class ps_9_prob1 {
    public static void main(String[] args) {
        cylinder s = new cylinder();
        s.setHeight(12);
        System.out.println(s.getHeight());
        s.setRadius(60);
        System.out.println(s.getRadius());
    }
}
