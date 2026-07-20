package SlidingWindow_TwoPointer;
import java.util.Arrays;

public class CountSubstringsContainingAll3 {
    // Count no of substrings which contains all three characters a,b,c
    // APPROACH : with every character there is a substring that ends
    public static void main(String[] args) {
        String s="bbacba"; int n=s.length();
        int c=0; int r=0; int[] a=new int[3];
        Arrays.fill(a,-1);
        while(r<n){
            a[s.charAt(r)-'a']=r; // storing last seen of character
            if(a[0]!=-1 && a[1]!=-1 && a[2]!=-1){
                c+=1+Math.min(a[0],Math.min(a[1],a[2]));
            }
            r++;
        }
        System.out.println(c);
    }
}
