package linkedListDs;

public class BeginningInsertion {
    public static void main(String[] args) {
        Node head=null;
        head=insertionAtBeginning(head,30);
        head=insertionAtBeginning(head,20);
        head=insertionAtBeginning(head,10);
        while (head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    public static Node insertionAtBeginning(Node head, int x){
        Node curr=new Node(x);
        curr.next=head;
        return curr;
    }
}
