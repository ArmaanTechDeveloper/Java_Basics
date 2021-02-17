// abstract class is a visual class which is used to create a solid existence class

abstract class shape {
    abstract void area();

    abstract void perimeter();
}

class rectangle5 extends shape {
    @Override
    public void area() {
        System.out.println(" This is the area of the rectangle ");
    }

    @Override
    public void perimeter() {
        System.out.println(" This is the perimeter of the rectangle");
    }
}

class circle5 extends shape {
    @Override
    public void area() {
        System.out.println(" This is the area of the circle ");
    }

    @Override
    public void perimeter() {
        System.out.println(" This is the perimeter of the circle");
    }
}

class sphere5 extends shape {
    @Override
    public void area() {
        System.out.println(" This is the area of the sphere ");
    }

    @Override
    public void perimeter() {
        System.out.println(" This is the perimeter of the sphere");
    }
}

public class abstract_class {
    public static void main(String[] args) {
        rectangle5 r = new rectangle5();
        r.area();
        r.perimeter();
        circle5 c = new circle5();
        c.area();
        c.perimeter();
        sphere5 s = new sphere5();
        s.area();
        s.perimeter();
    }
}