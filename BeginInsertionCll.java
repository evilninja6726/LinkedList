package linkedListDs;

public class BeginInsertionCll {
    public static void main(String[] args) {
        CircularNode head = null;
        head = beginInsertionCll(head, 10);
        head = beginInsertionCll(head, 20);
        head = beginInsertionCll(head, 30);
        printCircular(head);
        System.out.println();
        CircularNode head2 = null;
        head2 = beginInsertionCllEff(head2, 10);
        head2 = beginInsertionCllEff(head2, 20);
        head2 = beginInsertionCllEff(head2, 30);
        printCircular(head2);
    }

    public static void printCircular(CircularNode head) {
        System.out.print(head.data + " ");
        for (CircularNode i = head.next; i != head; i = i.next)
            System.out.print(i.data + " ");
    }

    public static CircularNode beginInsertionCll(CircularNode head, int data) {
        CircularNode temp = new CircularNode(data);
        if (head == null) {
            temp.next = temp;
            return temp;
        }
        CircularNode curr = head;
        while (curr.next != head)
            curr = curr.next;
        temp.next = head;
        curr.next = temp;
        return temp;
    }

    public static CircularNode beginInsertionCllEff(CircularNode head, int data) {
        CircularNode temp = new CircularNode(data);
        if (head == null) {
            temp.next = temp;
            return temp;
        }
        temp.next = head.next;
        head.next = temp;

        int t = head.data;
        head.data = temp.data;
        temp.data = t;
        return head;
    }
}
