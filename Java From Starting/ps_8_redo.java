
class employeeno200 {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        name = Name;
    }
}

class cellphone65 {
    public void ring() {
        System.out.println(" Ringing .... ");
    }

    public void vibrate() {
        System.out.println(" Vibrating ....");
    }

    public void blank() {
        System.out.println("\n");
    }
}

class squareoid {
    int side;

    public double area() {
        double area = side * side;
        return area;
    }

    public double perimeter() {
        double perimeter = 4 * side;
        return perimeter;
    }
}

class rectangleoid{
    int length;
    int breadth;
    public double area(){
        double area = length * breadth;
        return area;
    }
    public double perimeter(){
        double perimeter = 2*(length+breadth);
        return perimeter;
    }
}

class tommyceti{
    public void hit(){
        System.out.println(" Hitting ...");
    }
    public void running(){
        System.out.println(" Running ...");
    }
    public void firing(){
        System.out.println(" Firing ...");
    }
}

class incircle{
    int n;
    public void repeat6(){
        for (int  i=0 ; i<=n ; i++){
            System.out.println("6");
        }
    }
}

public class ps_8_redo {
    public static void main(String[] args) {
        employeeno200 em = new employeeno200();
        cellphone65 phone = new cellphone65();
        squareoid sq = new squareoid();
        rectangleoid r = new rectangleoid();
        tommyceti t = new tommyceti();
        incircle i = new incircle();

        phone.blank();
        em.setName("india");
        String n = em.getName();
        em.salary = 200000;
        int k = em.getSalary();
        System.out.println(" The name is : " + n);
        System.out.println(" The salary is : " + k);

        phone.blank();
        phone.ring();
        phone.vibrate();
        phone.blank();

        sq.side = 3;
        double area = sq.area();
        double perimeter = sq.perimeter();
        System.out.println(" The area of squareoid is "+area);
        System.out.println(" The perimeter of sqareoid is "+perimeter);
        phone.blank();

        r.breadth = 6;
        r.length = 3;
        double arear = r.area();
        double perimeterr = r.perimeter();
        System.out.println(" The area of rectangle is "+arear);
        System.out.println(" The perimeter of rectangle is "+perimeterr);
        phone.blank();

        t.hit();
        t.running();
        t.firing();
        phone.blank();

        i.n = 6;
        i.repeat6();

    }
}
