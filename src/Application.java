/**
 * @author Joshua Domzalski
 * Data Structures
 * Fall 2022
 * This is our Application class that contains our main method. We will test the project here
 */

public class Application {

	public static void main(String[] args) {
		
		/**
		 * Creating parameterized Item types and setting them to appropriate values
		 */
		Item<String> name = new Item<String>();
		name.setE("Joshua Domzalski");
		Item<Integer> intItem = new Item<Integer>();
		intItem.setE(5);
		/**
		 * Creating a SmallBag that allows Items to be placed into it
		 */
		SmallBag<Item> SmallBag1 = new SmallBag<Item>();
		/**
		 * Testing putting our two Items in the SmallBag and printing the results
		 */
		SmallBag1.setVarItem(name);
		System.out.println(SmallBag1.getVarItem().getE());
		SmallBag1.setVarItem(intItem);
		System.out.println(SmallBag1.getVarItem().getE());


	}//end main

}//end class
