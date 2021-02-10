package linkedListDs;

public class EndDeletion {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head=endDeletion(head);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static Node endDeletion(Node head){
        if (head==null||head.next==null)
            return null;
        Node curr=head;
        while (curr.next.next!=null)
            curr=curr.next;
        curr.next=null;
        return head;
    }
}
