/**
 * @author Joshua Domzalski
 * Data Structures
 * Fall 2022
 * This is a generic class used to represent an Item
 * @param <T>
 */

public class Item<T> {
	
	private T e;//end variables

	/**
	 * Getter and Setter
	 * @return
	 */
	public T getE() {
		return e;
	} 

	public void setE(T e) {
		this.e = e;
	} 
	
}//end class
