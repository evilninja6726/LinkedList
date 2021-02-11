package linkedListDs;

public class SortedInsert {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head = sortedInsert(head, 5);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static Node sortedInsert(Node head, int data) {
        Node temp = new Node(data);
        if (head == null)
            return temp;
        if (head.data > data) {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        while (curr.next != null && curr.next.data < data)
            curr = curr.next;
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }
}
