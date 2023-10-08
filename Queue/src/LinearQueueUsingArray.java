public class LinearQueueUsingArray {

	int[] arr;
	int rear;
	int front;

	public void createQueue(int size) {
		arr = new int[size];
		rear = -1;
		front = -1;
	}

	public void enQueue(int value) {
		// if the queue is full
		if (arr.length-1 == rear) {
			System.out.println("Queue Overflow Error!");
		} else if (rear == -1) { // if the queue is empty
			front = 0;
			rear++;
			arr[rear] = value;
		} else { // if the queue already has some elements
			rear++;
			arr[rear] = value;
		}
	}

	public void deQueue() {
		if (rear == -1) {
			System.out.println("Queue Underflow Error.");
		} else {
			int tmp = arr[front];
			System.out.println(tmp);
			arr[front] = 0;
			front++;
			if (front > rear) {
				front = rear = -1;
			}
		}
	}

	public void peek() {
		if (front != -1) {
			System.out.println(arr[front]);
		} else {
			System.out.println("Queue is Empty!");
		}
	}

	public boolean isEmpty() {
		if (front == -1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isFull() {
		if (rear == arr.length - 1) {
			return true;
		} else {
			return false;
		}
	}

	public void deleteQueue() {
		arr = null;
	}

	public void printQueue() {
		if (front == -1) {
			System.out.println("Queue is Empty!");
		} else {
			for (int i = front; i <= rear; i++) {
				System.out.println(arr[i]);
			}
		}
	}


	public static void main(String[] args) {

		LinearQueueUsingArray queue = new LinearQueueUsingArray();

		queue.createQueue(5);

		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		queue.enQueue(5);

		// queue = [1, 2, 3, 4, 5]

		queue.peek(); // output: 1

		System.out.println(queue.isEmpty()); // output: false

		System.out.println(queue.isFull()); // output: true

		queue.deQueue(); // output: 1
		// queue after deQueue() operation, queue = [0, 2, 3, 4, 5]

		System.out.println("... Queue ...");
		queue.printQueue();
		// output: 2, 3, 4, 5
	}

}