class Queue {
	static int front;
    private static int rear;
    private static int capacity;
	static private int queue[];

	Queue()
	{
		front = rear = 0;
		capacity = c;
		queue = new int[capacity];
	}
	static void queueEnqueue(int data)
	{
		if (capacity == rear) {
			System.out.printf("\nQueue is full\n");
			return;
		}
		else {
			queue[rear] = data;
			rear++;
		}
		return;
	}
	static void queueDequeue()
	{
		if (front == rear) {
			System.out.printf("\nQueue is empty\n");
			return;
		}
		else {
			for (int i = 0; i < rear - 1; i++) {
				queue[i] = queue[i + 1];
			}
			if (rear < capacity)
				queue[rear] = 0;

			rear--;
		}
		return;
	}

	// print queue elements
	static void queueDisplay()
	{
		int i;
		if (front == rear) {
			System.out.printf("\nQueue is Empty\n");
			return;
		}

		// traverse front to rear and print elements
		for (i = front; i < rear; i++) {
			System.out.printf(" %d <-- ", queue[i]);
		}
		return;
	}

	// print front of queue
	static void queueFront()
	{
		if (front == rear) {
			System.out.printf("\nQueue is Empty\n");
			return;
		}
		System.out.printf("\nFront Element is: %d",
						queue[front]);
		return;
	}
    public void iqueue(int i) {
    }
    public void dequeue() {
    }
    public void dqueue(int i) {
    }
}

public class StaticQueue {

	// Driver code
	public static void main(String[] args)
	{
		// Create a queue of capacity 4
		Queue q = new Queue(4);

		// print Queue elements
		q.queueDisplay();

		// inserting elements in the queue
		q.queueEnqueue(20);
		q.queueEnqueue(30);
		q.queueEnqueue(40);
		q.queueEnqueue(50);

		// print Queue elements
		q.queueDisplay();

		// insert element in the queue
		q.queueEnqueue(60);

		// print Queue elements
		q.queueDisplay();

		q.queueDequeue();
		q.queueDequeue();
		System.out.printf(
			"\n\nafter two node deletion\n\n");

		// print Queue elements
		q.queueDisplay();

		// print front of the queue
		q.queueFront();
	}
}
