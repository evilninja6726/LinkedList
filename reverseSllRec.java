package linkedListDs;

public class reverseSllRec {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(25);
        head.next.next.next = new Node(35);
        head.next.next.next.next = new Node(40);
        head = reverseSllTailRec(head, null);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static Node reverseSllRec(Node head) {
        if (head == null || head.next == null)
            return head;
        Node restHead = reverseSllRec(head.next);
        Node restTail = head.next;
        restTail.next = head;
        head.next = null;
        return restHead;
    }

    public static Node reverseSllTailRec(Node head, Node left) {
        if (head == null)
            return left;
        Node right = head.next;
        head.next = left;
        left = head;
        head = right;
        return reverseSllTailRec(head, left);
    }
}
