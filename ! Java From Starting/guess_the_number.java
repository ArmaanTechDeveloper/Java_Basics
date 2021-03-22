import java.util.Scanner;
import java.util.Random;

class guessgame {
    public int random;
    public int userinput;
    Scanner sc = new Scanner(System.in);

    guessgame() {
        Random r = new Random();
        random = r.nextInt(100);
    }

    public void enternumber() {
        System.out.println(" Enter Your choice ");
    }

    public void takeUserInput() {
        userinput = sc.nextInt();
    }

    public void checkInput() {
        if (userinput < 0 || userinput > 100) {
            System.out.println(" Invalid input ");
        }
    }

    public void checkgame() {
        if (userinput < random) {
            System.out.println(" Enter a higher number !");
        } else if (userinput > random) {
            System.out.println(" Enter a lower number ! ");
        } else {
            System.out.println(" Your guessed the number ");
        }

    }

    public void rules() {
        System.out.println("\n\n Welcome to guess the number game !");
        System.out.println(" You have to guess the number according to the computers hint ");
        System.out.println(" press 's' to start :) ");
    }

    public boolean checks() {
        char c = sc.next().charAt(0);
        if (c == 's') {
            return true;
        } else {
            return false;
        }
    }

}

public class guess_the_number {
    public static void main(String[] args) {
        
        guessgame game = new guessgame();
        game.rules();
        boolean k= game.checks();
        int score = 0;
        
        if(k){
            game.enternumber();
            do{
                game.takeUserInput();
                game.checkInput();
                game.checkgame();
                score++;
            }
            while(game.userinput != game.random);
        }
        else if(k == false) 
        {
            System.out.println(" Your are not ready to start the game ! ");
        }
        System.out.println(" You gussed it in "+score+" attempts");
    }
}