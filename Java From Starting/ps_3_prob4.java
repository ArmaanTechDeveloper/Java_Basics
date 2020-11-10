import java.util.*;

class ps_3_prob4{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        
        System.out.println(" Enter the string ");
        String str = sc.nextLine();

        int length = str.length();

        int i,c=0;
        for(i=0;i<length;i++){
            char ch = str.charAt(i);
            if(ch==' '){
                c=c+1;
            }
        }
        System.out.println(" The number of white space is : "+c);
        sc.close();
    }
}