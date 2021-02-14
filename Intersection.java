package linkedListDs;

import java.util.ArrayList;

public class Intersection {
    public static void main(String[] args) {
        Node h1 = new Node(10);
        h1.next = new Node(20);
        h1.next.next = new Node(30);
        h1.next.next.next = new Node(40);
        h1.next.next.next.next = new Node(50);
        Node h2 = new Node(15);
        h2.next = new Node(25);
        h2.next.next = h1.next.next.next;
        System.out.println(intersection(h1, h2));
        System.out.println(intersectionEff(h1, h2));
    }

    public static int intersection(Node h1, Node h2) {
        if (h1 == null || h2 == null)
            return -1;
        ArrayList<Node> arrayList = new ArrayList<>();
        for (Node i = h1; i != null; i = i.next)
            arrayList.add(i);
        for (Node i = h2; i != null; i = i.next) {
            if (arrayList.contains(i))
                return i.data;
        }
        return -1;
    }

    public static int intersectionEff(Node bigList, Node smallList) {
        if (bigList == null || smallList == null)
            return -1;
        Node curr1 = bigList;
        int c1 = 0;
        Node curr2 = smallList;
        int c2 = 0;
        for (Node i = curr1; i != null; i = i.next) {
            c1++;
            curr1 = curr1.next;
        }
        for (Node i = curr2; i != null; i = i.next) {
            c2++;
            curr2 = curr2.next;
        }
        int abs = Math.abs(c1 - c2);
        curr1 = bigList;
        curr2 = smallList;
        for (int i = 0; i < abs; i++)
            curr1 = curr1.next;
        while (curr1 != null && curr2 != null) {
            if (curr1 == curr2)
                return curr1.data;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return -1;
    }
}
