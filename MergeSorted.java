package linkedListDs;

public class MergeSorted {
    public static void main(String[] args) {
        Node h1 = new Node(5);
        h1.next = new Node(15);
        h1.next.next = new Node(25);
        h1.next.next.next = new Node(35);
        h1.next.next.next.next = new Node(45);
        h1.next.next.next.next.next = new Node(55);
        Node h2 = new Node(1);
        h2.next = new Node(20);
        h2.next.next = new Node(30);
        Node merge = mergeSorted(h1, h2);
        while (merge != null) {
            System.out.print(merge.data + " ");
            merge = merge.next;
        }
    }

    public static Node mergeSorted(Node h1, Node h2) {
        if (h1 == null)
            return h2;
        if (h2 == null)
            return h1;
        Node curr1 = h1, curr2 = h2;
        Node head = null;
        if (curr1.data > curr2.data) {
            head = curr2;
            curr2 = curr2.next;
        } else {
            head = curr1;
            curr1 = curr1.next;
        }
        Node temp = head;
        while (curr1 != null && curr2 != null) {
            if (curr1.data <= curr2.data) {
                temp.next = curr1;
                temp = curr1;
                curr1 = curr1.next;
            } else {
                temp.next = curr2;
                temp = curr2;
                curr2 = curr2.next;
            }
        }
        if (curr1 == null)
            temp.next = curr2;
        else temp.next = curr1;
        return head;
    }
}
