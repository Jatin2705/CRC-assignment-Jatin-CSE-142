class NodeR {
    int data;
    NodeR next;

    NodeR(int data) {
        this.data = data;
    }
}

public class ReverseLinkedList {
    NodeR head;

    void insert(int data) {
        NodeR newNode = new NodeR(data);
        if (head == null) {
            head = newNode;
            return;
        }

        NodeR temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    void reverse() {
        NodeR prev = null;
        NodeR current = head;
        NodeR next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    void display() {
        NodeR temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        list.display();
        list.reverse();
        list.display();
    }
}