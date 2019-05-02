import java.util.Scanner;

public class HiLo {
    public static void main(String[] args){
        //Definitions
        Scanner scan = new Scanner(System.in);
        String playAgain = "";
        do{
            int ranNum = (int)(Math.random() * 100 + 1);
            int guess = 0;
            int numGuesses = 0;

            //Guessing Logic
            while(guess != ranNum){
                System.out.println("Guess a number between 1 and 100:");
                guess = scan.nextInt();
                if(guess < ranNum){
                    numGuesses += 1;
                    System.out.println("Sorry, but " + guess + " is too low.");
                } else if (guess > ranNum){
                    numGuesses += 1;
                    System.out.println("Sorry, but " + guess + " is  too high.");
                } else {
                    numGuesses += 1;
                    System.out.println(guess + " is correct!");
                    System.out.println("Congratulations! You win!");
                    System.out.println("It took you " + numGuesses + " guesses!");
                }
            }

            //Replay Logic
            System.out.println("Would you like to play again (y/n)?");
            playAgain = scan.next();
        } while (playAgain.equalsIgnoreCase("y"));

        //End Game Comment
        System.out.println("Thanks for playing! Have a good one!");
        scan.close();
    }
}