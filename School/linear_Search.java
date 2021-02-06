import java.util.Scanner;
public class linear_Search {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the size of the array ");
        int n = sc.nextInt();

        int [] arr = new int [n];
        for(int inp = 0 ; inp < arr.length ; inp ++){
            System.out.println(" Enter the "+(inp + 1)+" element of the array ");
            arr[inp] = sc.nextInt();
        }

        System.out.println(" Enter the number to be searched ");
        int key = sc.nextInt();

        // i am using a for each loop this loop cannot display the index number at which the key element is present
        // if we do not  want to display then this method is more fast and efficient
        boolean f = false;
        for(int element : arr){
            if(element == key) {
                System.out.println(" The number you entered is present in the array ");
                f = true;
            }
        }

        // if we wan to display the index number then we use the normal like like
        // For now i have commented out the code


//        for(int i = 0 ; i<arr.length ; i++){
//            if(arr[i] == key){
//                f= true;
//                System.out.println(" The number you entered is found in the array at position " +(i+1));
//            }
//        }
        if(f==false){
            System.out.println(" The number you entered is not present in the array ");
        }
        sc.close();
    }
}
