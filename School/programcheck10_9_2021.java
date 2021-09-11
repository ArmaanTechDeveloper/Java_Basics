import java.util.Scanner;

public class programcheck10_9_2021{
    public void nameAndAge(String name , int age){

        String newName = name.toLowerCase();
        System.out.println("name is" + newName + "age is "+age);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        programcheck10_9_2021 obj = new programcheck10_9_2021();

        System.out.println("Enter the name ");
        String name = sc.nextLine();

        System.out.println("Enter the age");
        int age = sc.nextInt();

        obj.nameAndAge(name, age);
    }
}