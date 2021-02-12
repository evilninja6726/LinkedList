package linkedListDs;

public class RemoveGivenNode {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(30);
        head.next.next = new Node(40);
        head.next.next.next = new Node(50);
        head = removeGivenNode(head);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static Node removeGivenNode(Node temp) {
        temp.data = temp.next.data;
        temp.next = temp.next.next;
        return temp;
    }
}
