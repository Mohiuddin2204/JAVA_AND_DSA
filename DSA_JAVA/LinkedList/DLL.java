package LinkedList;
public class DLL {
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
    public static boolean search(DNode head, int x){
        DNode t=head;
        while(t!=null){
            if(t.data==x){return true;}
            t=t.next;
        }
        return false;
    }
    public static DNode deleteHead(DNode head){
        if(head==null){return head;}
        DNode t=head;
        head=head.next;
        head.prev=null; t.next=null;
        return head;
    }
    public static DNode deleteTail(DNode head){
        if(head==null || head.next==null){return null;}
        DNode t=head;
        while(t.next!=null){
            t=t.next;
        }
        t.prev.next=null;
        t.prev=null;
        return head;
    }
    public static DNode deleteKthElement(DNode head, int k){ // 1 based indexing suppose
        //Base Edge cases
        if(head==null){return head;}
        int c=0;
        DNode t=head;
        while (t!=null){
            c++;
            if(c==k){break;}
            t=t.next;
        }
        DNode p=t.prev;DNode f=t.next;
        if(p==null && f==null){return null;} // single element case
        else if(p==null){ // head case
            head=head.next; head.prev=null;t.next=null;return head;
        }
        else if(f==null){ //tail case
            p.next=null; t.prev=null; return null;
        }
        else{ // anywhere in middle
            p.next=f; f.prev=p; t.prev=null; t.next=null; return head;
        }
    }
    public static DNode insertHead(DNode head, int v){
        DNode t=new DNode(v);
        t.next=head; head.prev=t;
        head=t;
        return head;
    }
    public static DNode insertTail(DNode head, int v){
        DNode t=new DNode(v);
        DNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=t; t.prev=temp;
        return head;
    }
    public static DNode insertAtKthPosition(DNode head, int k, int v){
        DNode n=new DNode(v);
        if(head==null){
            if(k==1){head=n; return head;}
            else{return head;}
        }
        int c=0; DNode t=head;
        while(t!=null){
            c++;
            if(c==k){break;}
            t=t.next;
        }
        DNode p=t.prev;
        if(p==null){ // insert at head : k==1
            n.next=head; head.prev=n; return head;
        }
        n.next=t; n.prev=p; p.next=n; t.prev=n;
        return head;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,10};
        DNode head=arrayToLL(a);
        // System.out.println(head.next.data);
        System.out.println("DOUBLY LINKED LIST:");
        print(head);
        System.out.println(search(head,4));
        System.out.println("deleting head : 1");
        head=deleteHead(head);
        print(head);
        System.out.println("deleting tail : 10");
        head=deleteTail(head);
        print(head);
        System.out.println("deleting 4th element : 5");
        head=deleteKthElement(head,4);
        print(head);
        System.out.println("inserting new head : 1");
        head=insertHead(head,1);
        print(head);
        System.out.println("inserting at tail :10");
        head=insertTail(head,10);
        print(head);
        System.out.println("inserting at position 5 : 5");
        head=insertAtKthPosition(head,5,5);
        print(head);
    }
}
