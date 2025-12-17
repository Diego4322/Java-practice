import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int answer = 2;
        int guess;

        while (true) {
            System.out.print("Guess a number between 1 and 3: ");
            guess = input.nextInt();

            if (guess == answer) {
                System.out.println("Correct answer!");
                break;
            } else {
                System.out.println("Wrong answer, try again.");
            }
        }

        input.close();
    }
}
