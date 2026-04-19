public class QueueArray {
    int[] queue = new int[100];
    int front = 0, rear = -1;

    void insert(int value) {
        if (rear == queue.length - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        queue[++rear] = value;
    }

    void delete() {
        if (front > rear) {
            System.out.println("Queue Underflow");
            return;
        }
        System.out.println("Deleted: " + queue[front++]);
    }

    void display() {
        for (int i = front; i <= rear; i++)
            System.out.print(queue[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray();
        q.insert(10);
        q.insert(20);
        q.insert(30);
        q.display();
        q.delete();
        q.display();
    }
}