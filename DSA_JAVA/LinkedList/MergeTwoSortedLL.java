package LinkedList;

public class MergeTwoSortedLL {
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
    public static void main(String[] args) {
        int[] a1={2,4,8,10}; Node h1=arrayToLL(a1); print(h1);
        int[] a2={1,3,3,6,11,14}; Node h2=arrayToLL(a2); print(h2);
        Node head=merge(h1,h2); print(head);
    }
}
