import java.util.Scanner;

public class HiLo {
    public static void main(String[] args){
        //Definitions
        Scanner scan = new Scanner(System.in);
        int ranNum = (int)(Math.random() * 100 + 1);
        int guess = 0;
        int numGuesses = 0;

        //Process
        while(guess != ranNum){
            System.out.println("Guess a number between 1 and 100:");
            guess = scan.nextInt();
            if(guess < ranNum){
                numGuesses += 1;
                System.out.println("Sorry, but that guess was too low.");
            } else if (guess > ranNum){
                numGuesses += 1;
                System.out.println("Sorry, but that guess was too high.");
            } else {
                numGuesses += 1;
                System.out.println("Congratulations! You win!");
                System.out.println("It took you " + numGuesses + " guesses!");
            }
        }
    }
}