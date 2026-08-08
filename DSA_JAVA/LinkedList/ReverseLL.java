package LinkedList;

public class ReverseLL {
    public static Node arrayToLL(int[] a){
        Node head=new Node(a[0]);
        Node curr=head;
        for(int i=1;i<a.length;i++){
            Node t=new Node(a[i]);
            curr.next=t;
            curr=t;
        }
        return head;
    }
    public static void print(Node head){
        Node t=head;
        while(t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
        System.out.println();
    }
    public static Node reverse(Node head){
        Node p=head; Node c=head.next;
        while(c!=null){
            Node next=c.next;
            c.next=p;
            p=c; c=next;
        }
        head.next=null; // AT LAST HEAD IS THE LAST NODE
        head=p; // MAKE PREV NODE AS HEAD , AS C BECAME NULL NOW
        return head;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        Node head=arrayToLL(a);
        print(head);
        head=reverse(head);
        print(head);
    }
}
