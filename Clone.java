package linkedListDs;

import org.w3c.dom.Node;

import java.util.HashMap;

class CloneClass {
    int data;
    CloneClass next, random;

    CloneClass(int data) {
        this.data = data;
    }
}

public class Clone {
    public static void main(String[] args) {
        CloneClass head = new CloneClass(10);
        head.next = new CloneClass(5);
        head.next.next = new CloneClass(20);
        head.next.next.next = new CloneClass(15);
        head.next.next.next.next = new CloneClass(20);

        head.random = head.next.next;
        head.next.random = head.next.next.next;
        head.next.next.random = head;
        head.next.next.next.random = head.next.next;
        head.next.next.next.next.random = head.next.next.next;

        CloneClass clone = clone(head);
        while (clone != null) {
            System.out.println(clone.data + " " + clone.random.data + " ");
            clone = clone.next;
        }

        CloneClass temp = cloneEff(head);
        while (temp != null) {
            System.out.println(temp.data + " " + temp.random.data + " ");
            temp = temp.next;
        }
    }

    public static CloneClass clone(CloneClass head) {
        if (head == null)
            return head;
        HashMap<CloneClass, CloneClass> hashMap = new HashMap<>();
        for (CloneClass i = head; i != null; i = i.next) {
            hashMap.put(i, new CloneClass(i.data));
        }
        CloneClass clone = null;
        for (CloneClass i = head; i != null; i = i.next) {
            clone = hashMap.get(i);
            clone.next = hashMap.get(i.next);
            clone.random = hashMap.get(i.random);
        }
        CloneClass head2 = hashMap.get(head);
        return head2;
    }

    public static CloneClass cloneEff(CloneClass head) {
        if (head == null)
            return head;
        CloneClass curr = head;
        while (curr != null) {
            CloneClass temp = new CloneClass(curr.data);
            temp.next = curr.next;
            curr.next = temp;
            curr = temp.next;
        }
        for (CloneClass i = head; i != null; i = i.next.next) {
            i.next.random = (i.random != null) ? i.random.next : null;
        }
        CloneClass original = head;
        CloneClass copy = head.next;
        CloneClass temp = copy;
        while (original != null && copy != null) {
            original.next = (original.next != null) ? original.next.next : original.next;
            copy.next = (copy.next != null) ? copy.next.next : copy.next;
            original = original.next;
            copy = copy.next;
        }
        return temp;
    }
}