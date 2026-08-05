package LinkedList;

public class Sort012LL {
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
    public static Node sort012ll(Node head){
        if(head==null || head.next==null){return head;}
        Node zeroh=new Node(-1); Node oneh=new Node(-1); Node twoh=new Node(-1);
        Node zero=zeroh; Node one=oneh; Node two=twoh;
        Node t=head;
        while(t!=null){
            if(t.data==0){
                zero.next=t;zero=t;
            }
            else if(t.data==1){
                one.next=t;one=t;
            }
            else{
                two.next=t;two=t;
            }
            t=t.next;
        }
        two.next=null; one.next=twoh.next; zero.next=oneh.next;
        head=zeroh.next;
        return head;
    }
    public static void main(String[] args) {
        int[] a={1,0,1,2,0,2,1};
        Node head=arrayToLL(a);
        print(head);
        head=sort012ll(head);
        print(head);
    }
}
