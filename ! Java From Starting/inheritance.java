// By default the khali function without the parameters is executed but by super keyword we can use any constuctor of any parameters

class base1 {
    base1() {
        System.out.println(" This is a constructor of base class ");
    }

    base1(int x) {
        System.out.println(" I am a constructor of base class with value of x " + x);
    }
}

class derived1 extends base1 {
    derived1() {
        System.out.println(" This is a constructor of derived class ");
    }

    derived1(int x) {
        super(x);
        System.out.println(" This is a constructor of derived class with value of x as " + x);
    }
}

class derived2 extends derived1 {
    derived2() {
        System.out.println(" I am a constructor of derived second class ");
    }

    derived2(int k) {
        super(k);
        System.out.println(" I am a constructor of derived second class with value of k : " + k);
    }
}

public class inheritance {
    public static void main(String[] args) {
        derived2 d = new derived2(2);

    }
}