package linkedListDs;

public class Reverse {
    public static void main(String[] args) {
        DoublyNode head = new DoublyNode(10);
        DoublyNode temp1 = new DoublyNode(20);
        DoublyNode temp2 = new DoublyNode(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        DoublyNode x = reverse(head);
        while (x != null) {
            System.out.println(x.data);
            x = x.next;
        }
    }

    public static DoublyNode reverse(DoublyNode head) {
        if (head == null || head.next == null)
            return head;
        DoublyNode curr = head;
        DoublyNode temp = null;
        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        head = temp.prev;
        return head;
    }
}
