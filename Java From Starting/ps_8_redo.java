import java.util.Scanner;

class employeeno200{
    int salary ;
    String name ;

    public int getSalary(){
        return salary ; 
    }
    public String getName(){
        return name ;
    }
    public void setName(String Name){
        name = Name;
    }
}
public class ps_8_redo {
    public static void main(String[] args) {
        employeeno200 em = new employeeno200();
        em.setName("india");
        em.getName();
        em.salary = 200000;
        em.getSalary();
        System.out.println(" what the fuck ");
    }
}
