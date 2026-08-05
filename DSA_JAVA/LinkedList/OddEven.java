package LinkedList;

public class OddEven {
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
    // Given : 1-3-4-2-5-6-X
    // convert into : 1-4-5-3-2-6-X => group odd and even places nodes together
    public static Node oddEven(Node head){
        if(head==null || head.next==null){return head;}
        Node odd=head; Node even=head.next; Node evenh=head.next;
        while(even!=null && even.next!=null){
            odd.next=odd.next.next;
            even.next=even.next.next;
            odd=odd.next; even=even.next;
        }
        odd.next=evenh; // to connect final odd with start of even
        return head;
    }
    public static void main(String[] args) {
        int[] a={1,3,4,2,5,6};
        Node head=arrayToLL(a);
        print(head);
        head=oddEven(head);
        print(head);
    }
}
