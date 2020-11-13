/*

ROCK PAPER SCISSORS GAME :) 

Created by Armaan singh on 14th of November ;
It is a single player game where you have to play with the computer
Uses 2 packages Scanner package and random package 
rest all are condition matching 
Every single thing is explained by the comments given below 

Do join our discord server here -- https://discord.gg/3RJZxnE7QM
Git-hub profile link -- https://github.com/ArmaanTechDeveloper

Best of luck :)  :::: enjoy playing xD

*/

// packages import 
import java.util.*;
import java.util.Random;

//class making 
class rockpaperscissor {
    // main function
    public static void main(String[] args) {
        System.out.println();

        // package import to sc and r
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        // Inputting number of times you have to play
        System.out.println(" Enter the no of times you want to play this game ");
        int n = sc.nextInt();

        // Conditions has stated
        System.out.printf(" Game has started for %d times ....", n);
        int i;
        System.out.println(" Enter Your choice ");
        System.out.println();
        System.out.println(" 'R' for Rock , 'P' for Paper , 'S' for scissors ");
        int c = 0;
        int u = 0;

        for (i = 1; i <= n; i++) {

            int random = r.nextInt(3);

            char con = sc.next().charAt(0);
            char ch = Character.toLowerCase(con);
            if (ch == 'r' || ch == 'p' || ch == 's') {

                // if condition is rock then this condition runs
                if (ch == 'r') {
                    if (random == 0) {
                        System.out.println(" Tie ");
                    } else if (random == 1) {
                        System.out.println(" Computer wins ! Paper ");
                        c = c + 1;
                    } else if (random == 2) {
                        System.out.println(" User wins ! Scissor ");
                        u = u + 1;
                    }
                }
                // if user enters paper then this condition runs

                if (ch == 'p') {
                    if (random == 0) {
                        System.out.println(" User wins ! Rock  ");
                        u = u + 1;
                    } else if (random == 1) {
                        System.out.println(" Tie  ");

                    } else if (random == 2) {
                        System.out.println(" Computer Wins ! Scissor ");
                        c = c + 1;
                    }
                }
                // if user enters scissors then this condition runs

                if (ch == 's') {
                    if (random == 0) {
                        System.out.println(" Computer wins ! Rock ");
                        c = c + 1;
                    } else if (random == 1) {
                        System.out.println(" User wins ! Paper ");
                        u = u + 1;

                    } else if (random == 2) {
                        System.out.println(" Tie ");

                    }
                }
            } else {
                System.out.println(" Invalid Input ");
            }

        }
        System.out.println();
        // leader board evaluation

        System.out.println(" Leader board ");

        System.out.println();

        if (u > c) {
            System.out.println(" User wins by " + u + " points");
        }
        if (u < c) {
            System.out.println(" Computer wins by " + c + " points");
        }
        if (u == c) {
            System.out.println(" Nobody wins Tie ");
        }

        sc.close();
    }
}