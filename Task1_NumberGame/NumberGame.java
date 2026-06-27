import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char playAgain = 'Y';
        int roundswon = 0;

        while(playAgain == 'y' || playAgain == 'Y') {
            int number = random.nextInt(100)+1;
            int attempts = 10;
            boolean guessed = false;

            System.out.println("\n==========NUMBER GUESSING GAME==========");

            int i = 1;
            while(i<=attempts) {
                System.out.println("Attempt - "+i);
                System.out.print("Enter Your Guess:");
                int guess = scanner.nextInt();

                if(guess == number) {
                    System.out.println("CONGRATULATIONS!! You guessed the correct number");
                    guessed=true;
                    roundswon++;
                    break;
                } else if(guess>number) {
                    System.out.println("Too High");
                } else {
                    System.out.println("Too low");
                }


                if(i == 5) {
                    System.out.println("WARNING! You have used 5 attempts. Only 5 attempts left!");
                }

                if(i == 8) {
                    System.out.println("WARNING! Only 2 attempts remaining!");
                }

                if(i == 9) {
                    System.out.println("LAST CHANCE! Final attempt is coming up!");
                }

                i++;
            }

            if(!guessed) {
                System.out.println("You have used All your attempts");
                System.out.println("The correct number was:"+number);
            }

            System.out.println("Rounds won:"+roundswon);
            
            System.out.print("Do you want to play again?(Y/N):");
            playAgain = scanner.next().charAt(0);
        }

        System.out.println("Game Over!");
        scanner.close();
        
    }
}
