/**
 * 
 */

/**
 * @author mDhillon
 *
 */
public class UI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ListElement le = new ListElement();
		  le.setData(5);
		  
		  System.out.println("Welcome to Singly Linked List Program!\n\n");
		  
		  System.out.println("Menu:\n");
		  System.out.println("A - Add a node to the list\nR - Retrieve a node from the list");
		  System.out.println("D - Delete a node from the list\nH - Print the linked list from head\n");
		  
		  
		  //le.addElement();
		  
		  ListElement le1 = new ListElement();
		  le1.setData(2);
		  
		  le.addElement(le1);
		  
		  le.printLinkedListHead();
	}

}
