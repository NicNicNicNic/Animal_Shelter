import java.io.*;

/**
 * ShelterManager Class --------------------- Handles: - File reading - Regex
 * validation - Creating Dog/Cat objects - Storing them in an array
 *
 * IMPORTANT: - NO COLLECTIONS FRAMEWORK - Use only the array provided below
 */
public class ShelterManager {
	private static final int MAX_ANIMALS = 100;
// Array to store Dog and Cat objects
	private Animal[] animals = new Animal[MAX_ANIMALS];
	private int animalCount = 0;
// Regex patterns for validation
	private static final String PHONE_REGEX = "^\\(\\d{3}\\)\\d{3}-\\d{3}$";
	private static final String DATE_REGEX = "^\\d{4}-\\d{2}-\\d{2}$";

	/**
	 * readAnimalsFromFile -------------------- Reads each line, validates fields,
	 * and creates Dog or Cat objects.
	 */
	public void readAnimalsFromFile(String filename) {
		File inputFile = new File(filename);

		if (!inputFile.exists()) {
			System.err.println("Input file not found: " + inputFile.getAbsolutePath());
			return;
		}

		try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
			String line;
			int lineNumber = 0;

			while ((line = br.readLine()) != null) {
				lineNumber++;
				line = line.trim();
				if (line.isEmpty())
					continue; // skip blank lines

				String[] fields = parseRecord(line);

				if (fields.length != 8) {
					System.err.println("Skipping line " + lineNumber + " (expected 8 fields): " + line);
					continue;
				}

				String type = fields[0].trim();
				String registrationNumber = fields[1].trim();
				String name = fields[2].trim();
				String dateOfBirth = fields[3].trim();
				String ownerPhone = fields[4].trim();
				String ownerName = fields[5].trim();
				String lastVaccination = fields[6].trim();
				String extraField = fields[7].trim(); // breed for Dog, favorite toy for Cat

				// Validate fields
				if (!dateOfBirth.matches(DATE_REGEX)) {
					System.err.println("Invalid date of birth on line " + lineNumber + ": " + line);
					continue;
				}
				if (!lastVaccination.matches(DATE_REGEX)) {
					System.err.println("Invalid last vaccination date on line " + lineNumber + ": " + line);
					continue;
				}
				if (!ownerPhone.matches(PHONE_REGEX)) {
					System.err.println("Invalid phone number on line " + lineNumber + ": " + line);
					continue;
				}

				Animal animal;

				if (type.equals("Dog")) {
					animal = new Dog(registrationNumber, name, dateOfBirth, ownerPhone, ownerName, lastVaccination,
							extraField);
				} else if (type.equals("Cat")) {
					animal = new Cat(registrationNumber, name, dateOfBirth, ownerPhone, ownerName, lastVaccination,
							extraField);
				} else {
					System.err.println("Unknown animal type on line " + lineNumber + ": " + line);
					continue;
				}

				if (animalCount < MAX_ANIMALS) {
					animals[animalCount++] = animal;
				} else {
					System.err.println("Shelter full! Cannot store more animals.");
					break;
				}
			}

		} catch (IOException e) {
			System.err.println("Error reading file: " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Error: exceeded array bounds while storing animals.");
		}
	}

	/**
	 * parseRecord ------------ Supports multiple delimiters: comma, vertical bar,
	 * semicolon.java.io. DO NOT MODIFY THIS METHOD.
	 */
	protected String[] parseRecord(String line) {
		if (line.contains(",")) {
			return line.split(",");
		} else if (line.contains("|")) {
			return line.split("\\|");
		} else if (line.contains(";")) {
			return line.split(";");
		} else {
			return new String[] {};
		}
	}

	// prints out all the animals info
	public void displayAllAnimals() {
		for (int i = 0; i < animalCount; i++) {
			System.out.println(animals[i].toString());
		}
	}
}
