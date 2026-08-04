package LinkedList;
public class SLL {
    public static DNode arrayToLL(int[] a){
        DNode head=new DNode(a[0]);
        DNode curr=head;
        for(int i=1;i<a.length;i++){
            DNode t=new DNode(a[i]);
            curr.next=t;
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
        head=head.next;
        return head;
    }
    public static DNode deleteTail(DNode head){
        if(head==null || head.next==null){return null;}
        DNode t=head;
        while(t.next.next!=null){
            t=t.next;
        }
        t.next=null;
        return head;
    }
    public static DNode deleteKthElement(DNode head, int k){ // 1 based indexing suppose
        //Base Edge cases
        if(head==null){return head;}
        if(k==1){head=head.next; return head;}
        int c=0;
        DNode t=head;
        while (t!=null){
            c++;
            if(c==(k-1)){  // At the node before kth node
                t.next=t.next.next;break;
            }
            t=t.next;
        }
        return head;
    }
    public static DNode deleteValue(DNode head, int v){
        if(head==null){return head;} boolean f=false;
        if(head.data==v){head=head.next; return head;}
        DNode t=head; DNode p=null; // node p will be before t
        while(t!=null){
            if(t.data==v){
                f=true;
                p.next=p.next.next; break;
            }
            p=t; t=t.next;
        }
        if(!f){
            System.out.println("no v in linked list");
        }
        return head;
    }
    public static DNode insertHead(DNode head, int v){
        DNode t=new DNode(v);
        t.next=head;
        head=t;
        return head;
    }
    public static DNode insertTail(DNode head, int v){
        DNode t=new DNode(v);
        DNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=t;
        return head;
    }
    public static DNode insertAtKthPosition(DNode head, int k, int v){
        DNode n=new DNode(v);
        if(head==null){
            if(k==1){head=n; return head;}
            else{return head;}
        }
        if(k==1){
            n.next=head; head=n; return head;
        }
        int c=0; DNode t=head;
        while(t!=null){
            c++;
            if(c==(k-1)){
                n.next=t.next;
                t.next=n; break;
            }
            t=t.next;
        }
        return head;
    }
    public static DNode insertBeforeX(DNode head, int x, int v){
        DNode n=new DNode(v); boolean f=false;
        if(head==null){return head;}
        if(head.data==x){n.next=head; head=n; return head;}
        DNode t=head; DNode p=null;  // node p is before node having 'x' data
        while(t!=null){
            if(t.data==x){
                f=true;
                n.next=t;
                p.next=n; break;
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
        DNode head=arrayToLL(a);
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
