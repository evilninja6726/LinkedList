package linkedListDs;

public class EndInsertion {
    public static void main(String[] args) {
        Node head=null;
        head=endInsertion(head,30);
        head=endInsertion(head,20);
        head=endInsertion(head,10);
        while (head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

    public static Node endInsertion(Node head, int x){
        Node temp=new Node(x);
        if (head==null)
            return temp;
        Node curr=head;
        while (curr.next!=null)
            curr=curr.next;
        curr.next=temp;
        return head;

    }
}
