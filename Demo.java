//imports
import java.util.Scanner;

public class Demo{
	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);

		Drinks choise = null;

		System.out.println("Enter '1' for coffee of '2' for tea.");

		String input = kb.nextLine();

		while(!(input.equals("1")) && !(input.equals("2"))){
			System.out.println("Please enter a valid choise");	

			input = kb.nextLine();
		}

		if (input.equals("1")){
			choise = new Coffee();
		} 
		if (input.equals("2")){
			choise = new Tea();
		}
		
		choise.make();
		choise.drink();

		kb.close();
		
	}	
}
