import java.io.FileWriter;
import java.io.IOException;

public class WritingFile {
    public static void main(String[] args) {
        try{
            FileWriter w = new FileWriter("B:\\Java\\School\\FileHandling\\File2.txt");
            w.write(" Get well soon mam");
            System.out.println(" Successfully wrote into the file ");
            w.close();
        }
        catch(IOException e){
            System.out.println(" An error occured ");
            e.printStackTrace();

        }
    }
}
