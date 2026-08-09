package LinkedList;

public class DeleteAllOccurencesKeyDLL {
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
    public static DNode func(DNode head,int key){
        DNode t=head;
        while(t!=null){
            if(t.data==key){
                if(t==head){
                    head=head.next; t=head;
                }
                else{
                    DNode n=t.next; DNode p=t.prev;
                    if(n!=null){n.prev=p;}
                    if(p!=null){p.next=n;}
                    t=n;
                }
            }
            else{
                t=t.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        int[] a={10,4,10,10,6,10};
        DNode head=arrayToLL(a);
        print(head);
        int key=10;
        head=func(head,key);
        print(head);
    }
}
