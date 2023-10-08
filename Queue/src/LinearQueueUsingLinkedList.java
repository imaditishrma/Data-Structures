public class LinearQueueUsingLinkedList {

	private class Node {
		int val;
		Node next;
		Node (int value) {
			this.val = value;
			this.next = null;
		}
	}

	Node front;
	Node rear;

	public void createQueue() {
		front = rear = null;
	}

	public void enQueue(int val) {
		Node newNode = new Node(val);
		if (front == null) {
			front = rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
		System.out.println("Inserted " + val);
	}

	public void deQueue() {
		if (front == null) {
			System.out.println("Queue is Empty!");
		} else {
			int tmp = front.val;
			front = front.next;
			System.out.println("Deleted " + tmp);
			if (front == null) {
				rear = null;
			}
		}
	}

	public void peek() {
		if (front == null) {
			System.out.println("Queue is Empty!");
		} else {
			System.out.println("Peek " + front.val);
		}
	}

	public boolean isEmpty() {
		if (front == null) {
			return true;
		} else {
			return false;
		}
	}

	public void deleteQueue() {
		front = rear = null;
		System.out.println("Queue is Deleted!");
	}

	public void printQueue() {
		Node current = front;
		while (current != null) {
			System.out.println(current.val);
			current = current.next;
		}
	}

	public static void main(String[] args) {

		LinearQueueUsingLinkedList queue = new LinearQueueUsingLinkedList();

		queue.createQueue();

		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(40);
		queue.enQueue(50);

		queue.printQueue();

		queue.deQueue();
		queue.deQueue();

		queue.printQueue();

		queue.peek();

		queue.isEmpty();

		queue.deleteQueue();

		queue.printQueue();

	}

}