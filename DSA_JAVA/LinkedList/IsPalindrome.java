package LinkedList;

public class IsPalindrome {
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
    public static Node reverse(Node head){
        Node p=head; Node c=head.next;
        while(c!=null){
            Node next=c.next;
            c.next=p;
            p=c; c=next;
        }
        head.next=null; // AT LAST HEAD IS THE LAST NODE
        head=p; // MAKE PREV NODE AS HEAD , AS C BECAME NULL NOW
        return head;
    }
    // MIDDLE FOR EVEN BE THE SMALLER OF TWO MIDS
    public static Node mid(Node head){
        Node f=head; Node s=head;
        while(f.next!=null && f.next.next!=null){
            f=f.next.next; s=s.next;
        }
        return s;
    }
    public static boolean isPal(Node head){
        if(head==null || head.next==null){return true;}
        //FIND MID
        Node mid=mid(head);
        // REVERSE THE SECOND HALF => AFTER MID
        Node secondHalfh=reverse(mid.next); Node secondHalf=secondHalfh;
        Node firstHalf=head;
        // NOW CHECK BOTH HALVES
        while(secondHalf!=null){
            if(firstHalf.data!=secondHalf.data){return false;}
            firstHalf=firstHalf.next; secondHalf=secondHalf.next;
        }
        // MAKE LL AS DEFAULT BY AGAIN REVERSING THE SECOND HALF
        reverse(secondHalfh);
        return true;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,2,1}; int[] a1={1,2,3,3,2,1}; int[] a3={1,2,3,3,2};
        Node h1=arrayToLL(a);
        print(h1);
        System.out.println(isPal(h1));
        Node h2=arrayToLL(a1);
        print(h2);
        System.out.println(isPal(h2));
        Node h3=arrayToLL(a3);
        print(h3);
        System.out.println(isPal(h3));
    }
}
