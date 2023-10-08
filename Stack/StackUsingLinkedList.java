public class StackUsingLinkedList {

	private class Node {
		int data;
		Node next;
		Node (int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head;
	int size;

	public void createStack() {
		head = null;
		size = 0;
	}

	public void push(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			head.next = newNode;
			head = newNode;
		}
		size++;
	}

	public void pop() {
		if (head == null) {
			System.out.println("Stack Underflow Error!");
		} else {
			int tmp = head.data;
			System.out.println(tmp);
			head = head.next;
		}
		size--;
	}

	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}

	public void peek() {
		if (head == null) {
			System.out.println("Empty Stack!");
		} else {
			int tmp = head.data;
			System.out.println(tmp);
		}
	}

	public void deleteStack() {
		head = null;
	}

	public static void main(String[] args) {

		StackUsingLinkedList stack = new StackUsingLinkedList();

		// create stack of size 5
		stack.createStack();

		// push elements to the stack
		stack.push(1);
		stack.push(2);
		stack.push(3);

		// remove and return top element from stack
		stack.pop();

		// return top element without remove it
		stack.peek();

		// isEmpty will check whether the stack is empty or not
		System.out.println(stack.isEmpty());

		// deleteStack will delete the entire stack
		stack.deleteStack();

		stack.peek();

	}

}