package BinarySearch.WordProblems;

public class KokoEatingBananas {
    //return min integer k such that koko can eat all bananas within h hours
    // k = bananas/ per hour
    // [ 3 , 6 , 7 ,11 ]  , k= 4 ( 4 bananas per hour)
    // 1hr, 2hr , 2hr, 3hr => 8 hrs = h (done)
    public static int max(int[] a){
        int m=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>m){
                m=a[i];
            }
        }
        return m;
    }
    public static int time(int[] a,int m){
        int t=0;
        for(int i=0;i<a.length;i++){
            t+=(int)Math.ceil((double) a[i]/m);
        }
        return t;
    }
    public static void main(String[] args) {
        int[] p={3,6,7,11}; int hr=8; int ans=max(p);
        int l=1;int h=max(p);
        while(l<=h){
            int m=(l+h)/2;
            int t=time(p,m);
            if(t<=hr){
                h=m-1; ans=m;
            }
            else{
                l=m+1;
            }
        }
        System.out.println(ans); // can return l ( as answer ends up at l)
    }
}
