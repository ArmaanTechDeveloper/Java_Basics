/*

    Program to terminate the stack array accoding to condition given by the user
    Pop and push into the stack using methods

    
    Made by ArmaanTechDeveloper on 04-07-2021
    Github id : https://github.com/ArmaanTechDeveloper
    
    ******** Sample run at the end of the program ***************

*/


import java.util.Scanner;


public class stackop {
// Object to input in the class
    Scanner sc = new Scanner(System.in);
// Variable Declaration
    static int elementIntheArray;
    static int sp = -1;
    public int [] stack ;

//Method to initialize the array 
    void initialize(){
        stack = new int [elementIntheArray];
    }
// Method to push the item into the array 
    public void PushKaroItem(){
        sp = sp+1;
        System.out.print("Enter the element to be inserted in the array : ");
        int tempItem = sc.nextInt();
        stack[sp] = tempItem;
    }
// Method to Pop the item from the array 
    public void PopKaroItem(){
        int tempDump = stack[sp];
        stack[sp] = 0;
        System.out.println("Dumped the number "+tempDump);
        sp -= 1;
    }
// Method to print the array to Show user harkat going in the arrray
    public void PrintStack(){
        System.out.println("Array Updated .... ");
        for(int element : stack){
            System.out.println(element+ " ");
        }
    }
// Method to print the choice again and again 
    public void PrintChoice(){
        System.out.println("Enter your choice : 0 to push , 1 to pop" );
    }

// Main function starts here 
    public static void main(String[] args) {
// Scanner again declaration because it is a static method
        Scanner in = new Scanner(System.in);
// Creating object of the class
        stackop object = new stackop();
// Taking input the size of the stack
        System.out.println("Enter the element to be entered in the stack ");
        elementIntheArray = in.nextInt();
// Initializing the stack array
        object.initialize();
// .. stated while loop and checking
        while(sp<elementIntheArray){
            // condition to check max element reached or not 
            if((sp+1) == elementIntheArray){
                System.out.println("Maximum number of elements reached array ended.....");
                break;
            }
            // printing stack array everytime 
            object.PrintChoice();
            int choice = in.nextInt();
            
            // checking the choice and doing tasks accordingly
            if(choice == 0){
                object.PushKaroItem();
                object.PrintStack();
                
            }
            else if(choice == 1){
                object.PopKaroItem();
                object.PrintStack();
            }
            // invalid choice case exception checking
            else{
                System.out.println("Invalid choice");
                break;
            }
        }
        // closing the scanner of the main function
        in.close();
    }
}





/*

SAMPLE RUN : 
Enter the element to be entered in the stack 
3
Enter your choice : 0 to push , 1 to pop
0
Enter the element to be inserted in the array : 2
Array Updated .... 
2
0
0
Enter your choice : 0 to push , 1 to pop
0
Enter the element to be inserted in the array : 3
Array Updated ....
2
3
0
Enter your choice : 0 to push , 1 to pop
1
Dumped the number 3
Array Updated ....
2
0
0
Enter your choice : 0 to push , 1 to pop
0
Enter the element to be inserted in the array : 6
Array Updated ....
2
6
0
Enter your choice : 0 to push , 1 to pop
0
Enter the element to be inserted in the array : 5
Array Updated ....
2
6
5
Maximum number of elements reached array ended.....
*/