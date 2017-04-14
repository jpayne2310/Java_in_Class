import java.util.*;
public class InClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the driving distance: ");
		float distance = input.nextFloat();
		
		System.out.print("Enter miles per gallon: ");
		float milesPerGallon = input.nextFloat();
		
		System.out.print("Enter price per gallon: ");
		float pricePerGallon = input.nextFloat();
		
		System.out.print("The cost of driving is $");
		float grandTotal = (distance/milesPerGallon) * pricePerGallon;
		
		System.out.print(grandTotal);
	}

}


