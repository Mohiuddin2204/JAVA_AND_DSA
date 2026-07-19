package SlidingWindow_TwoPointer;

public class MaxPointsObtainedFromCards {
    public static void main(String[] args) {
        //Can pick up cards either from front or back , given K=4 (no of cards to pick)
        // TC : O(2K)
        int[] a={6,2,3,4,7,2,1,7,1}; int k=4;
        int ls=0; int rs=0; int maxs=0;
        for(int i=0;i<k;i++){
            ls+=a[i];
        }
        maxs=ls;
        int ri=a.length-1;
        for(int i=k-1;i>=0;i--){
            ls-=a[i];
            rs+=a[ri];
            ri--;
            maxs=Math.max(maxs,ls+rs);
        }
        System.out.println(maxs);
    }
}
