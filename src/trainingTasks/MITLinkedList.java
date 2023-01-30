package trainingTasks;

//A Generic Node class is used to create a Linked List
class Node<E> {

	// Data Stored in each Node of the Linked List
	E data;

	// Pointer to the next node in the Linked List
	Node<E> next;

	// Node class constructor used to initializes the data
	// in each Node
	Node(E data) { 
		this.data = data; 
		}
}

class LinkedList<E> {

	// Points to the head of the Linked
	// List i.e the first element
	Node<E> head = null;
	int size = 0;

	// Addition of elements to the tail of the Linked List
	public void add(E element)
	{
		// Checks whether the head is created else creates a
		// new one
		if (head == null) {
			head = new Node<>(element);
			size++;
			return;
		}

		// The Node which needs to be added at
		// the tail of the Linked List
		Node<E> add = new Node<>(element);

		// Storing the instance of the
		// head pointer
		Node<E> temp = head;

		// The while loop takes us to the tail of the Linked
		// List
		while (temp.next != null) {
			temp = temp.next;
		}

		// New Node is added at the tail of
		// the Linked List
		temp.next = add;

		// Size of the Linked List is incremented as
		// the elements are added
		size++;
	}

	// Searches the Linked List for the given element and
	// returns it's particular index if found else returns
	// -1
	public int search(E element)
	{

		if (head == null) {
			return -1;
		}

		int index = 0;
		Node<E> temp = head;

		// While loop is used to search the entire Linked
		// List starting from the tail
		while (temp != null) {

			// Returns the index of that particular element,
			// if found.
			if (temp.data == element) {
				return index;
			}

			// Gradually increases index while
			// traversing through the Linked List
			index++;
			temp = temp.next;
		}

		// Returns -1 if the element is not found
		return -1;
	}
}

public class MITLinkedList {	
	public static void main(String[] args) throws Exception {
		// Initializing the Linked List
		LinkedList<Integer> ll = new LinkedList<>();

		// Adding elements to the Linked List
		ll.add(1);
		ll.add(10);
		ll.add(12);
		ll.add(-1);
		ll.add(0);
		ll.add(-19);
		ll.add(34);

		// Element to be searched
		// Searching the Linked
		// List for the element
		int ans = ll.search(-1);

		if (ans == -1) {
			System.out.println(
				"Element not found in the Linked List");
		}
		else
			System.out.println(
				"Element found in the Linked List at "
				+ ans);
	}
}