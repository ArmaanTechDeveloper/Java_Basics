import java.util.Scanner;
public class ArraySearch20 {
    Scanner sc = new Scanner(System.in);
    int N[] ;
    int l;
    void accept(int m){
        m = this.l;
        this.N = new int [l];
    }
    void readelements(){
        
        System.out.println("Enter the elements of the array ");
        for(int i = 0 ; i<N.length;i++){
            System.out.println("Enter the "+(i+1)+" element");
            N[i] = sc.nextInt();
        }
    }
    void search(int n){
        int f = 0;
        for(int i = 0 ; i<N.length;i++){
            if(n == N[i]){
                f++;
                System.out.println(" Found at "+ i +"th position");
            }
        }
        if(f == 0){
            System.out.println(" did not found the element");
        }
    }
    void display(){
        for(int element : N){
            System.out.print(element + " ,");
        }
    }
    public static void main(String[] args) {
        ArraySearch ob = new ArraySearch();
        ob.accept(5);
        ob.readelements();
        ob.search(4);
    }
}
