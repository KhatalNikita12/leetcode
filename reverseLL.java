public class reverseLL {
    public Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void main(String[] args) {
        reverseLL r=new reverseLL();
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        Node newHead=r.reverse(head);
        while(newHead!=null){
            System.out.print(newHead.data+" ");
            newHead=newHead.next;
        }
    }
}

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}