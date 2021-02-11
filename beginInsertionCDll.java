package linkedListDs;

public class beginInsertionCDll {
    public static void main(String[] args) {
        DoublyNode head = null;
        head = beginInsertionCDll(head, 10);
        head = beginInsertionCDll(head, 20);
        head = beginInsertionCDll(head, 30);
        printCircularDll(head);
    }

    public static void printCircularDll(DoublyNode head) {
        System.out.print(head.data + " ");
        for (DoublyNode i = head.next; i != head; i = i.next) {
            System.out.print(i.data + " ");
        }
    }

    public static DoublyNode beginInsertionCDll(DoublyNode head, int data) {
        DoublyNode temp = new DoublyNode(data);
        if (head == null) {
            temp.prev = temp;
            temp.next = temp;
            return temp;
        }
        head.prev.next = temp;
        temp.prev = head.prev;
        head.prev = temp;
        temp.next = head;
        return temp;
    }
}
