package linkedListDs;

import java.util.ArrayList;

public class ReverseSll {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(25);
        head.next.next.next = new Node(35);
        head.next.next.next.next = new Node(40);
        head = reverseSllEff(head);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static Node reverseSll(Node head) {
        if (head == null || head.next == null)
            return head;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Node i = head; i != null; i = i.next)
            arrayList.add(i.data);
        for (Node i = head; i != null; i = i.next)
            i.data = arrayList.remove(arrayList.size() - 1);
        return head;
    }

    public static Node reverseSllEff(Node head) {
        Node right = head, curr = head;
        Node left = null;
        while (curr != null) {
            right = curr.next;
            curr.next = left;
            left = curr;
            curr = right;
        }
        return left;
    }
}
