import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args){
        //Blanks
        Scanner sillyName = new Scanner(System.in);
        Scanner unrealisticProfession = new Scanner(System.in);
        Scanner country = new Scanner(System.in);
        Scanner sillyNameTwo = new Scanner(System.in);
        Scanner color = new Scanner(System.in);
        Scanner adjective = new Scanner(System.in);
        Scanner adverb = new Scanner(System.in);
        Scanner sillyNameThree = new Scanner(System.in);
        Scanner sillyNameFour = new Scanner(System.in);
        Scanner facialFeature = new Scanner(System.in);
        Scanner usCity = new Scanner(System.in);
        Scanner sillyNameFive = new Scanner(System.in);
        Scanner verb = new Scanner(System.in);
        Scanner noun = new Scanner(System.in);
        Scanner formerGreatActor = new Scanner(System.in);
        Scanner nounTwo = new Scanner(System.in);

        //Other Definitions
        String playAgain = "";

        //Game
        do {
            //Fill in Blanks
            System.out.println("Please enter a silly name.");
            sillyName = scan.nextLine();

            System.out.println("Please enter an unrealistic profession.");
            unrealisticProfession = scan.nextLine();

            System.out.println("Please enter a silly name.");
            country = scan.nextLine();

            System.out.println("Please enter a second silly name.");
            sillyNameTwo = scan.nextLine();

            System.out.println("Please enter a color.");
            color = scan.nextLine();

            System.out.println("Please enter an adjective.");
            adjective = scan.nextLine();

            System.out.println("Please enter an adverb.");
            adverb = scan.nextLine();

            System.out.println("Please enter a third silly name.");
            sillyNameThree = scan.nextLine();

            System.out.println("Please enter a fourth silly name.");
            sillyNameFour = scan.nextLine();

            System.out.println("Please enter a facial feature.");
            facialFeature = scan.nextLine();

            System.out.println("Please enter a U.S. city.");
            usCity = scan.nextLine();

            System.out.println("Please enter a fifth silly name.");
            sillyNameFive = scan.nextLine();

            System.out.println("Please enter a verb.");
            verb = scan.nextLine();

            System.out.println("Please enter a noun.");
            noun = scan.nextLine();

            System.out.println("Please enter a formerly badass actor now selling out.");
            formerGreatActor = scan.nextLine();

            System.out.println("Please enter another noun.");
            nounTwo = scan.nextLine();

            //Story Time
            System.out.println("We've got everything we need. It's time for the show!");
        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Thanks for playing! Catch ya later!");
        scan.close();
    }
}
