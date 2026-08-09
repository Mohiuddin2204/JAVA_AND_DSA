package LinkedList;

public class RightRotateLL {
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
    public static Node RRLL(Node head,int k){
        if(head==null || head.next==null || k==0) {return head;}
        int length=1; Node tail=head;
        while(tail.next!=null){
            length++; tail=tail.next;
        }
        if(k%length==0){return head;} k=k%length;
        tail.next=head;
        Node last=findN(head,length-k);
        head=last.next; //NEW HEAD
        last.next=null;
        return head;
    }
    public static Node findN(Node head,int n){
        // n= length-k
        int c=1;
        while(head!=null){
            if(c==n){
                return head;
            }
            c++; head=head.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5}; int k=2;
        Node head=arrayToLL(a);
        print(head);
        head=RRLL(head,k);
        print(head);
    }
}
