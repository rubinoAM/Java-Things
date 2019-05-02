import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args){
        //Blanks
        String sillyName = "";
        String unrealisticProfession = "";
        String country = "";
        String sillyNameTwo = "";
        String color = "";
        String adjective = "";
        String adverb = "";
        String sillyNameThree = "";
        String sillyNameFour = "";
        String facialFeature = "";
        String usCity = "";
        String sillyNameFive = "";
        String verb = "";
        String noun = "";
        String formerGreatActor = "";
        String nounTwo = "";

        //Other Definitions
        Scanner scan = new Scanner(System.in);
        String playAgain = "";

        //Game
        do {
            //Fill in Blanks
            System.out.println("Please enter a silly name.");
            sillyName = scan.nextLine();

            System.out.println("Please enter an unrealistic profession.");
            unrealisticProfession = scan.nextLine();

            System.out.println("Please enter a country.");
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
            System.out.println("Press enter to begin.");
            try{
                System.in.read();
            } catch(Exception e){
                e.printStackTrace();
            }

            System.out.println("Meet our hero " + sillyName + ", a super-intelligent " + unrealisticProfession + ".");
            System.out.println("A run-in with the " + country + " military leads him to create his alter-ego " + sillyNameTwo + ", a " + color + " " + adjective + " giant capable of great destruction.");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("In the final reel, " + formerGreatActor + " appears to propose joining him in a " + noun + ".");
            System.out.println("THE END");


        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Thanks for playing! Catch ya later!");
        scan.close();
    }
}
