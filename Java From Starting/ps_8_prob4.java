class rectangle{
    int l;
    int b;
    public int area(){
        return l*b;
    }
    public int perimeter(){
        return 2*(l+b);
    }
}

public class ps_8_prob4 {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.l = 20;
        r.b = 60;
        System.out.println(r.area());
        System.out.println(r.perimeter());
    }
}
