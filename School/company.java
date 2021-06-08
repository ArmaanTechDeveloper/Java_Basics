import java.util.Scanner;
class employeetop{
    public int id;
    String name;

    employeetop(int identity , String name){
        this.id = identity;
        this.name = name;
    }
    public void display(){
        System.out.println("Name : "+this.name +" ID : "+this.id +"\n");
        
    }
}
public class company{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        employeetop []arr;
        arr = new employeetop[2];
        for (int i = 0; i < 2; i++) {
            System.out.println(" Enter the id ");
            int Enterid = sc.nextInt();
            System.out.println(" Enter the name ");
            String Entername = sc.next();
            arr[i] = new employeetop(Enterid , Entername);
        }

        for (int i = 0; i < 2; i++) {
            arr[i].display();
        }
        sc.close();
    }
}