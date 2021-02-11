package linkedListDs;

import java.util.Scanner;

public class CircularLinkedList {
    public static void main(String[] args) {
        CircularNode head = new CircularNode(10);
        head.next = new CircularNode(20);
        head.next.next = new CircularNode(30);
        head.next.next.next = new CircularNode(40);
        head.next.next.next.next = head;
        printCircular(head);
    }

    public static void printCircular(CircularNode head) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for while-loop 2 for for-loop and 3 for do-while-loop");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                CircularNode curr = head.next;
                System.out.print(head.data + " ");
                while (curr != head) {
                    System.out.print(curr.data + " ");
                    curr = curr.next;
                }
                break;
            case 2:
                System.out.print(head.data + " ");
                for (CircularNode i = head.next; i != head; i = i.next) {
                    System.out.print(i.data + " ");
                }
                break;
            case 3:
                CircularNode curr2 = head;
                do {
                    System.out.print(curr2.data + " ");
                    curr2 = curr2.next;
                } while (curr2 != head);
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}

class CircularNode {
    int data;
    CircularNode next;

    CircularNode(int data) {
        this.data = data;
    }
}
