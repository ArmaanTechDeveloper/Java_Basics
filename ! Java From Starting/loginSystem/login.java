/* 
 --> Usage details : 
 just create a file called "loginData.txt" in the same directory where the program is in 
 
 
 made 😂 by @ArmaanTechDeveloper on feb 09 2022
 GITHUB : https://github.com/ArmaanTechDeveloper
 
 WARNING : if you are new to coding this is a little bit tuff to understand but if your basic concepts are clear 
 then you can too understand it 
 if you are fully beginner then iss program se door raho warna heart attack bhi aa sakta hai 🤣🤣🤣🤣😂😂
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException; // handles exceptions
import java.io.FileWriter; // writes into the files

public class login{
    // scanner to take input through keyboard
    Scanner k = new Scanner(System.in);
    
    // function to create a new account
    void createNewAccount(String email ,String password){
        // storing data into a text file 
        File myfile = new File("loginData.txt");
        try{
            //reading from that file to append another detail
            Scanner read = new Scanner(myfile);
            String lines="";
            String alltext = "";
            while(read.hasNextLine()){
                lines = read.nextLine();
                alltext += lines + "\n";
            }
            // making a string format of the new user email and password
            String newline = email + " " + password +"\n";
            // adding that into the previous account details
            alltext += newline;
            read.close(); // closing the read
            
            // filewriter to write into the file
            FileWriter filewriter = new FileWriter("loginData.txt");
            filewriter.write(alltext); // writing
            filewriter.close(); // closing the file
            System.out.println("Account created successfully ");
        }
        catch(IOException e){
            System.out.println("Account creation unsuccessful ");
        }
    }
    
    // function to check login details
    void checkLoginSystem(String email ,String password){
        File myfile = new File("loginData.txt");
        try{
            //reading from that file
            Scanner read = new Scanner(myfile);
            String line="";
            String checkLine = email + " " + password; // string format of the user entering email and password
            boolean accountfound = false; // true if account founds false if account does not found
            // reading from the file
            while(read.hasNextLine()){
                line = read.nextLine();
                //checking if the account is found of not 
                if(checkLine.equals(line)){
                    accountfound = true;
                }
            }
            // printing the login 
            if(accountfound){
                System.out.println("Login Successful");
            }
            else{
                System.out.println("No account found , Try creating a new account ");
            }
        }
        catch(IOException e){} // to handle any errors
    }
    void printInitialStatement(){
        System.out.println(" What do you want to do ? ");
        System.out.println(" 1. Create a new account ");
        System.out.println(" 2. Login to an existing account ");
    }
    void login(){
        printInitialStatement();
        // inputting the user entered email and password
        int choice = k.nextInt();
        System.out.println("Enter your email ");
        String email = k.next();
        System.out.println("Enter your password ");
        String password = k.next();
        // choice checking
        if(choice == 1){
            createNewAccount(email , password);
        }
        else if(choice == 2){
            checkLoginSystem(email , password);
        }
        else{
            System.out.println(" Not a valid choice ");
        }        
    }
    public static void main(){
        // running the main function
        login obj = new login();
        obj.login();
    }
}