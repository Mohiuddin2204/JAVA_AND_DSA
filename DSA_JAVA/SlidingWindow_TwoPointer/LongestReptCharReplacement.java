package SlidingWindow_TwoPointer;
import java.util.HashMap;

public class LongestReptCharReplacement {
    // can convert any 2 characters with others
    // return longest repeating character then
    // IN AABABBA , here in starting 5 => convert B to A : return 5
    // APPROACH : LENGTH-MAX FREQUENCY <= K
    public static void main(String[] args) {
        String s="AABABBA"; int n=s.length(); int k=2; int length=0; int mf=0;
        int l=0; int r=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(r<n){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            mf=Math.max(mf,map.get(s.charAt(r)));
            if((r-l+1)-mf >k){
                map.put(s.charAt(l),map.getOrDefault(s.charAt(l),0)-1);
                l++;
            }
            length=Math.max(length,r-l+1);
            r++;
        }
        System.out.println(length);
    }
}
