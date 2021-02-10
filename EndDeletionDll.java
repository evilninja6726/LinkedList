package linkedListDs;

public class EndDeletionDll {
    public static void main(String[] args) {
        DoublyNode head = new DoublyNode(10);
        DoublyNode temp1 = new DoublyNode(20);
        DoublyNode temp2 = new DoublyNode(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;

        head = endDeletionDll(head);
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static DoublyNode endDeletionDll(DoublyNode head) {
        if (head == null || head.next == null)
            return null;
        DoublyNode curr = head;
        while (curr.next != null)
            curr = curr.next;
        curr.prev.next = null;
        return head;
    }
}
