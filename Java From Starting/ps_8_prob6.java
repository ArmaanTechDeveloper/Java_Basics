class circle{
    int r;
    public int area(){
        return (22/7)*r*r;
    }
    public int perimeter(){
        return 2*(22/7)*r;
    }
}

public class ps_8_prob6 {
    public static void main(String[] args) {
        circle calc = new circle();
        calc.r = 8;
        System.out.println(calc.area());
        System.out.println(calc.perimeter());
    }
}
