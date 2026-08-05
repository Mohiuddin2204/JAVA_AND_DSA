package LinkedList;

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

    public static boolean search(Node head, int x){
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

    public static Node deleteKthElement(Node head, int k){
        // 1 based indexing suppose
        //Base Edge cases
        if(head==null){return head;}
        if(k==1){head=head.next; return head;}
        int c=0;
        Node t=head;
        while (t!=null){
            c++;
            if(c==(k-1)){ // At the node before kth node
                t.next=t.next.next;break;
            }
            t=t.next;
        }
        return head;
    }

    public static Node deleteValue(Node head, int v){
        if(head==null){return head;}
        boolean f=false;
        if(head.data==v){head=head.next; return head;}
        Node t=head;
        Node p=null; // node p will be before t
        while(t!=null){
            if(t.data==v){
                f=true;
                p.next=p.next.next;
                break;
            }
            p=t;
            t=t.next;
        }
        if(!f){
            System.out.println("no v in linked list");
        }
        return head;
    }

    public static Node insertHead(Node head, int v){
        Node t=new Node(v);
        t.next=head;
        head=t;
        return head;
    }

    public static Node insertTail(Node head, int v){
        Node t=new Node(v);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=t;
        return head;
    }

    public static Node insertAtKthPosition(Node head, int k, int v){
        Node n=new Node(v);
        if(head==null){
            if(k==1){head=n; return head;}
            else{return head;}
        }
        if(k==1){
            n.next=head;
            head=n;
            return head;
        }
        int c=0;
        Node t=head;
        while(t!=null){
            c++;
            if(c==(k-1)){
                n.next=t.next;
                t.next=n;
                break;
            }
            t=t.next;
        }
        return head;
    }

    public static Node insertBeforeX(Node head, int x, int v){
        Node n=new Node(v);
        boolean f=false;
        if(head==null){return head;}
        if(head.data==x){n.next=head; head=n; return head;}
        Node t=head;
        Node p=null; // node p is before node having 'x' data
        while(t!=null){
            if(t.data==x){
                f=true;
                n.next=t;
                p.next=n;
                break;
            }
            p=t;
            t=t.next;
        }
        if(!f){
            System.out.println("no x in linked list");
        }
        return head;
    }
public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,10};
        Node head=arrayToLL(a);
       // System.out.println(head.next.data);
        System.out.println("LINKED LIST:");
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
        System.out.println("deleting value 8:");
        head=deleteValue(head,8);
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
        System.out.println("inserting before 9 : 8");
        head=insertBeforeX(head,9,8);
        print(head);
    }
}
