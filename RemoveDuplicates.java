package linkedListDs;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Node h1 = null;
        Node h2 = new Node(5);

        Node head = new Node(10);
        head.next = new Node(10);
        head.next.next = new Node(20);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(30);
        head.next.next.next.next.next = new Node(30);
        head.next.next.next.next.next.next = new Node(30);
        head.next.next.next.next.next.next.next = new Node(40);
        h1 = removeDuplicates(h1);
        h2 = removeDuplicates(h2);
        head = removeDuplicates(head);
        while (h1 != null) {
            System.out.print(h1.data + " ");
            h1 = h1.next;
        }
        while (h2 != null) {
            System.out.print(h2.data + " ");
            h2 = h2.next;
        }
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static Node removeDuplicates(Node head) {
        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.data == curr.next.data)
                curr.next = curr.next.next;
            else
                curr = curr.next;
        }
        return head;
    }
}
