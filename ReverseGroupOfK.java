package linkedListDs;

public class ReverseGroupOfK {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = new Node(70);
        head.next.next.next.next.next.next.next = new Node(80);
        head = reverseGroupOfKIt(head, 3);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static Node reverseGroupOfKRec(Node head, int k) {
        Node curr = head;
        Node left = null;
        if (head == null)
            return left;
        Node right = null;
        int count = 0;

        while (curr != null && count < k) {
            right = curr.next;
            curr.next = left;
            left = curr;
            curr = right;
            count++;
        }
        if (right != null) {
            Node restHead = reverseGroupOfKRec(right, k);
            head.next = restHead;
        }
        return left;
    }

    public static Node reverseGroupOfKIt(Node head, int k) {
        Node curr = head;
        Node tempLeft = null;
        boolean isFirstGroup = true;
        while (curr != null) {
            Node left = null;
            int count = 0;
            Node tempHead = curr;
            while (curr != null && count < k) {
                Node right = curr.next;
                curr.next = left;
                left = curr;
                curr = right;
                count++;
            }
            if (isFirstGroup) {
                head = left;
                isFirstGroup = false;
            } else {
                tempLeft.next = left;
            }
            tempLeft = tempHead;
        }
        return head;
    }
}
