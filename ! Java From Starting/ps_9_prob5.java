class sphere {
    private int radius;

    public void setRadius(int k) {
        this.radius = k;
    }

    public double volume() {
        return (4 / 3) * Math.PI * radius * radius * radius;
    }

    public double surfacearea() {
        return 4 * Math.PI * radius * radius;
    }
}

public class ps_9_prob5 {
    public static void main(String[] args) {
        sphere s = new sphere();
        
        s.setRadius(6);

        System.out.println(s.volume());
        System.out.println(s.surfacearea());
    }
}
