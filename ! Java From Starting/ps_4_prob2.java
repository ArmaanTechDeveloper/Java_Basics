import java.util.*;

class ps_4_prob2 {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the Maths marks ");
        int maths = sc.nextInt();

        System.out.println(" Enter your physics marks ");
        int phy = sc.nextInt();

        System.out.println(" Enter your chemistry marks ");
        int chem = sc.nextInt();

        System.out.println(" We have assumed the total marks are from 80 ....");

        double mathsp = (maths * 100) / 80;
        double phyp = (phy * 100) / 80;
        double chemp = (chem * 100) / 80;

        double total = maths + phy + chem;
        double percentage = (total * 100) / (80 * 3);
        if (mathsp > 33.33 && phyp > 33.33 && chemp > 33.33) {
            if (percentage > 40) {
                System.out.println(" You have passed ! ");
            }
        } else {
            System.out.println(" You have Failed ! ");
        }

        sc.close();
    }
}