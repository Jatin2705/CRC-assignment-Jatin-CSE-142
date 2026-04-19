class StackNode {
    int data;
    StackNode next;

    StackNode(int data) {
        this.data = data;
    }
}

public class StackLinkedList {
    StackNode top = null;

    void push(int value) {
        StackNode newNode = new StackNode(value);
        newNode.next = top;
        top = newNode;
    }

    void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Popped: " + top.data);
        top = top.next;
    }

    void display() {
        StackNode temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackLinkedList s = new StackLinkedList();
        s.push(5);
        s.push(10);
        s.push(15);
        s.display();
        s.pop();
        s.display();
    }
}