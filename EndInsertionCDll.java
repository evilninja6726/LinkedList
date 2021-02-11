package linkedListDs;

public class EndInsertionCDll {
    public static void main(String[] args) {
        DoublyNode head = null;
        head = endInsertionCDll(head, 10);
        head = endInsertionCDll(head, 20);
        head = endInsertionCDll(head, 30);
        printCircularDll(head);
    }

    public static void printCircularDll(DoublyNode head) {
        System.out.print(head.data + " ");
        for (DoublyNode i = head.next; i != head; i = i.next)
            System.out.print(i.data + " ");
    }

    public static DoublyNode endInsertionCDll(DoublyNode head, int data) {
        DoublyNode temp = new DoublyNode(data);
        if (head == null) {
            temp.prev = temp;
            temp.next = temp;
            return temp;
        }
        head.prev.next = temp;
        temp.prev = head.prev;
        temp.next = head;
        head.prev = temp;
        return head;
    }
}
