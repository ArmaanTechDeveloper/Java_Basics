package ArithmeticExp;
/*

    Program to Convert the postfix Expression into infix Expression
    Pop and push into the stack 


    Contains a method called 'postfixToinfix' which takes an argument of string
    How to use ??
    -->  First import the package to evaluate by this : 
    import ArithmeticExp.*;
    --> Second take an input from the user in string format using scanner class
    --> Third use the method and pass the inputted string into it and get the answer
    
    Made by ArmaanTechDeveloper on 04-07-2021
    Github id : https://github.com/ArmaanTechDeveloper
    
    ******** Sample run at the end of the program ***************

*/

// Class declaration
public class postToinfix {
    // postfixToinfix method to calculate the Arithmetic Expression takes a String argument
    public void postfixToinfix(String word){
        // length of the Expression 
        int len = word.length();
        //stack declaration
        String [] stack = new String [len];
        String store; // store string to temporarily store the string 
        char ch; // char to check the operator and operand
        int sp = -1; // stack pointer

// Variables declaration ends

        for (int i = 0; i < len; i++) {
            // storing each letter in ch
            ch = word.charAt(i);
            //checking of operand and operator
            if(ch == '*'    || ch == '+'    || ch == '/' || ch == '-'){
                char opertor = ch;
                try{

                    // just pop out evalute and again push into stack
                    sp -= 1;
                    store = stack[sp] + Character.toString(opertor)+ stack[sp+1];
                    stack[sp] = "";
                    stack[sp+1] = "";
                    stack[sp] = store;
                }
                // catch block to handle the index out of bound Exception
                catch(IndexOutOfBoundsException e){
                    // if invalid arithmetic Expression prints to the user
                    System.out.println(" Invalid Arithmetic expression ");
                    break;
                }

            }
            else{
                // checking and pushing operand
                sp += 1;
                stack[sp] = Character.toString(ch);
            }
        }
        // Giving a delay of 4 sec

        int delay = 4;
        System.out.println(" Evaluating the Final Expression please wait ..... ");
        try{
            Thread.sleep(delay * 1000);
        }
        catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
        // printing the stack
        for(String element : stack){
            if(element != null){
                System.out.print(element);
            }
        }

	

    }
        public static void main(String[] args) {
            
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        postToinfix obj = new postToinfix();
        obj.postfixToinfix(s);
        
    }
}
