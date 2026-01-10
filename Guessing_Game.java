import java.util.Scanner;

public class Guessing_Game{
    
    public static void guessingNumberGame()
    {
        Scanner sc = new Scanner(System.in);

        int number = 1 + (int)(100 * Math.random());
        
        int M = 7;

        System.out.println(
            "Guess a number between 1 to 100");
        System.out.println(
            "You have " + M
            + " attempts to guess the correct number. Can you guess it correctly. Try if you can!!!!");

        for (int i = 0; i < M; i++) {
            System.out.print("Whats your Guess?: ");
            int guess = sc.nextInt();

            if (guess == number) {
                System.out.println(
                    " Congratulations! You guessed the correct number. You really are smart");
                sc.close();
                
                return;
            }
            else if (guess < number) {
                System.out.println(
                    "You guessed a bit less, The number is greater than " + guess);
            }
            else {
                System.out.println(
                    "You guessed a bit high, The number is less than " + guess);
            }
        }

        System.out.println(
            "Ohh shit! you used all of you attempts, maybe try again. "
            + number);
        sc.close();
    }

    public static void main(String[] args)
    {
        guessingNumberGame();
    }
}