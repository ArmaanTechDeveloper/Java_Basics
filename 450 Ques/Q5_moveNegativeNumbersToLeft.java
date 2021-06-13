/*
Move all negative numbers to beginning and positive to end with 
constant extra space

Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
Output: -12 -13 -5 -7 -3 -6 11 6 5

*/
public class Q5_moveNegativeNumbersToLeft {
    public static void main(String[] args) {
        int inp[] = {-12 , 11 , -13 , -5 , 6 , -7 , 5 , -3 , -6};
        int out[] = new int [9];

        int index = 0;
        for(int element : inp){
            if(element < 0){
                out[index] = element;
                index ++;
            }
        }

        for(int element : inp){
            if(element >= 0){
                out[index] = element;
                index ++;
            }
        }

// printing the output array 
        for(int element : out){
            System.out.print(element + " , ");
        }
    }
}
