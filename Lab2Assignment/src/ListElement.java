/**
 * 
 */

/**
 * @author mDhillon
 *
 */
public class ListElement {
	
	
	private ListElement next;
	private ListElement previous;
	private int data;
	
	
	public ListElement()
	{
		this.next = null;
		this.previous = null;
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
		ListElement current = this;
		
		if (next == null) {
			next = temp;
			next.previous = this;
		} else {
			while (current.getNext() != null) {
				current = current.getNext();
			}
			
			current.setNext(temp);
			current.next.previous = current;
		}	
	}
	
	public ListElement getNext () {
		return this.next;
	}
	
	public ListElement getPrevious () {
		return this.previous;
	}
	
	public void setNext(ListElement nextElement) {
		this.next = nextElement;
	}
	
	public void setPrevious(ListElement previousElement) {
		this.previous = previousElement;
	}
	
	public ListElement getElement (int index) {
		ListElement current = this;
		for (int i = 0; i < index; i++) {
			current = current.getNext();
		}
		
		return current;
	}
	
	public ListElement deleteElement (int index) {
		ListElement current = this;
		ListElement temp = new ListElement();
		if (index == 0) {
			temp.setData(current.data);
			current.setData(current.getNext().getData());
			current.setNext(current.getNext().getNext());
			current.previous = null;
		} else {
			for (int i = 1; i < index; i++) {
				current = current.getNext();
			}
			
			temp = current.getNext();
			
			current.setNext(current.getNext().getNext());
			current.next.previous = current;
			
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
	
	public void printLinkedListTail () {
		ListElement current = this;
		
		while (current.next!=null) {
			current = current.getNext();
		}
		
		do {
			System.out.print(current.data);
			System.out.print("; ");
			current = current.getPrevious();
		} while (current.previous != null);
		
		System.out.print(current.data);
	}
	
	
}
