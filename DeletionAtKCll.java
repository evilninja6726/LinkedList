package linkedListDs;

public class DeletionAtKCll {
    public static void main(String[] args) {
        CircularNode head = new CircularNode(10);
        head.next = new CircularNode(20);
        head.next.next = new CircularNode(30);
        head.next.next.next = new CircularNode(40);
        head.next.next.next.next = head;
        head = deletionAtKCll(head, 3);
        printCircular(head);
    }

    public static void printCircular(CircularNode head) {
        System.out.print(head.data + " ");
        for (CircularNode i = head.next; i != head; i = i.next)
            System.out.print(i.data + " ");
    }

    public static CircularNode deletionAtKCll(CircularNode head, int k) {
        if (head == null || head.next == head || k == 1)
            return null;
        CircularNode curr = head;
        for (int i = 0; i < k - 2; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}
