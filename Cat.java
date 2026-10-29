/**
 * Cat Class ---------- Inherits from Animal. Adds the field "favoriteToy".
 */
public class Cat extends Animal {
	private String favoriteToy;

//constructor
	public Cat(String registrationNumber, String name, String dateOfBirth, String ownerPhoneNumber, String ownerName,
			String lastVaccinationDate, String favoriteToy) {
		super(registrationNumber, name, dateOfBirth, ownerPhoneNumber, ownerName, lastVaccinationDate);
		this.favoriteToy = favoriteToy;
	}

//getters and setters for favoriteToy
	public String getFavoriteToy() {
		return favoriteToy;
	}

	public void setFavoriteToy(String favoriteToy) {
		this.favoriteToy = favoriteToy;
	}

//overrides toString so that if it is a cat its favorite toy will be printed as well
	@Override
	public String toString() {
		return ("Animal Details:\n" + "Registration Number: " + registrationNumber + "\nName: " + name
				+ "\nDate of Birth: " + dateOfBirth + "\nOwner's phone number: " + ownerPhoneNumber + "\nOwner's name: "
				+ ownerName + "\nLast Vaccination Date: " + lastVaccinationDate + "\nCat's favorite toy: "
				+ favoriteToy);
	}

}
