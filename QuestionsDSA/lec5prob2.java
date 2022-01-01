public class lec5prob2 {

    /* 
    
    print the pattern 
        ***** ----> column
        *   *
        *   *
        *****
        
    */
    public static void main(String[] args) {
        int nr = 4;
        int nc = 5;

        for (int i = 1 ; i <= nr; i++) {
            for(int j = 1 ; j <= nc ; j++){
                if(i==1 || i==nr || j==1 || j==nc){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
