
class survol {

    private int radius;
    private int height;

    public void setRadius(int k) {
        this.radius = k;
    }

    public void setHeight(int h) {
        this.height = h;
    }

    public int area() {
        int area = 2 * 3 * radius * height;
        return area;
    }

    public int volume() {
        int vol = 3 * radius * radius * height;
        return vol;
    }
}

public class ps_9_prob2 {
    public static void main(String[] args) {
        survol s = new survol();

        s.setHeight(12);
        s.setRadius(6);
        System.out.println(s.area());
        System.out.println(s.volume());

    }
}
