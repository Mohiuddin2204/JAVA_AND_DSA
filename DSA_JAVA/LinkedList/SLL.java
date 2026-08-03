package LinkedList;
class Node{
    int data;
    Node next;
    Node(int data) {
        this.data=data;
        this.next=null;
    }
}
public class SLL {
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
    public static boolean search(Node head,int x){
        Node t=head;
        while(t!=null){
            if(t.data==x){return true;}
            t=t.next;
        }
        return false;
    }
    public static Node deleteHead(Node head){
        if(head==null){return head;}
        head=head.next;
        return head;
    }
    public static Node deleteTail(Node head){
        if(head==null || head.next==null){return null;}
        Node t=head;
        while(t.next.next!=null){
            t=t.next;
        }
        t.next=null;
        return head;
    }
    public static Node deleteKthElement(Node head,int k){ // 1 based indexing suppose
        //Base Edge cases
        if(head==null){return head;}
        if(k==1){head=head.next; return head;}
        int c=0;Node t=head;Node p=null;
        while (t!=null){
            c++;
            if(c==(k-1)){  // At the node before kth node
                t.next=t.next.next;break;
            }
            t=t.next;
        }
        return head;
    }
    public static Node deleteValue(Node head,int v){
        if(head==null){return head;}
        if(head.data==v){head=head.next; return head;}
        Node t=head; Node p=null; // node p will be before t
        while(t!=null){
            if(t.data==v){
                p.next=p.next.next; break;
            }
            p=t; t=t.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,10};
        Node head=arrayToLL(a);
       // System.out.println(head.next.data);
        print(head);
        System.out.println(search(head,4));
        head=deleteHead(head);
        print(head);
        head=deleteTail(head);
        print(head);
        head=deleteKthElement(head,4);
        print(head);
        head=deleteValue(head,8);
        print(head);
    }
}
