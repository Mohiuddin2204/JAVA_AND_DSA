package SlidingWindow_TwoPointer;
import java.util.HashMap;

public class LongestSubarrayWithSumK {
    // ARRAY CONTAINS POSITIVES + NEGATIVES
    // OPTIMAL APPROACH WILL BE HASHMAP AND PREFIX SUM
    public static void main(String[] args) {
        int[] a={1,2,3,1,1,1,1,4,2,3}; int sum=3; int s=0;
        int length=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            s+=a[i];
            if(s==i){length=Math.max(length,i+1);}
            int rem=s-sum;
            if(map.containsKey(rem)){
                int l=i-map.get(rem);
                length=Math.max(length,l);
            }
            if(!map.containsKey(s)){
                map.put(s,i);
            }
        }
        System.out.println(length);
    }
}
