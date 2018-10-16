/**
 * 
 */

/**
 * @author mDhillon
 *
 */

import java.util.Scanner;

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
		  System.out.print("Q - Quit the program\n\nEnter your option: ");
		  
		  Scanner in = new Scanner(System.in);
		  
		  char c = in.next().charAt(0);
		  //le.addElement();
		  
		  if (c == 'A' || c == 'a') {
			  System.out.print("Enter an integer for the new element: ");
			  int i = in.nextInt();
			  ListElement temp = new ListElement();
			  temp.setData(i);
			  le.addElement(temp);  
		  } else if (c == 'R' || c == 'r') {
			  System.out.print("Enter the index of the node you want to retrieve: ");
			  int i = in.nextInt();
			  le.getElement(i);
		  } else if (c == 'D' || c == 'd') {
			  System.out.print("Enter the index of the node you want to delete: ");
			  int i = in.nextInt();
			  le.deleteElement(i);
		  } else if (c == 'H' || c == 'h') {
			  le.printLinkedListHead();
		  } else if (c == 'Q' || c =='q'){
			  System.out.println("Quitting...");
			  System.out.println("...............");
			  System.out.println("...................");
			  try {
				Thread.sleep(30000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				in.close();
				System.exit(0);
			}
		  } else {
			  System.out.println("Invalid input!\nTry again!");
		  }
	}

}
