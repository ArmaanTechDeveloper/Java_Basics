class Employees {
    int salary;
    String name;

    public int getsalary() {
        return salary;
    }

    public String getname() {
        return name;
    }

    public String setname(String n) {
        name = n;
        return name;
    }

}

public class ps_8_prob1 {
    public static void main(String[] args) {
        System.out.println(" ");
        Employees armaan = new Employees();
        armaan.setname(" armaan singh lambhha ");
        armaan.salary = 20000;
        System.out.println(armaan.getname());
        System.out.println(armaan.getsalary());

    }
}
