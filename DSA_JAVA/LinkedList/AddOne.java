package LinkedList;

public class AddOne {
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
    public static Node add1(Node head){
        int c=helper(head);
        if(c==1){
            Node newn=new Node(1);
            newn.next=head;
            head=newn;
        }
        return head;
    }

    private static int helper(Node head) {
        if(head==null){return 1;}
        int c=helper(head.next);
        head.data+=c;
        if(head.data<10){return 0;}
        head.data=0;
        return 1;
    }

    public static void main(String[] args) {
        int[] a={9,9,9};
        Node head=arrayToLL(a);
        print(head);
        head=add1(head);
        print(head);
    }
}
