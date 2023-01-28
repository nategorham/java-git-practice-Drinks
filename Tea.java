/*
 * The Tea class implements the Drink interface. The user can "make" and "drink"
 * tea.
 *
 * @author Nate Gorham
 * @date 1/27/2023
 */

public class Tea implements Drinks
{
        @Override
        /*
         * Makes tea
         */
        public void make()
        {
                System.out.println("Water goes into kettle...");
                System.out.println("The kettle...");
                System.out.println("Water is poured over a tea bag in a mug...");
                System.out.println("All done!");
        }

        @Override
        /*
 	 * Drinks coffee
         */
        public void drink()
        {
                System.out.println("Drinks tea...");
                System.out.println("Yum!");
        }

}

