package ca.mb.rrc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Class creates an ArrayList of Strings
 * Has method to iterate and print the ArrayList elements
 * Has method to sort ArrayList in ascending order
 * 
 * @author Denis Buhrer Pedroso
 *
 */
public class ArrayListExample {
	
	// Creating languageList
	ArrayList<String> languageList = new ArrayList<String>();
	
	/**
	 * Add a Language into languageList
	 * 
	 */
	public void addItem(String language){
		languageList.add(language);
	}


	/**
	 * Loops through all elements on languageList
	 * and print them on the console
	 * 
	 */
	public void iterateList() {
		// Print header
		System.out.println("----------- Elements in languageList --------");

		// Looping list through Iterator
		Iterator<String> itr = languageList.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}//end while

		// Print header
		System.out.println("----------- End of languageList      --------");
	} // iterateList()
	
	/**
	 * Sorts languageList in ascending order
	 * 
	 */
	public void sortListAlphabetically() {
		// Collections.sort method is sorting the 
        // elements of languageList in ascending order.
		Collections.sort(languageList);
		
	}// End method sortListAlphabetically()

}
