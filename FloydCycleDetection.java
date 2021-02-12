package linkedListDs;

public class FloydCycleDetection {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(30);
        head.next.next = new Node(40);
        head.next.next.next = new Node(50);
        head.next.next.next.next = head.next.next.next;
        System.out.println(floydCycleDetection(head));
    }

    public static boolean floydCycleDetection(Node head) {
        Node fast = head, slow = head;
        while (fast != null || fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                return true;
        }
        return false;
    }
}
