package LinkedList;

public class Middle {
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
    //If length of LL is even , then return Higher of two mids
    public static int mid(Node head){
        if(head==null){return -1;}
        if(head.next==null){return head.data;}
        Node f=head; Node s=head;
        while(f!=null && f.next!=null){
            f=f.next.next; s=s.next;
        }
        return s.data;
    }
    // IF PROBLEM WAS TO DELETE THE MIDDLE NODE => WE HAVE TO REACH ONE NODE BEFORE MID
    // FOR THIS SKIP THE SLOW POINTER FIRST STEP AND DO ACCORDINGLY AS ABOVE
    public static Node deleteMid(Node head){
        if(head==null || head.next==null){return null;}
        Node f=head; Node s=head;
        f=f.next.next;
        while(f!=null && f.next!=null){
            f=f.next.next; s=s.next;
        }
        //NOW SLOW WILL BE AT ONE NODE BEFORE MID
        s.next=s.next.next;
        return head;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7};
        Node head=arrayToLL(a);
        print(head);
        System.out.println(mid(head));
        head=deleteMid(head);
        print(head);
        int[] a2={1,2,3,4,5,6};
        Node h2=arrayToLL(a2);
        print(h2);
        h2=deleteMid(h2);
        print(h2);
    }
}
