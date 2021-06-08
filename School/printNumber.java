public class printNumber{
    void recurPrint(int n){
        if(n != 0){
            System.out.println(n);
            recurPrint(n-1);
        }
    }
    public static void main(String[] args) {
        printNumber ob = new printNumber();
        ob.recurPrint(4);
    }
}

//Write a program to input a number n and print it to 1