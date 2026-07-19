package SlidingWindow_TwoPointer;

import java.util.HashMap;

public class CountSubarraySumK {
    public static void main(String[] args) {
        int[] a={1,2,3,-3,1,1,1,4,2,-3}; int sum=3;
        HashMap<Integer,Integer> map=new HashMap<>();
        int prefixsum=0; int count=0;
        map.put(0,1); // as empty subarray sum=0
        for(int i=0;i<a.length;i++){
            prefixsum+=a[i];
            int rem=prefixsum-sum;
            count+=map.getOrDefault(rem,0);
            map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
        }
        System.out.println(count);
    }
}
