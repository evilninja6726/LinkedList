package linkedListDs;

public class RecursiveDisplay {
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        printListRecursion(head);
    }
    public static void printListRecursion(Node head){
        Node curr=head;
        if (curr==null)
            return;
        System.out.print(curr.data+" ");
        printListRecursion(curr.next);
    }
}
