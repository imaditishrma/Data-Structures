public class CircularQueueUsingArray {

	int[] array;
	int front, rear;
	int size;

	public void createQueue(int len) {
		array = new int[len];
		front = -1;
		rear = -1;
		size = len;
	}

	public void enQueue(int value) {
		if (isFull()) {
			System.out.println("Queue is Full.");
		} else {
			if (front == -1)
				front = 0;
			rear = (rear + 1) % size;
			array[rear] = value;
			System.out.println("Inserted " + value);
		}
	}

	public void deQueue() {
		if (isEmpty()) {
			System.out.println("Queue is Empty.");
		} else {
			int tmp = array[front];
			if (front == rear) {
				front = rear = -1;
			} else {
				front = (front + 1) % size;
			}
			System.out.println(tmp);
		}
	}

	public boolean isEmpty() {
		if (rear == -1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isFull() {
		if (front == 0 && rear == size - 1) {
			return true;
		}
		if (front == rear + 1) {
			return true;
		}
		return false;
	}

	public void peek() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
		}  else {
			System.out.println(array[front]);
		}
	}

	public void deleteQueue() {
		array = null;
		front = rear = -1;
	} 

	public void printQueue() {
		if (front == -1) {
			System.out.println("Queue is Empty!");
			return;
		}
		int i;
		for (i = front; i != rear; i = (i + 1) % size) {
			System.out.println(array[i]);
		}
		System.out.println("index of front=" + front);
		System.out.println("index of rear=" + rear);
	} 

	public static void main(String[] args) {

		CircularQueueUsingArray queue = new CircularQueueUsingArray();
		queue.createQueue(5);

		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(40);
		queue.enQueue(50);

		queue.deQueue();
		queue.deQueue();
		queue.enQueue(60);
		queue.printQueue();
		queue.deQueue();
		queue.printQueue();
		queue.deleteQueue();
		queue.printQueue();
	}

}