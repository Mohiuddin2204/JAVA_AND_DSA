package LinkedList;

public class RemoveDuplicatesFromSortedDLL {
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
    public static DNode func(DNode head){
        DNode t=head;
        while(t!=null && t.next!=null){
            DNode n=t.next;
            while(n!=null && n.data==t.data){
                n=n.next;
            }
            t.next=n; if(n!=null){n.prev=t;}
            t=t.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] a={1,1,1,2,3,3,4};
        DNode head=arrayToLL(a);
        print(head);
        head=func(head);
        print(head);
    }
}
