package BinarySearch.WordProblems;

public class SmallestDivisor {
    // array : 1 2 5 9 , t=9
    // smallest divisor d : ceil=> 1/d + 2/d + 5/d + 9/d <= t
    public static int max(int[] a){
        int m=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>m){
                m=a[i];
            }
        }
        return m;
    }
    public static int value(int[] a,int mid){
        int ans=0;
        for(int i:a){
            ans+=(int)Math.ceil((double) i/mid);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a={1,2,5,9}; int t=6; int ans=1;
        int l=1; int h=max(a);
        while(l<=h){
            int mid=(l+h)/2;
            if(value(a,mid)<=t){
                ans=mid; h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        System.out.println(ans);  // can return l
    }
}
