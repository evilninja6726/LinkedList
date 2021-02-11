package linkedListDs;

public class BeginDeletionCll {
    public static void main(String[] args) {
        CircularNode head = new CircularNode(10);
        head.next = new CircularNode(20);
        head.next.next = new CircularNode(30);
        head.next.next.next = new CircularNode(40);
        head.next.next.next.next = head;
        head = beginDeletionCll(head);
        head = beginDeletionCllEff(head);
        printCircular(head);
    }

    public static void printCircular(CircularNode head) {
        System.out.print(head.data + " ");
        for (CircularNode i = head.next; i != head; i = i.next)
            System.out.print(i.data + " ");
    }

    public static CircularNode beginDeletionCll(CircularNode head) {
        if (head == null || head.next == head)
            return null;
        CircularNode curr = head;
        while (curr.next != head)
            curr = curr.next;
        curr.next = head.next;
        return curr.next;
    }

    public static CircularNode beginDeletionCllEff(CircularNode head) {
        if (head == null || head.next == head)
            return null;
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }
}
