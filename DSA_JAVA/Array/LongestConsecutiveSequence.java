package Array;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] a={100,102,100,101,101,4,5,6,3,2,3,2,1,1,1,2};
        HashSet<Integer> hs=new HashSet<>();
        for(int i:a){
            hs.add(i);
        }
        int l=1;
        //starting from element who is start of a particular sequence
        for(int i:hs){
            int c=1;
            if(!hs.contains(i-1)){
                int x=i+1;
                while(hs.contains(x)){
                    c++;x++;
                }
            }
            l=Math.max(l,c);
        }
        System.out.println("l= "+l);
    }
}
