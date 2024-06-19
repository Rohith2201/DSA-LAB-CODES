

public class QueueLinkedList {
    private class Node {
        int value;
        Node next;

        private Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node last;

    public void enQueue(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = last = node;
            return;
        }
        last.next = node;
        last = node;
    }

    public void deQueue() {
        if (head == null) {
            System.out.println("no elements in the queue");
            return;
        }
        var m = head.next;
        head.next = null;
        head = m;

    }

    public void display() {
        var current = head;
        while (current != null) {
            System.out.println("-->"+current.value);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        QueueLinkedList qLL = new QueueLinkedList();
        qLL.enQueue(10);
        qLL.enQueue(20);
        qLL.enQueue(30);
        qLL.enQueue(40);
        qLL.enQueue(50);
        qLL.enQueue(60);
        System.out.println("After enQueueing all elements:");
        qLL.display();
        System.out.println();
        
        qLL.deQueue();
        qLL.deQueue();
        System.out.println("After deQueueing first 2 elements: ");

        qLL.display();
        System.out.println();

    }
}


