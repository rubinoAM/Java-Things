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
        Boolean playing = true;

        //Game
        do {
            while(playing){

                //Fill in Blanks
                System.out.println("Please enter a silly name.");
                sillyName = scan.next();

                System.out.println("Please enter an unrealistic profession.");
                unrealisticProfession = scan.next();

                System.out.println("Please enter a country.");
                country = scan.next();

                System.out.println("Please enter a second silly name.");
                sillyNameTwo = scan.next();

                System.out.println("Please enter a color.");
                color = scan.next();

                System.out.println("Please enter an adjective.");
                adjective = scan.next();

                System.out.println("Please enter an adverb.");
                adverb = scan.next();

                System.out.println("Please enter a third silly name.");
                sillyNameThree = scan.next();

                System.out.println("Please enter a fourth silly name.");
                sillyNameFour = scan.next();

                System.out.println("Please enter a facial feature.");
                facialFeature = scan.next();

                System.out.println("Please enter a U.S. city.");
                usCity = scan.next();

                System.out.println("Please enter a fifth silly name.");
                sillyNameFive = scan.next();

                System.out.println("Please enter a verb.");
                verb = scan.next();

                System.out.println("Please enter a noun.");
                noun = scan.next();

                System.out.println("Please enter a formerly badass actor now selling out.");
                formerGreatActor = scan.next();

                System.out.println("Please enter another noun.");
                nounTwo = scan.next();

                //Story Time
                System.out.println("We've got everything we need. It's time for the show!");
                System.out.println("[Press enter to begin.]");
                try{
                    System.in.read();
                } catch(Exception e){
                    e.printStackTrace();
                }

                System.out.println("GENERIC COMIC SUPERHERO MOVIE");
                System.out.println("[Press enter again to continue after each new line.]");
                try{
                    System.in.read();
                } catch(Exception e){
                    e.printStackTrace();
                }

                System.out.println("Meet our hero " + sillyName + ", a super-intelligent " + unrealisticProfession + ".");
                try{
                    System.in.read();
                } catch(Exception e){
                    e.printStackTrace();
                }

                System.out.println("A run-in with the " + country + " military leads him to create his alter-ego " + sillyNameTwo + ", a " + color + " " + adjective + " giant capable of great destruction.");
                try{
                    System.in.read();
                } catch(Exception e){
                    e.printStackTrace();
                }

                System.out.println("He " + adverb + " battles the military with his girlfriend " + sillyNameThree + ".");
                try{
                    System.in.read();
                } catch(Exception e){
                    e.printStackTrace();
                }

                System.out.println("Eventually it is discovered that our hero's long-time colleague " + sillyNameFour + ", distinguished by his " + facialFeature + ", is trying to turn " + sillyNameTwo + " into a weapon, leading to a climactic (albeit pointless) battle in downtown " + usCity + " with an evil version of the same giant alter-ego called " + sillyNameFive + ".");
                try{
                    System.in.read();
                } catch(Exception e){
                    e.printStackTrace();
                }

                System.out.println("Eventually the enemy is subdued by " + verb + "ing him with a " + noun + ".");
                try{
                    System.in.read();
                } catch(Exception e){
                    e.printStackTrace();
                }

                System.out.println("In the final reel, " + formerGreatActor + " appears to propose joining him in a " + nounTwo + ".");
                try{
                    System.in.read();
                } catch(Exception e){
                    e.printStackTrace();
                }

                System.out.println("THE END");
                try{
                    System.in.read();
                } catch(Exception e){
                    e.printStackTrace();
                }
                playing = false;
            }
            System.out.println("Would you like to play again (y/n)?");
            playAgain = scan.next();
        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Thanks for playing! Catch ya later!");
        scan.close();
    }
}
