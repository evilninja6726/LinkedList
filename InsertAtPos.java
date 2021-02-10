package linkedListDs;

public class InsertAtPos {
    public static void main(String[] args) {
        Node h1 = null;

        Node h2 = new Node(10);

        Node h3 = new Node(20);
        h3.next = new Node(30);
        h3.next.next = new Node(40);
        h3.next.next.next = new Node(50);

        h1 = insertAtPos(h1, 1, 5);
        while (h1 != null) {
            System.out.println(h1.data);
            h1 = h1.next;
        }
        System.out.println();
        h2 = insertAtPos(h2, 2, 5);
        while (h2 != null) {
            System.out.println(h2.data);
            h2 = h2.next;
        }
        System.out.println();
        h3 = insertAtPos(h3, 5, 5);
        while (h3 != null) {
            System.out.println(h3.data);
            h3 = h3.next;
        }
    }

    public static Node insertAtPos(Node head, int pos, int data) {
        Node temp = new Node(data);
        if (pos == 1) {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for (int i = 0; i < pos - 2 && curr != null; i++) {
            curr = curr.next;
        }
        if (curr == null) {
            return head;
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }
}
