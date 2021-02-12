package linkedListDs;

public class DetectAndRemoveCycle {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(30);
        head.next.next = new Node(40);
        head.next.next.next = new Node(50);
        head.next.next.next.next = head.next.next;
        head = detectAndRemoveCycle(head);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static Node detectAndRemoveCycle(Node head) {
        Node slow = head, fast = head;
        boolean isCycle = false;
        while (fast != null || fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                isCycle = true;
                slow = head;
                break;
            }
        }
        if (isCycle) {
            while (fast.next != slow.next) {
                slow = slow.next;
                fast = fast.next;
            }
            fast.next = null;
        }
        return head;
    }
}
