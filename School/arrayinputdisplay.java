import java.util.Scanner;

public class arrayinputdisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id[] = new int [2];
        String name[] = new String[2];
        for (int i = 0; i < name.length; i++) {
           System.out.println("Enter the id"); 
           id[i] = sc.nextInt();
           System.out.println(" Enter the name");
           name[i] = sc.nextLine();
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("Id : "+id[i] + " Name : "+name[i]);
        }
    }
}
