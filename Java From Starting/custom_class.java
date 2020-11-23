class employee{

    int id;
    String name;

    public void print_name(){
        System.out.println(" ");
        System.out.println(" The id is : "+id);
        System.out.println(" The name of the emplyee is : "+name);
    }
}

class average {
    int chem,maths;
    public int average(){

        int total = chem + maths;
        int total_average = total /2;
        return total_average;

    }
}

public class custom_class{
    public static void main(String[] args) {

        employee armaan = new employee(); //creating object of employee class
        armaan.id = 15295;
        armaan.name = " Armaan singh lambhha";
        armaan.print_name(); // calling the method as object 

        employee harry = new employee(); // creating object of emplyee class for harry
        harry.id = 62533;
        harry.name = "Code With Harry";
        harry.print_name(); // calling the method as object

        average av = new average();
        av.chem = 97;
        av.maths = 85;
        int marks = av.average();
        System.out.println(marks);

    }
}