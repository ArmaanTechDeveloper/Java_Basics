import java.util.Scanner;
import java.util.Random;

class game {

    int number;
    int guessNumber;
    int score;

    game() {

        Random r = new Random();
        number = r.nextInt(100);
    }

    void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number ");
        guessNumber = sc.nextInt();
        System.out.println("Generated number is " + number);
    }

    boolean isCorrect() {
        if (number > guessNumber) {
            System.out.println(" Enter lower number please ");
        } else if (guessNumber > number) {
            System.out.println(" Enter higher number please");
        } else if (guessNumber == number) {
            System.out.println(" You guessed the number ");
            return true;
        }
        return false;
    }
}

public class guess_the_number {
    public static void main(String[] args) {
        game g = new game();

        boolean k = false;
        while (!k) {
            g.takeUserInput();
            k = g.isCorrect();
            System.out.println(k);
        }
    }
}