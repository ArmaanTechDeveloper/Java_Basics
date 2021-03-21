import java.util.Scanner;

public class date_prob5_pro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input of the array 
        System.out.println("Enter the date ");
        int date = sc.nextInt();

        // Variable declaration ;
        int count = 0;
        int index = 0;
        int a[] = new int [3];

        // getting the date and storing below
        while(date>0){
            int cutDate = date %100;
            a[index] = cutDate;
            index ++;
            count ++;
            date = date/100;
        }
        int day = a[2] , month = a[1] , year = a[0];

        //storing done now checking 
        if(count == 3){
            // valid date 
            switch(month){
                case 1 :
                if(day >= 1 && day<=31){
                    System.out.println(day + " January " + year);
                }
                break;
                case 2 :
                if(year % 4 != 0){
                    if(day >= 1 && day<=28){
                        System.out.println(day + " February " + year);
                    }
                }
                else if(year % 4 == 0){
                    if(day >= 1 && day<=29){
                        System.out.println(day + " February " + year);
                    }
                }
                break;
                case 3 :
                if(day >= 1 && day<=31){
                    System.out.println(day + " March " + year);
                }
                break;
                case 4 :
                if(day >= 1 && day<=30){
                    System.out.println(day + " April " + year);
                }
                break;
                case 5 :
                if(day >= 1 && day<=31){
                    System.out.println(day + " May " + year);
                }
                break;
                case 6 :
                if(day >= 1 && day<=30){
                    System.out.println(day + " June " + year);
                }
                break;
                case 7 :
                if(day >= 1 && day<=31){
                    System.out.println(day + " July " + year);
                }
                break;
                case 8 :
                if(day >= 1 && day<=31){
                    System.out.println(day + " August " + year);
                }
                break;
                case 9 :
                if(day >= 1 && day<=30){
                    System.out.println(day + " September " + year);
                }
                break;
                case 10 :
                if(day >= 1 && day<=31){
                    System.out.println(day + " October " + year);
                }
                break;
                case 11 :
                if(day >= 1 && day<=30){
                    System.out.println(day + " November " + year);
                }
                break;
                case 12 :
                if(day >= 1 && day<=31){
                    System.out.println(day + " December " + year);
                }
                break;
                default :
                System.out.println(" Invalid date ");
            }
        }
    }
}