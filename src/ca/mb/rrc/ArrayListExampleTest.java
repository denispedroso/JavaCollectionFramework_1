package ca.mb.rrc;

/**
 * This is to address the Java Collection Framework assignment 1
 * from ADEV-1001 Programming (Java 2)
 * 
 * It creates and instance of ArrayListExample class
 * call ArrayListExample iterateList method to print elements
 * call ArrayListExample sortListAlphabetically method to sort elements alphabetically
 * 
 * @author Denis Buhrer Pedroso
 *
 */
public class ArrayListExampleTest {

	public static void main(String[] args) {
		// Create instance of ArrayListExample
		ArrayListExample arrayList = new ArrayListExample();

		arrayList.addItem("English");
		arrayList.addItem("French");
		arrayList.addItem("Italian");
		arrayList.addItem("Arabic");		
		
		// Print ArrayListExample elements
		arrayList.iterateList();
		
		// Sort ArrayListExample elements
		arrayList.sortListAlphabetically();
		
		// Print sorted ArrayListExample elements
		arrayList.iterateList();
		
	}// End main

}// End of class
