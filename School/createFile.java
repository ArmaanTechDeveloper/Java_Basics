import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class createFile {
    public static void main(String[] args) {
        try{
            File obj = new File("B:\\Java\\School\\FileHandling\\File1.txt");
            FileWriter w = new FileWriter("B:\\Java\\School\\FileHandling\\File1.txt");
            w.write(" This is being updated ");
            w.close();
            System.out.println(" Success fully written into the file ");
            if(obj.createNewFile())
            {
                System.out.println(" File created "+ obj.getName());
            }
            else{
                System.out.println(" File already exist ");
            }
        }
        catch(IOException e){
            System.out.println(" An error occured ");
            e.printStackTrace();
        }
    }
}
