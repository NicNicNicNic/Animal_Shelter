import java.util.Scanner;

/**
 * Handler Class -------------- Contains the ONLY main method in the entire
 * assignment.
 */
public class Handler {
	public static void main(String[] args) {
		ShelterManager sm = new ShelterManager();
		System.out.print("Enter the filename or use a relative path: ");
		Scanner scn = new Scanner(System.in);
		String fileName = scn.nextLine();
		sm.readAnimalsFromFile(fileName);
		sm.displayAllAnimals();
		scn.close();
	}
}
