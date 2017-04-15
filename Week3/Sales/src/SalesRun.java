import java.util.Scanner;
public class SalesRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		String firstName = "";
		String lastName = "";
		String space = "\n";
		float salesCommission;
		double salesCommissionDouble;
		 
		
		System.out.print("Enter the first name of the Salesperon: ");
		firstName = keyboard.nextLine();
		System.out.print("Enter the last name of the Salesperon: ");
		lastName = keyboard.nextLine();
		
		SalesPerson newPerson = new SalesPerson(firstName, lastName);
		newPerson.print();
		
		System.out.print(space);
		
		SalesPerson anotherPerson = new SalesPerson();
		anotherPerson.setFirstName("Robert");
		anotherPerson.setLastName("Stack");
		anotherPerson.print();
		
		System.out.print(space);
		
		if (newPerson.equals(anotherPerson))
		{
			System.out.println("The two people are equal");
		}
		else
		{
			System.out.println("The two people are not equal");
		}
	
	
	salesCommission = newPerson.calculateCommission(0.5f, 100);
	System.out.println("The sales commission is " + salesCommission);

	salesCommission = newPerson.calculateCommission(0.5f, 100.5f);
	System.out.println("The sales commission is " + salesCommission);
	
	salesCommissionDouble = SalesPerson.calculateCommission(0.5f, 100.5);
	System.out.println("The sales commission is " + salesCommission);

	
	}
}
