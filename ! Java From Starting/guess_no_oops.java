import java.util.Scanner;
import java.util.Random;

class guesstheno {
    public int random;
    public int input;

    public guesstheno() {
        Random r = new Random();
        this.random = r.nextInt(100);
    }

    public void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        this.input = sc.nextInt();
    }

    public int getUserInput() {
        return input;
    }

    public int getRandom() {
        return random;
    }

    public void isCorrectNumber() {
        if (input < random) {
            System.out.println(" Enter higher number please ");
        } else if (input > random) {
            System.out.println(" Enter lower number please ");
        } else if (input == random) {
            System.out.println("\n");
        }
    }
}

public class guess_no_oops {
    public static void main(String[] args) {
        guesstheno ob = new guesstheno();
        // System.out.println(" The random number is " + ob.getRandom());
        System.out.println(" Enter the number to be guessed ");
        int score = 0;
        do {
            ob.takeUserInput();
            ob.isCorrectNumber();
            score++;
        } while (ob.random != ob.input);

        System.out.print(" You guessed it in " + score + " attempts");
    }
}
