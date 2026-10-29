/**
 * Dog Class ---------- Inherits from Animal. Adds the field "breed".
 */
public class Dog extends Animal {
	private String breed;

//constructor
	public Dog(String registrationNumber, String name, String dateOfBirth, String ownerPhoneNumber, String ownerName,
			String lastVaccinationDate, String breed) {
		super(registrationNumber, name, dateOfBirth, ownerPhoneNumber, ownerName, lastVaccinationDate);
		this.breed = breed;
	}

//breed getter and setters
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	// overrides toString so that if it is a dog its breed will be printed as well
	@Override
	public String toString() {
		return ("Animal Details:\n" + "Registration Number: " + registrationNumber + "\nName: " + name
				+ "\nDate of Birth: " + dateOfBirth + "\nOwner's phone number: " + ownerPhoneNumber + "\nOwner's name: "
				+ ownerName + "\nLast Vaccination Date: " + lastVaccinationDate + "\nDog's Breed: " + breed);
	}
}