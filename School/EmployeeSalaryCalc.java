import java.util.Scanner;
public class EmployeeSalaryCalc {
    String name;
    int empcode;
    double BasicPay;

    void EmployeeSalaryCalc(){
        this.empcode = 0;
        this.BasicPay = 0;
        this.name = "";
    }

    void EmployeeSalaryCalc(String n , int p , double q){
        this.name = n;
        this.empcode = p;
        this.BasicPay = q;
    }

    public double salarycal(){
        double HRA;
        double DA;
        HRA = 0.3* this.BasicPay;
        DA = 0.4 * this.BasicPay;
        double Salary = this.BasicPay + HRA + DA;
        return Salary;
    }
    public void getInput(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the name of the Employee");
        String name = sc.next();
        System.out.println("Enter the id of the Employee");
        int emp = sc.nextInt();
        System.out.println("Enter the basic pay of the Employee");
        int bp = sc.nextInt();
        EmployeeSalaryCalc(name, emp, bp);
    }
    public void display(){
        System.out.println(" Name : "+this.name);
        System.out.println(" id : "+this.empcode);
    }
    public static void main(String[]args){
        EmployeeSalaryCalc ob = new EmployeeSalaryCalc();
        ob.getInput();
        ob.display();
        System.out.println(" Salary : "+ob.salarycal());

    }
}
