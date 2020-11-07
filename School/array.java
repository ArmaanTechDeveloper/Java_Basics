import java.util.*;

class array1{
    int N[],l,c;
    Scanner sc = new Scanner (System.in);
    void accept(int m){
        l=m;
        N=new int[l];
    }
    void readelements(){
        System.out.println(" Enter "+l+" Elements");
        for(int i = 0;i<l;i++){
            N[i] = sc.nextInt();
        }
    }
    void search(int n){
        int i;
        for(i=0;i<N.length;i++){
            if(n==N[i]){
                c=i;
            }
        }
        if(c>1){
            System.out.println(c);

        }
        else{
            System.out.println(" Element not found");
        }
    }
    void display(){
        for(int element : N){
            System.out.print(element);
        }
    }
}