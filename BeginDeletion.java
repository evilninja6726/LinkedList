package linkedListDs;

public class BeginDeletion {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head = beginDeletion(head);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static Node beginDeletion(Node head) {
        if (head == null)
            return null;
        return head.next;
    }
}
