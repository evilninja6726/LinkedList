package linkedListDs;

public class MiddleElement {
    public static void main(String[] args) {
        Node h1 = null;

        Node h2 = new Node(10);

        Node head = new Node(20);
        head.next = new Node(30);
        head.next.next = new Node(40);
        head.next.next.next = new Node(50);

        System.out.println(middleElement(h1));

        System.out.println(middleElement(h2));

        System.out.println(middleElement(head));

        System.out.println();

        System.out.println(middleElementEff(h1));
        System.out.println(middleElementEff(h2));
        System.out.println(middleElementEff(head));
    }

    public static int middleElement(Node head) {
        if (head == null)
            return -1;
        int count = 0;
        Node curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        for (int i = 0; i < count / 2; i++) {
            head = head.next;
        }
        return head.data;
    }

    public static int middleElementEff(Node head) {
        if (head == null)
            return -1;
        if (head.next == null)
            return head.data;
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}
