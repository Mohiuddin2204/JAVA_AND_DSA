package LinkedList;

public class ReverseDLL {
    public static DNode arrayToLL(int[] a){
        DNode head=new DNode(a[0]);
        DNode curr=head;
        for(int i=1;i<a.length;i++){
            DNode t=new DNode(a[i]);
            curr.next=t;
            t.prev=curr;
            curr=t;
        }
        return head;
    }
    public static void print(DNode head){
        DNode t=head;
        while(t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
        System.out.println();
    }
    public static DNode reverse(DNode head){
        if(head==null || head.next==null){return head;}
        DNode l=null; DNode t=head;
        // REVERSE THE LINKS
        while(t!=null){
            l=t.prev;
            t.prev=t.next;
            t.next=l;
            t=t.prev;
        }
        head=l.prev;
        return head;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,10};
        DNode head=arrayToLL(a);
        System.out.println("DOUBLY LINKED LIST:");
        print(head);
        head=reverse(head);
        print(head);
    }
}
