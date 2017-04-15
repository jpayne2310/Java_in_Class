public class SalesPerson {
	public String FirstName;
	public String LastName;
	
	//Default Constructor
	public SalesPerson() {
		String FirstName = "";
		String LastName = "";
	}
	
	public SalesPerson(String SaleFirstName, String SaleLastName) {
		String Firstname = SaleFirstName;
		String LastName = SaleLastName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	public void print(SalesPerson person)
	{
		System.out.print("The Name of the first Sales Person is: " + 
	this.getFirstName() + " " + this.getLastName());
	}
	
}
