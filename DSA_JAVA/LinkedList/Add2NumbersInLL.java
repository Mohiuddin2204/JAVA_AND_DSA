package LinkedList;

public class Add2NumbersInLL {
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
    // If 2 LL are 2-4-6-X , 3-5-7-X
    // Numbers given to us are in reverse order => o/p = 642+753 = 1425
    // return new LL = 5-2-4-1-X (same reverse way)
    public static Node add2numLL(Node head1,Node head2){
        Node t1=head1; Node t2=head2;
        Node dummy=new Node(-1);
        Node cur=dummy;
        int c=0;
        while(t1!=null || t2!=null){
            int sum=c;
            if(t1!=null){sum+=t1.data;}
            if(t2!=null){sum+=t2.data;}
            Node n=new Node(sum%10);
            c=sum/10;
            cur.next=n;
            cur=n;
            if(t1!=null){t1=t1.next;} if(t2!=null){t2=t2.next;}
        }
        if(c!=0){
            Node n=new Node(c); cur.next=n;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        int[] a1={3,5};
        Node head1=arrayToLL(a1);
        print(head1);
        int[] a2={4,5,9,9};
        Node head2=arrayToLL(a2);
        print(head2);
        Node newhead=add2numLL(head1,head2);
        print(newhead);
    }
}
