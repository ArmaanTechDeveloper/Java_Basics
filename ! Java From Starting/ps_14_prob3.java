import java.util.Scanner;


public class ps_14_prob3 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        boolean check = true;
        int arr[] = new int [3];
        arr[0] = 20;
        arr[1] = 10;
        arr[2] = 40;


        int maxtry = 0;
        while(check){
                try{
                    while(maxtry < 3){
                        try{
                            System.out.println("Enter the value of index");
                            int index = sc.nextInt();
                            System.out.println("The number your accessed is "+arr[index]);
                        }
                        catch(ArrayIndexOutOfBoundsException e){
                            System.out.println("Try again " + " Tries left ="+(3-maxtry));
                            maxtry ++;
                        }
                }
            }
            catch(Exception e){
                if(maxtry == 3){
                    System.out.println("bye ");
                }
                check = false;
                System.out.println(" Invalid index");;
            }

        }

        sc.close();
    }
}
