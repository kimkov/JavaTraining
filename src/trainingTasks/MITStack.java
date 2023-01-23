package trainingTasks;

class SolStack {

	  // store elements of stack
	  private int arr[];
	  // represent top of stack
	  private int top;
	  // total capacity of the stack
	  private int capacity;

	  public SolStack(int i) {
		// TODO Auto-generated constructor stub
	}

	// Creating a stack
	  void Stack (int size) {
	    // initialize the array
	    // initialize the stack variables
	    arr = new int[size];
	    capacity = size;
	    top = -1;
	  }

	  // push elements to the top of stack
	  public void push(int x) {
	    if (isFull()) {
	      System.out.println("Stack OverFlow");

	      // terminates the program
	      System.exit(1);
	    }

	    // insert element on top of stack
	    System.out.println("Inserting " + x);
	    arr[++top] = x;
	  }

	  // pop elements from top of stack
	  public int pop() {

	    // if stack is empty
	    // no element to pop
	    if (isEmpty()) {
	      System.out.println("STACK EMPTY");
	      // terminates the program
	      System.exit(1);
	    }

	    // pop element from top of stack
	    return arr[top--];
	  }

	  // return size of the stack
	  public int getSize() {
	    return top + 1;
	  }

	  // check if the stack is empty
	  public Boolean isEmpty() {
	    return top == -1;
	  }

	  // check if the stack is full
	  public Boolean isFull() {
	    return top == capacity - 1;
	  }

}

public class MITStack {
	public static void main(String[] args) {
		SolStack stack = new SolStack(5);
		

	    stack.push(1);
	    stack.push(2);
	    stack.push(3);

	    System.out.print("Stack: ");
	    for(int i = 0; i < 3; i++) {
	    	System.out.print(stack.pop());
	    }
	    // remove element from stack
//	    stack.pop();
//	    System.out.println("\nAfter popping out");
//	    stack.printStack();
	}
}




