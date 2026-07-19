package SlidingWindow_TwoPointer;

public class CountBinarySubarraySumK {
    // As there are zeroes we will miss some sub arrays while solving sum=target
    // Approach => (Sum<=Target) - (Sum<=(Target-1))
    public static int func(int[] a,int sum){
        int l=0;int r=0; int count=0; int s=0;
        while(r<a.length){
            s+=a[r];
            while(l<=r && s>sum){
                s-=a[l]; l++;
            }
            count+=(r-l+1);
            r++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] a={1,0,1,0,1}; int sum=2;
        System.out.println(func(a,sum)-func(a,sum-1));
    }
}
