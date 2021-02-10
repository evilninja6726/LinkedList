package linkedListDs;

public class SearchKey {
    public static void main(String[] args) {
        Node h1 = null;

        Node h2 = new Node(10);

        Node h3 = new Node(20);
        h3.next = new Node(30);
        h3.next.next = new Node(40);
        h3.next.next.next = new Node(50);

        System.out.println(searchKeyIt(h1, 30));
        System.out.println(searchKeyIt(h2, 20));
        System.out.println(searchKeyIt(h2, 10));
        System.out.println(searchKeyIt(h3, 40));

        System.out.println(searchKeyRec(h3, 40));
        System.out.println(searchKeyRec(h3, 460));
    }

    public static int searchKeyIt(Node head, int key) {
        int pos = 1;
        Node curr = head;
        if (curr == null)
            return -1;
        if (curr.data == key)
            return 1;
        while (curr.next != null) {
            if (curr.data == key)
                return pos;
            else {
                pos++;
                curr = curr.next;
            }
        }
        return -1;
    }

    public static int searchKeyRec(Node head, int key) {
        Node curr = head;
        if (curr == null)
            return -1;
        if (curr.data == key)
            return 1;
        int pos = searchKeyIt(head.next, key);
        if (pos == -1)
            return -1;
        return pos + 1;
    }
}
