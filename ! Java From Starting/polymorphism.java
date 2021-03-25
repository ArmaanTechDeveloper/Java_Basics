interface cycle{
    void twoWheels();
}
interface rickshaw{
    void threeWheels();
}

class AvonRickshaw implements cycle , rickshaw{
    public void twoWheels(){
        System.out.println(" Two wheels are there in cycle");
    }
    public void threeWheels(){
        System.out.println(" Three wheels are there in rickshaw ");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        cycle o = new AvonRickshaw();
        o.twoWheels(); // this is allowed
        //o.threeWheels(); // this is not allowed
        AvonRickshaw k = new AvonRickshaw();
        k.twoWheels();
        k.threeWheels();
    }
}
