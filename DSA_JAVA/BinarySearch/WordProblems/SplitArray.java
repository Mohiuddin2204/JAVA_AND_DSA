package BinarySearch.WordProblems;
// BOOK ALLOCATION , PAINTERS PARTITION (OTHER NAMES OF PROBLEM)
// [ MIN(MAX) ]
public class SplitArray {
    // Array : 10 20 30 40 , k=2
    // split array into two consecutive =>  10 20 30  ,  40  => max is 60 which is minimum in all cases
    // k> a.length then return -1;
    // start from max to sum of all ( range for binary search )
    public static int sum(int[] a){
        int s=0;
        for(int i:a){
            s+=i;
        }
        return s;
    }
    public static int max(int[] a){
        int m=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>m){
                m=a[i];
            }
        }
        return m;
    }
    public static int parts(int[] a,int mid){
        int p=1;int s=0;
        for(int i=0;i<a.length;i++){
            if(s+a[i] <=mid){
                s+=a[i];
            }
            else{
                p++; s=a[i];
            }
        }
        return p;
    }
    public static void main(String[] args) {
        int[] a={10,20,30,40}; int k=2;
        int l=max(a); int h=sum(a); int ans=sum(a);
       // if(k>a.length){ return; }
        while(l<=h){
            int m=(l+h)/2;
            int p=parts(a,m);
            if(p>k){
                l=m+1;
            }
            else{
                h=m-1; ans=m;
            }
        }
        System.out.println(ans);  // can also return l
    }
}
