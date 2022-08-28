/**
 * @author Joshua Domzalski
 * Data Structures
 * Fall 2022
 * This is a generic class used to represent a SmallBag that we can place Items in
 * @param <T>
 */

public class SmallBag<E> {
	
	private E varItem;//end variables
	
	/**
	 * Getter and Setters
	 * @return
	 */
	public E getVarItem() {
		return varItem;
	}
	
	public void setVarItem(E varItem) {
		this.varItem = varItem;
	}

}//end class
