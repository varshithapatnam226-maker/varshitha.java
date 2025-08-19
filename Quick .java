class Queue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        size = 0;
        rear = capacity - 1; // rear starts at end for circular increment
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Add element to the rear of queue
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot enqueue " + item);
            return;
        }
        rear = (rear + 1) % capacity; // circular increment
        arr[rear] = item;
        size++;
        System.out.println(item + " enqueued to queue");
    }

    // Remove element from the front of queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Cannot dequeue");
            return -1;
        }
        int item = arr[front];
        front = (front + 1) % capacity; // circular increment
        size--;
        return item;
    }

    // Get front element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    // Get current size of queue
    public int size() {
        return size;
    }
}

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        System.out.println(q.dequeue() + " dequeued from queue");

        System.out.println("Front item is " + q.peek());

        q.enqueue(50);
        q.enqueue(60);

        System.out.println("Queue size is " + q.size());

        while (!q.isEmpty()) {
            System.out.println(q.dequeue() + " dequeued from queue");
        }
    }
}
