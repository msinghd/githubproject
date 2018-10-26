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
		 do {
		  if (c == 'A' || c == 'a') {
			  System.out.print("Enter an integer for the new element: ");
			  int i = in.nextInt();
			  ListElement temp = new ListElement();
			  temp.setData(i);
			  le.addElement(temp);
			  System.out.print("\nEnter next option: ");
			  c = in.next().charAt(0);	  
		  } else if (c == 'R' || c == 'r') {
			  System.out.print("Enter the index of the node you want to retrieve: ");
			  int i = in.nextInt();
			  System.out.print("Retrieved element: ");
			  System.out.print(le.getElement(i).getData());
			  System.out.print("\n\nEnter next option: ");
			  c = in.next().charAt(0);
		  } else if (c == 'D' || c == 'd') {
			  System.out.print("Enter the index of the node you want to delete: ");
			  int i = in.nextInt();
			  System.out.print("Deleted element ");
			  System.out.print(le.deleteElement(i).getData());
			  System.out.print("\n\nEnter next option: ");
			  c = in.next().charAt(0);
		  } else if (c == 'H' || c == 'h') {
			  le.printLinkedListHead();
			  System.out.print("\n\nEnter next option: ");
			  c = in.next().charAt(0);
		  } else if (c == 'Q' || c =='q'){
			  System.out.println("Quitting...");
			  System.out.println("...............");
			  System.out.println("...................");
			  System.out.println("Linked list has been unlinked!");
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
			  System.out.print("Enter your option: ");
			  c = in.next().charAt(0);
		  }}while(c != 'Q' || c != 'q');
	}

}
