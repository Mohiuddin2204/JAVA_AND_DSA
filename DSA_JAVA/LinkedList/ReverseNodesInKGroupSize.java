package LinkedList;

public class ReverseNodesInKGroupSize {
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
    public static Node func(Node head,int k){
        Node t=head; Node prevn=null;
        while(t!=null){
            Node kthNode=findK(t,k);
            // For the last group if its size is <k , then no need to reverse just attach it
            if(kthNode==null){if(prevn!=null) prevn.next=t; break;}
            Node nextn=kthNode.next; // start of next group (preserving)
            //For a groups last node(kth node) => making it's next as null
            // As to reverse a particular group
            kthNode.next=null;
            kthNode=reverse(t); // after reversing new head will be kth node
            if(t==head) {head=kthNode;} // for first instance => changing head
            else{ prevn.next=kthNode;} // prevn is last node of previous reversed group
            prevn=t; // when reversed :  t<->kth-node interchanges : start=>kth , end=t for a group
            t=nextn;
        }
        return head;
    }
    public static Node findK(Node t,int k){
        k-=1;
        while(t!=null && k>0){
            k--; t=t.next;
        }
        return t;
    }
    public static Node reverse(Node head){
        if(head==null || head.next==null){return head;}
        Node p=null; Node c=head;
        while(c!=null){
            Node next=c.next;
            c.next=p;
            p=c; c=next;
        }
        head=p; // MAKE PREV NODE AS HEAD , AS C BECAME NULL NOW
        return head;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,10}; int k=3;
        Node head=arrayToLL(a);
        print(head);
        head=func(head,k);
        print(head);
    }
}
