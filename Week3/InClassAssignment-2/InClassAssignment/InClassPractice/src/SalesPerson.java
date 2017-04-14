
public class SalesPerson {

	
	public String FirstName;
	public String LastName;

	
	public SalesPerson(){
		FirstName = "";
		LastName = "";

	}
	
	public SalesPerson(String SalesFirstName,String SalesLastName){
		FirstName = SalesFirstName;
		LastName = SalesLastName;

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
	
	public boolean equals(SalesPerson target){
		if (this.FirstName.equals(target.FirstName) &&
				(this.LastName.equals(target.LastName)))
				return true;
		else
				return false;
	}
	
	public void print(SalesPerson person){
		System.out.println("The first name of the person is: " + this.getFirstName());
		System.out.println("The last name of the person is: " + this.getLastName());
	}
	
	public float calculateCommission(float commissionRate, int salesAmount){
		return commissionRate * salesAmount;
	}

	
	
	public float calculateCommission(float commissionRate, float salesAmount){
		return commissionRate * salesAmount;
	}
	
	static public double calculateCommission(float commissionRate, double salesAmount){
		return commissionRate * salesAmount;
	}
	
}