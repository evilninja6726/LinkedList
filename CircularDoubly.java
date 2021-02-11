package linkedListDs;

public class CircularDoubly {

    public static void main(String[] args) {
        DoublyNode head = new DoublyNode(10);
        DoublyNode temp1 = new DoublyNode(20);
        DoublyNode temp2 = new DoublyNode(30);
        DoublyNode temp3 = new DoublyNode(40);
        head.next = temp1;
        head.prev = temp3;
        temp1.next = temp2;
        temp1.prev = head;
        temp2.next = temp3;
        temp2.prev = temp1;
        temp3.next = head;
        temp3.prev = temp2;
        printCircularDll(head);
    }

    public static void printCircularDll(DoublyNode head) {
        System.out.print(head.data + " ");
        for (DoublyNode i = head.next; i != head; i = i.next) {
            System.out.print(i.data + " ");
        }
    }

}
