package linkedListDs;

public class SegregateEvenOdd {
    public static void main(String[] args) {
        Node head = new Node(17);
        head.next = new Node(15);
        head.next.next = new Node(8);
        head.next.next.next = new Node(12);
        head.next.next.next.next = new Node(10);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = new Node(4);
        head = segregateEvenOdd(head);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static Node segregateEvenOdd(Node head) {
        Node curr = head;
        Node eS = null, oS = null, eE = null, oE = null;
        while (curr != null) {
            if (curr.data % 2 == 0) {
                if (eS == null) {
                    eS = curr;
                    eE = eS;
                } else {
                    eE.next = curr;
                    eE = eE.next;
                }
            } else {
                if (oS == null) {
                    oS = curr;
                    oE = oS;
                } else {
                    oE.next = curr;
                    oE = oE.next;
                }
            }
            curr = curr.next;
        }
        if (oE == null || eE == null)
            return head;
        eE.next = oS;
        oE.next = null;
        return eS;
    }
}
