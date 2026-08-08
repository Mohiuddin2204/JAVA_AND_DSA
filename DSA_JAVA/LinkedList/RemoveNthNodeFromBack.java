package LinkedList;

public class RemoveNthNodeFromBack {
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
    public static Node removeNBack(Node head,int k){
        // MOVE FAST POINTER K TIMES (MOVED K)
        Node fast=head;
        for(int i=0;i<k;i++){
            fast=fast.next;
        }
        if(fast==null){head=head.next; return head;}// IF K=LENGTH , IT MEANS REMOVING HEAD
        //NOW MOVE SLOW AND FAST POINTER ONE BY ONE UNTIL FAST GOES TILL LAST NODE
        // MOVING (N-K) TIMES FROM FRONT => SO TO DELETE NODE K FROM BACK
        Node slow=head;
        while(fast.next!=null){
            fast=fast.next; slow=slow.next;
        }
        //slow will be at prev node of nth node from back
        slow.next=slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8}; int k=2;
        Node head=arrayToLL(a);
        print(head);
        head=removeNBack(head,k);
        print(head);
    }
}
