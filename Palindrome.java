package linkedListDs;

import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        CharNode head = new CharNode('r');
        head.next = new CharNode('a');
        head.next.next = new CharNode('d');
        head.next.next.next = new CharNode('a');
        head.next.next.next.next = new CharNode('r');
        System.out.println(palindrome(head));
        System.out.println(palindromeEff(head));
    }

    public static boolean palindrome(CharNode head) {
        Stack<Character> stack = new Stack<>();
        for (CharNode c = head; c != null; c = c.next) {
            stack.push(c.data);
        }
        for (CharNode c = head; c != null; c = c.next) {
            if (stack.pop() != c.data)
                return false;
        }
        return true;
    }

    public static boolean palindromeEff(CharNode head) {
        if (head == null || head.next == null)
            return true;
        CharNode fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        CharNode reversedRight = reverse(slow.next);
        CharNode curr = head;
        while (reversedRight != null) {
            if (reversedRight.data != curr.data)
                return false;
            reversedRight = reversedRight.next;
            curr = curr.next;
        }
        return true;
    }

    public static CharNode reverse(CharNode head) {
        if (head.next == null || head == null)
            return head;
        CharNode left = null, right = head, curr = head;
        while (curr != null) {
            right = curr.next;
            curr.next = left;
            left = curr;
            curr = right;
        }
        return left;
    }
}

class CharNode {
    char data;
    CharNode next;

    CharNode(char data) {
        this.data = data;
    }
}