package linkedListDs;

public class EndInsertionDd {
    public static void main(String[] args) {
        DoublyNode head = null;
        head = endInsertionDd(head, 10);
        head = endInsertionDd(head, 30);
        head = endInsertionDd(head, 50);
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static DoublyNode endInsertionDd(DoublyNode head, int data) {
        DoublyNode temp = new DoublyNode(data);
        DoublyNode curr = head;
        if (curr == null)
            return temp;
        while (curr.next != null)
            curr = curr.next;
        temp.prev = curr;
        curr.next = temp;
        return head;
    }
}
