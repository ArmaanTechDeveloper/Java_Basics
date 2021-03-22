// Running order of the constructor in the derived classes ;

class basic{
    public basic(){
        System.out.println(" This is the constructor of the basic class ");
    }
}
class derived10 extends basic{
    public derived10(){
        System.out.println(" This is the constructor of the derived one class ");
    }
}
class derived20 extends derived10{
    public derived20(){
        System.out.println(" This the constructor of the derived two class ");
    }
}

public class ps_10_prob5 {
    public static void main(String[] args) {
        derived20 ob = new derived20();
    }
    
}
