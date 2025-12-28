package javaCourse;
import java.util.Scanner;

public class MadLibsGame {
	static void showBaseStory() {
		System.out.println("This is the base story\n");
		System.out.println("One day, a (adjective) (noun) (verb – past tense) (adverb) through the (adjective) streets of (place).\r\n"
				+ "\r\n"
				+ "Suddenly, a group of (noun – plural) appeared and began to (verb) loudly.\r\n"
				+ "\r\n"
				+ "Everyone felt (emotion), but then someone shouted,\r\n"
				+ "“(silly word)!”\r\n"
				+ "\r\n"
				+ "From that moment on, nothing was ever the same.");
		
	}
	static void playMadLibs(Scanner scanner) {
		System.out.print("Enter an adjective: ");
		String adjective = scanner.nextLine();
		System.out.print("Enter a noun: ");
		String noun = scanner.nextLine();
		System.out.print("Enter an past tense verb: ");
		String pastVerb = scanner.nextLine();
		System.out.print("Enter an adverb: ");
		String adverb = scanner.nextLine();
		System.out.print("Enter a place: ");
		String place = scanner.nextLine();
		System.out.print("Enter an emotion: ");
		String emotion = scanner.nextLine();
		System.out.print("Enter a silly word: ");
		String sillyWord = scanner.nextLine();
		
		System.out.println("Your epic madlibs story is \n ");
		 System.out.println(
		            "One day, a " + adjective + " " + noun + " " + pastVerb + " " + adverb +
		            " through the " + place + "."
		        );

		        System.out.println(
		            "Everyone felt " + emotion +
		            ", but suddenly someone shouted \"" + sillyWord + "!\""
		        );
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lets play the mad lib game!!");
		System.out.println("Choose an option:");
        System.out.println("1. Read the base story first");
        System.out.println("2. Give the words and play");

        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); 
        switch(choice) {
        case 1:
        	showBaseStory();
        	System.out.println("Now let's enter the words \n");
        	playMadLibs(scanner);
        	break;
        case 2:
        	playMadLibs(scanner);
        	break;
        default:
        	System.out.println("Invalid Choice,Please restart");
        	
        		
        }
		


	}

}
