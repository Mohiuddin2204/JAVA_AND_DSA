package LinkedList;
import java.util.*;

public class PairsWithSumDLL {
    public static DNode arrayToLL(int[] a){
        DNode head=new DNode(a[0]);
        DNode curr=head;
        for(int i=1;i<a.length;i++){
            DNode t=new DNode(a[i]);
            curr.next=t;
            t.prev=curr;
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
    // SIMILAR TECHNIQUE OF TWO SUM , FIRST FIND TAIL AND THEN DO TWO POINTER
    public static List<List<Integer>> func(DNode head,int sum){
        List<List<Integer>> ds=new ArrayList<>();
        DNode l=head; DNode r=tail(head);
        while(l.data<r.data){
            if(l.data+r.data ==sum){
                List<Integer> list=new ArrayList<>();
                list.add(l.data); list.add(r.data);
                ds.add(list);
                l=l.next; r=r.prev;
            }
            else if(l.data+r.data <sum){
                l=l.next;
            }
            else{
                r=r.prev;
            }
        }
        return ds;
    }
    public static DNode tail(DNode head){
        DNode t=head;
        while(t.next!=null){
            t=t.next;
        }
        return t;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,9}; int sum=5;
        DNode head=arrayToLL(a);
        print(head);
        System.out.println(func(head,sum));
    }
}
