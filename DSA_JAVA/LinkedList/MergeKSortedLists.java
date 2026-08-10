package LinkedList;
import java.util.*;

public class MergeKSortedLists {
    public static Node arrayToLL(int[] a){
        if (a == null || a.length == 0) return null;
        Node head = new Node(a[0]);
        Node curr = head;
        for(int i = 1; i < a.length; i++){
            Node t = new Node(a[i]);
            curr.next = t;
            curr = t;
        }
        return head;
    }
    public static void print(Node head){
        Node t = head;
        while(t != null){
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }
    public static Node mergeKLists(List<Node> lists) {
        if (lists == null || lists.isEmpty()) return null;
        PriorityQueue<Node> minHeap = new PriorityQueue<>((n1, n2) -> n1.data-n2.data);
        //MIN HEAP
        // FIRST OF ALL JUST STORE HEADS
        for (Node head : lists) {
            if (head != null) {
                minHeap.add(head);
            }
        }
        Node dummy = new Node(-1);
        Node tail = dummy;
        while (!minHeap.isEmpty()) {
            Node smallest = minHeap.poll();
            tail.next = smallest;
            tail = smallest;
            // AFTER REMOVING FIRST NODE OF A LIST=> ADD ITS NEXT TO MIN HEAP
            if (smallest.next != null) {
                minHeap.add(smallest.next);
            }
        }
        return dummy.next;
    }
    // TC : O(KN)
    public static void main(String[] args) {
        int[] a1 = {2, 4, 6};int[] a2 = {1, 5};int[] a3 = {1, 1, 3, 7};int[] a4 = {8};
        Node h1 = arrayToLL(a1);Node h2 = arrayToLL(a2);Node h3 = arrayToLL(a3);Node h4 = arrayToLL(a4);
        List<Node> lists = new ArrayList<>();
        lists.add(h1);lists.add(h2);lists.add(h3);lists.add(h4);
        Node mergedHead = mergeKLists(lists);
        print(mergedHead);
    }
}
