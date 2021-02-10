package linkedListDs;

public class BeginInsertionDd {
    public static void main(String[] args) {
        DoublyNode head=null;
        head=beginInsertionDd(head,10);
        head=beginInsertionDd(head,20);
        head=beginInsertionDd(head,30);
        while (head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }

    public static DoublyNode beginInsertionDd(DoublyNode head, int data){
        DoublyNode temp=new DoublyNode(data);
        if (head==null)
            return temp;
        temp.next=head;
        head.prev=temp;
        return temp;
    }
}
