package Array;
//ARRAY WITH ONLY POSITIVES
public class LongestSubarrayWithSumK_Pos {
    public static void main(String[] args) {
        int[] a={1,2,3,1,1,1,1,3,3};
        int k=6;
        int l=0;int r=0;
        int length=0;int sum=a[0];
        int n=a.length;
        //MOVE R RIGHT, IF SUM>K THEN MOVE L POINTER right
        while(r<n){
            if(l<=r && sum>k){
                sum=sum-a[l];
                l++;
            }
            if(sum==k){
                length=Math.max(length,r-l+1);
            }
            r++;
            if(r<n){
                sum+=a[r];
            }
        }
        System.out.println("length = "+length);
    }
}
