import java.util.ArrayList;
import java.util.Scanner;

public class MovieListApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cont = "y";

		System.out.println("Welcome to the Movie List Application!");
		System.out.println();
		System.out.println("There are 10 movies in this list.");
		System.out.println("Categories: \n(1)Animated \n(2)Drama \n(3)Sci-Fi \n(4)Horror \n ");

		ArrayList<String> animated = new ArrayList<>();
		animated.add("The Lion King (1994)");
		animated.add("Toy Story (1995)");
		animated.add("Big Hero 6 (2014)");

		ArrayList<String> drama = new ArrayList<>();
		drama.add("The Color Purple (1985)");
		drama.add("Forrest Gump (1994)");

		ArrayList<String> scifi = new ArrayList<>();
		scifi.add("2001: A Space Odyssey (1968)");
		scifi.add("Star Wars (1977)");

		ArrayList<String> horror = new ArrayList<>();
		horror.add("Insidious (2010)");
		horror.add("The Conjuring (2013)");

		do {
			System.out.println("Which category are you interested in? Enter a number between 1 and 4: ");
			String userCategory = scan.nextLine();
			
			switch (userCategory) {
			case "1":
				System.out.println("Animated: " +animated);
				break;
			case "2":
				System.out.println("Drama: " + drama);
				break;
			case "3":
				System.out.println("Sci-Fi: " +scifi);
				break;
			case "4":
				System.out.println("Horror: " + horror);
				break;
			default:
				System.out.println("Please enter a valid category!");
			}

			System.out.println("Continue? (y/n)");
			cont = scan.nextLine();
		} while (cont.equalsIgnoreCase("y"));

		System.out.println("Goodbye!");
		scan.close();
	}

}
