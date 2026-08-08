package SlidingWindow_TwoPointer;
import java.util.*;
// for every subarray of size k : find its maximum element : return list
public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] a={1,3,-1,-3,5,3,6,7}; int k=3; int n=a.length;
        int[] r=new int[n-k+1]; int ri=0;
        Deque<Integer> dq=new ArrayDeque<>(); // Maintaining (decreasing fashion) deque of size k
        // deque consists of array indices
        // will be returning deque first element for every window of size k
        for(int i=0;i<n;i++){
            // Should maintain deque size k
            if(!dq.isEmpty() && dq.peekFirst()==(i-k)){
                dq.pollFirst();
            }
            // Should maintain deque -> decreasing fashion
            while(!dq.isEmpty() && a[dq.peekLast()]<a[i]){
                dq.pollLast();
            }
            // Add current element at last (if its highest then automatically it will be first of deque)
            dq.offerLast(i);
            if(i>=(k-1)){
                r[ri++]=a[dq.peekFirst()];
            }
        }
        for(int i:r){
            System.out.print(i+" ");
        }
    }
}
