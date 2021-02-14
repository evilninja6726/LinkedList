package linkedListDs;

public class PairwiseSwap {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(30);
        head.next.next = new Node(40);
        head.next.next.next = new Node(50);
        head.next.next.next.next = new Node(60);
        head = pairwiseSwapEff(head);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static Node pairwiseSwap(Node head) {
        if (head == null || head.next == null)
            return head;
        Node curr = head;
        while (curr != null && curr.next != null) {
            int temp = curr.data;
            curr.data = curr.next.data;
            curr.next.data = temp;
            curr = curr.next.next;
        }
        return head;
    }

    public static Node pairwiseSwapEff(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node curr = head.next.next;
        Node left = head;
        head = left.next;
        head.next = left;
        while (curr != null && curr.next != null) {
            left.next = curr.next;
            left = curr;
            Node right = curr.next.next;
            curr.next.next = curr;
            curr = right;
        }
        left.next = curr;
        return head;
    }
}
