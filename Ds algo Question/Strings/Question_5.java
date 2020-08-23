import java.util.*;

class question_5{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        
        System.out.println(" Enter the 1st string ");
        String s = sc.next();

        System.out.println(" Enter the 2nd string ");
        String w = sc.next();

        char a[] = new char[10];
        char b[] = new char[10];

        for(int k = 0;k<s.length();k++){
            char ch = s.charAt(k);
            a[k] = ch;
        }
        for(int p = 0;p<w.length();p++){
            char ch = w.charAt(p);
            b[p] = ch;
        }

        char temp;
        for(int i = 0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i] < a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for(int i = 0;i<b.length-1;i++){
            for(int j=i+1;j<b.length;j++){
                if(b[i] < b[j]){
                    temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }

        // for(char element : a){
        //     System.out.println(element);
        // }
        // for(char element2 : a){
        //     System.out.println(element2);
        // }

        String c1 = new String(a);
        System.out.println(c1);
        String c2 = new String(b);
        System.out.println(c2);

        if(c1.equals(c2)){
            System.out.println(" Anagram word");
        }
        else{
            System.out.println(" Not an anagram word");
        }
        sc.close();
    }
}