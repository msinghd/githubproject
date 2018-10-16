/**
 * 
 */

/**
 * @author mDhillon
 *
 */
public class ListElement {
	
	
	private ListElement next;
	//private ListElement previous;
	private int data;
	
	
	public ListElement()
	{
		this.next = null;
		//this.previous = null;
		this.data = 0;
		
	}
	
	
	public void setData(int data)
	{
		this.data = data;
	}

	
	public int getData()
	{
		return this.data;
	}
	
	public void addElement (ListElement le) {
		ListElement temp = le;
		ListElement current = next;
		
		if (next == null) {
			next = temp;
		} else {
			while (current.getNext() != null) {
				current = current.getNext();
			}
			
			current.setNext(temp);
		}	
	}
	
	public ListElement getNext () {
		return this.next;
	}
	
	public void setNext(ListElement nextElement) {
		this.next = nextElement;
	}
	
	public ListElement getElement (int index) {
		ListElement current = next;
		for (int i = 0; i < index; i++) {
			current = current.getNext();
		}
		
		return current;
	}
	
	public ListElement deleteElement (int index) {
		ListElement current = next;
		ListElement temp;
		if (index == 0) {
			temp = next;
			next = next.getNext();
		} else {
			for (int i = 1; i < index; i++) {
				current = current.getNext();
			}
			
			temp = current;
			
			current.setNext(current.getNext().getNext());
		}
		
		return temp;

	}
	
	public void printLinkedListHead () {
		System.out.print(data);
		if(next != null) {
			System.out.print("; ");
			next.printLinkedListHead();
		}
	}
	
	
}
