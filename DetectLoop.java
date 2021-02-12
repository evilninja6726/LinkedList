package linkedListDs;

import java.util.HashSet;

public class DetectLoop {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(30);
        head.next.next = new Node(40);
        head.next.next.next = new Node(50);
        head.next.next.next.next = head.next.next.next;
        System.out.println(detectLoop(head));
        System.out.println(detectLoopHashing(head));
    }

    public static boolean detectLoop(Node head) {
        if (head == null)
            return false;
        Node temp = new Node(10);
        while (head != null) {
            if (head.next == temp)
                return true;
            head.next = temp;
            head = head.next;
        }
        return false;
    }

    public static boolean detectLoopHashing(Node head) {
        Node curr = head;
        HashSet<Node> hashSet = new HashSet<>();
        while (curr != null) {
            if (hashSet.contains(curr))
                return true;
            hashSet.add(curr);
            curr = curr.next;
        }
        return false;
    }
}
