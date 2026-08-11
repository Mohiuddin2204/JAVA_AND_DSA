package LinkedList;

public class SortLL {
    public static Node arrayToLL(int[] a){
        if (a == null || a.length == 0) return null;
        Node head = new Node(a[0]);
        Node curr = head;
        for(int i = 1; i < a.length; i++){
            Node t = new Node(a[i]);
            curr.next = t;
            curr = t;
        }
        return head;
    }
    public static void print(Node head){
        Node t = head;
        while(t != null){
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }
    public static Node merge(Node h1,Node h2){
        Node dummy=new Node(-1);
        Node t1=h1; Node t2=h2; Node t=dummy;
        while(t1!=null && t2!=null){
            if(t1.data<t2.data){
                t.next=t1;t=t1; t1=t1.next;
            }
            else{
                t.next=t2;t=t2; t2=t2.next;
            }
        }
        // AS ONE WILL BE STILL LEFT : JUST JOIN T WITH T1 OR T2 REMAINING
        if(t1!=null){
            t.next=t1;
        }
        if(t2!=null){
            t.next=t2;
        }
        return dummy.next;
    }
    public static Node mid(Node head){
        Node f=head; Node s=head;
        while(f.next!=null && f.next.next!=null){
            f=f.next.next; s=s.next;
        }
        return s;
    }
    // MERGE SORT ON LL , BREAK LL AT MID , AND DIVIDE TILL SINGLE NODES => THEN MERGE THEM
    public static Node mergesortLL(Node head){
        if(head==null || head.next==null){return head;}
        Node m=mid(head); Node lefth=head; Node righth=m.next;
        m.next=null;
        lefth=mergesortLL(lefth);righth= mergesortLL(righth);
        return merge(lefth,righth);
    }
    public static void main(String[] args) {
        int[] a={3,4,2,1,5}; Node head=arrayToLL(a); print(head);
        head=mergesortLL(head);
        print(head);
    }
}
