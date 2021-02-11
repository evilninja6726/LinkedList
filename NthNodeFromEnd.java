package linkedListDs;

public class NthNodeFromEnd {
    public static void main(String[] args) {
        Node h1 = null;
        Node h2 = new Node(10);

        Node head = new Node(20);
        head.next = new Node(30);
        head.next.next = new Node(40);
        head.next.next.next = new Node(50);
        head.next.next.next.next = new Node(60);
        head.next.next.next.next.next = new Node(70);

        System.out.println(nthNodeFromEnd(h1, 10));
        System.out.println(nthNodeFromEnd(h2, 1));
        System.out.println(nthNodeFromEnd(h2, 2));
        System.out.println(nthNodeFromEnd(head, 4));
        System.out.println(nthNodeFromEndEff(head, 4));
        System.out.println(nthNodeFromEndEff(h2, 1));
        System.out.println(nthNodeFromEndEff(h2, 3));
    }

    public static int nthNodeFromEnd(Node head, int n) {
        if (head == null)
            return -1;
        int count = 0;
        Node curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        if (count < n)
            return -1;
        for (int i = 0; i < count - n; i++)
            head = head.next;
        return head.data;
    }

    public static int nthNodeFromEndEff(Node head, int n) {
        if (head == null)
            return -1;
        Node slow = head, fast = head;
        for (int i = 0; i < n; i++) {
            if (fast == null)
                return -1;
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }
}
