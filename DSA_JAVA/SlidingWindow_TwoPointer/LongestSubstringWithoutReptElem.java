package SlidingWindow_TwoPointer;
import java.util.HashMap;

public class LongestSubstringWithoutReptElem {
    public static void main(String[] args) {
        // Longest Substring without Repeating Element
        // TC : O(N)
        String s="cadbzabcd"; int n=s.length();
        int l=0; int r=0; int length=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(r<n){
            if(map.containsKey(s.charAt(r))){
                l=Math.max(l,map.get(s.charAt(r))+1);
            }
            map.put(s.charAt(r),r);
            length=Math.max(length,r-l+1);
            r++;
        }
        System.out.println(length);
    }
}
