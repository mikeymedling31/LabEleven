import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieApp {

	static boolean flag = true;
	static List<Movie> movieList = new ArrayList<>();
	static int userEnt;

	public static void main(String[] args) {
		boolean restarted = false;
		System.out.println("Welcome to the Movie List Application!\n\nThere are 10 movies in this list.");

		String[] categories = new String[4];
		categories[0] = "Horror";
		categories[1] = "Scifi";
		categories[2] = "Comedy";
		categories[3] = "Animated";

		movieList.add(new Movie("The Grudge", "Horror"));
		movieList.add(new Movie("Ghost Stories", "Horror"));
		movieList.add(new Movie("Snatchers", "Horror"));
		movieList.add(new Movie("Star Wars", "Scifi"));
		movieList.add(new Movie("Star Wars 2", "Scifi"));
		movieList.add(new Movie("Star Wars 3", "Scifi"));
		movieList.add(new Movie("The Photograph", "Drama"));
		movieList.add(new Movie("Miss JuneTeenth", "Drama"));
		movieList.add(new Movie("She Dies Tomorrow", "Drama"));
		movieList.add(new Movie("Shrek", "Animated"));
		
		do {
			System.out.println("What categorty are you interested in?");
			// System.out.println("1: Horror\n2: Sci-Fi\n3: Comedy\n4: Animated");
			flag = true;
			while (flag) {
				userInput();
				selection(userEnt, movieList);
				
			}
			restarted = start("N");
		}while(restarted);
		
	}

	public static boolean start(String n) {
		Scanner input = new Scanner(System.in);
		System.out.println("Do you want to try again?(Y/N)");
		String restart = (input.nextLine());
		boolean result = false;
		if (restart.equalsIgnoreCase("Y")) {
			result = true;
		}else {
			System.out.println("GoodBye!");
		}
		return result;
	}
	
	public static void userInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("1: Horror\n2: Sci-Fi\n3: Comedy\n4: Animated");
		userEnt = input.nextInt();
	}

	public static void selection(int userEnt, List<Movie> Movie) {
		if (userEnt == 1) {
			for (Movie movies : movieList) {
				if (movies.getCategory().equals("Horror")) {
					System.out.println(movies.getTitle());
				}
			}
			flag = false;
		} else if (userEnt == 2) {
			for (Movie movies : movieList) {
				if (movies.getCategory().equals("Sci-Fi")) {
					System.out.println(movies.getTitle());
				}
			}
			flag = false;
		} else if (userEnt == 3) {
			for (Movie movies : movieList) {
				if (movies.getCategory().equals("Comedy")) {
					System.out.println(movies.getTitle());
				}
			}
			flag = false;
		} else if (userEnt == 4) {
			for (Movie movies : movieList) {
				if (movies.getCategory().equals("Animated")) {
					System.out.println(movies.getTitle());
				}
			}
			flag = false;
		} else {
			System.out.println("Entery was invalid please try again.");

		}

	}
}
