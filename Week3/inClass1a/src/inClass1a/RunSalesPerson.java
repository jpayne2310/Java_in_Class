import java.util.*;

public class RunSalesPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard= new Scanner(System.in);
		
		System.out.print("Please enter salesperson\'s first name: ");
		String firstName = keyboard.nextLine();
		System.out.print("Please enter salesperson\'s last name: ");
		String lastName = keyboard.nextLine();
		
		SalesPerson SalesPerson1 = new SalesPerson(firstName,lastName);
		
		SalesPerson SalesPerson2 = new SalesPerson();
		SalesPerson2.setFirstName("Robert");
		SalesPerson2.setLastName("Stack");
		
		SalesPerson1.print(SalesPerson1);
		

	}

}
