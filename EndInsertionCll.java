package linkedListDs;

public class EndInsertionCll {
    public static void main(String[] args) {
        CircularNode head = null;
        head = endInsertion(head, 10);
        head = endInsertion(head, 20);
        head = endInsertion(head, 30);
        printCircular(head);
        System.out.println();
        CircularNode head2 = null;
        head2 = endInsertionCllEff(head2, 10);
        head2 = endInsertionCllEff(head2, 20);
        head2 = endInsertionCllEff(head2, 30);
        printCircular(head2);
    }

    public static void printCircular(CircularNode head) {
        System.out.print(head.data + " ");
        for (CircularNode i = head.next; i != head; i = i.next)
            System.out.print(i.data + " ");
    }

    public static CircularNode endInsertion(CircularNode head, int data) {
        CircularNode temp = new CircularNode(data);
        if (head == null) {
            temp.next = temp;
            return temp;
        }

        CircularNode curr = head;
        while (curr.next != head)
            curr = curr.next;
        curr.next = temp;
        temp.next = head;
        return head;
    }

    public static CircularNode endInsertionCllEff(CircularNode head, int data) {
        CircularNode temp = new CircularNode(data);
        if (head == null) {
            temp.next = temp;
            return temp;
        }

        CircularNode curr = head;
        temp.next = head.next;
        head.next = temp;
        int t = head.data;
        head.data = temp.data;
        temp.data = t;
        return temp;
    }
}
