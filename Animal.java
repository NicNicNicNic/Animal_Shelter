/**
 * Animal Superclass ------------------ This class stores ALL shared fields for
 * Dog and Cat. Students MUST NOT create Animal objects directly. Dog and Cat
 * will inherit from this class.
 *
 * 
 * - Ensure fields are validated in the ShelterManager BEFORE constructor call
 */
public class Animal {
// Shared attributes for all animals
	protected String registrationNumber;
	protected String name;
	protected String dateOfBirth;
	protected String ownerPhoneNumber;
	protected String ownerName;
	protected String lastVaccinationDate;

	public Animal(String registrationNumber, String name, String dateOfBirth, String ownerPhoneNumber, String ownerName,
			String lastVaccinationDate) {
		setRegistrationNumber(registrationNumber);
		setName(name);
		setDateOfBirth(dateOfBirth);
		setOwnerPhoneNumber(ownerPhoneNumber);
		setOwnerName(ownerName);
		setLastVaccinationDate(lastVaccinationDate);
		;

	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public String getName() {
		return name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public String getOwnerPhoneNumber() {
		return ownerPhoneNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getLastVaccinationDate() {
		return lastVaccinationDate;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setOwnerPhoneNumber(String ownerPhoneNumber) {
		this.ownerPhoneNumber = ownerPhoneNumber;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setLastVaccinationDate(String lastVaccinationDate) {
		this.lastVaccinationDate = lastVaccinationDate;
	}

	@Override
	public String toString() {
		return ("Animal Details:\n" + "Registration Number: " + registrationNumber + "\nName: " + name
				+ "\nDate of Birth: " + dateOfBirth + "\nOwner's phone number: " + ownerPhoneNumber + "\nOwner's name: "
				+ ownerName + "\nLast Vaccination Date: " + lastVaccinationDate);
	}
}
