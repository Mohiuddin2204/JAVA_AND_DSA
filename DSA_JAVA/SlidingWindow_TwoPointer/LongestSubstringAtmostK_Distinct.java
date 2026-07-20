package SlidingWindow_TwoPointer;
import java.util.HashMap;

public class LongestSubstringAtmostK_Distinct {
    public static void main(String[] args) {
        String s="aaabbccd"; int n=s.length(); int k=2;
        int l=0; int r=0; int length=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(r<n){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            if(map.size()<=k){
                length=Math.max(length,r-l+1);
            }
            else{  // MOVING L BY JUST ONCE , KEEPING MAX LENGTH INTACT
                map.put(s.charAt(l),map.getOrDefault(s.charAt(l),0)-1);
                if(map.get(s.charAt(l))==0){
                    map.remove(s.charAt(l));
                }
                l++;
            }
            r++;
        }
        System.out.println(length);
    }
}
