package SlidingWindow_TwoPointer;

public class MaxConsecutiveOnesFlip {
    public static void main(String[] args) {
        // Allowed to flip at most k zeroes
        // Problem similar to the longest sub array with at most k zeroes (<=k)
        //TC : O(N)
        int[] a={1,1,1,0,0,0,1,1,1,1,0}; int k=2;
        int l=0; int r=0; int zeroes=0; int length=0;
        while(r<a.length){
            if(a[r]==0){zeroes++;}
            if(zeroes>k){  // here also moving L by one , by keeping Max length intact
                if(a[l]==0){zeroes--;}
                l++;
            }
            if(zeroes<=k){
                length=Math.max(length,r-l+1);
            }
            r++;
        }
        System.out.println(length);
    }
}
