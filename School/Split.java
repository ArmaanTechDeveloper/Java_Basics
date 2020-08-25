import java.util.*;

class Subtext {
    public static void text(String s){
        String s = s.toLowerCase();
        String a[] = s.split(" ");
        int i ,j,c=0;
        for(i=0 ; i<a.length;i++){
            for(j = i+1 ;j<a.length;k++){
                if(a[i].equals(a[j]){
                    c=c+1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the string ");
        String s = sc.nextLine();
        System.out.println(text(s));
    }

}