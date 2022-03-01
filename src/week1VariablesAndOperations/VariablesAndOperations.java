package week1VariablesAndOperations;

public class VariablesAndOperations {
	
	public static void main(String[] args) {
	
		//create a variable to hold the quantity of available plane seats left on a flight
		int totalseats = 50;
		int seatstaken = 30;
		int remainingseats = totalseats - seatstaken;
		
		//create a variable to hold the cost of groceries at checkout
		
		double totalCosts = 30;
		
		//create a variable to hold a person's middle initial
		
		char middleInitial = 'V';
		
		//create a variable to hold true if it's hot outside and false if it's cold outside
		
		boolean isHotOutside = false;
		
		//create a variable to hold a customer's first name
		
		String firstName = "Thomas";
		
		
		//create a variable to hold a street address
		
		String streetAddress = "177 Providence St."; 
		
		//print all variables to the console
		
		System.out.println("The number of remaining seats on the plane is: " + remainingseats);
		System.out.println("The total costs of the groceries is: " + totalCosts);
		System.out.println("The person's middle initial is: " + middleInitial);
		System.out.println("It is hot outside: " + isHotOutside);
		System.out.println("His first name is: " + firstName);
		System.out.println("The street address is: " + streetAddress);
		
		//a customer booked 2 plane seats, remove 2 seats from the available seats variable
		
		remainingseats = remainingseats - 2;
		
		//impulse candy bar purchase, add 2.15 to the grocery total
		
		totalCosts = totalCosts + 2.15;
		
		//birth certificate was printed incorrectly, change the middle initial to something else
		
		middleInitial = 'C';
		
		//the season has changed, update the hot outside variable to be opposite of what it was
		
		isHotOutside = true;
		
		//create a new variable called full name using the customer's first name, the middle initial, and a last name of your choice
		
		String fullName = firstName + " " + middleInitial + " Le";
		
		//print a line to the console that introduces the customer and say they live at address variable
		
		System.out.println("The customer's name is: " + fullName + " and they live at: " + streetAddress);
	}

}
