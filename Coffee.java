/*
 * The Coffee class implements the Drink interface. The user can "make" and "drink"
 * coffee.
 *
 * @author Nate Gorham
 * @date 1/27/2023
 */

public class Coffee implements Drinks
{
	@Override
	/*
 	 * Makes coffee
	 */
	public void make()
	{
		System.out.println("Coffee grounds go into the coffee maker...");
		System.out.println("Fill coffee maker with water...");
		System.out.println("Coffee make drips...");
		System.out.println("Ding! all done!");
	}

	@Override
	/*
 	 * Drinks coffee
	 */
	public void drink()
        {
                System.out.println("Drinks coffee...");
		System.out.println("Yum!");
        }

}

