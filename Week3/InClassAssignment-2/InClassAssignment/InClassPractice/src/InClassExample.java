import java.util.Scanner;


public class InClassExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salesCommission;
		double salesCommissionDouble;
		String firstName = "";
		String lastName = "";		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the new salesperson's name (all on one line)");
		firstName = keyboard.next();
		lastName = keyboard.next();
		String junk = keyboard.nextLine();
		
		
		SalesPerson newPerson = new SalesPerson(firstName,lastName);
		newPerson.print(newPerson);


		SalesPerson anotherPerson = new SalesPerson();
		anotherPerson.setFirstName("Walt");
		anotherPerson.setLastName("Disney");
		
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
