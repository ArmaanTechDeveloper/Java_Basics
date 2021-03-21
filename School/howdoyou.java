import java.util.Scanner;

public class howdoyou {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println(" Enter the word / sentence ");
        String word = sc.nextLine();
        int length = word.length();
        int index = 0 , arraylength = 0;
        char check = word.charAt(length - 1);
        for(int j = 0 ; j<word.length();j++){
            char c = word.charAt(j);
            if(c == ' '){
                arraylength ++;
            }
        }
        int s[] = new int [arraylength + 1];
        String w[] = new String [arraylength + 1];

        // checking starting here
        if(check == '.' || check =='?'||check == '!'){
            word = word.replace(".","");word = word.replace("?","");word = word.replace("!","");word = word.replace("#","");
            for(String element : word.split(" ")){
                int count = 0;
                w[index] = element;
                for(int i = 0 ; i < element.length();i++){
                    char ch = element.charAt(i);
                    count = count + (int) ch;
                }
                s[index] = count;
                
                index ++;
                System.out.println(element + " - "+count);
            }
            // storing in the array completed
            // sorting the array
            int i, j;
            for (i = 0; i < s.length - 1; i++) {
                for (j = 0; j < s.length - 1 - i; j++) {
                    if (s[j + 1] < s[j]) {
                        int temp = s[j + 1];
                        s[j + 1] = s[j];
                        s[j] = temp;
                    }
                }
            }
            // checking and printing 
            
            for(int m = 0 ; m < s.length ; m++){
                int found = 0;
                for(int n = 0 ; n < w.length ; n++){
                    int count2 = 0;
                    for(int k = 0 ; k<w[n].length();k++){
                    char ch = w[n].charAt(k);
                    count2 = count2 + (int) ch;
                    }
                    if(count2 == s[m]){
                        found ++;
                        if(found == 1){
                            System.out.print(w[n] + " ");
                        }
                    }
                }
                
            }
        }
        else{
            System.out.println(" Invalid input ");
        }
    }
}
