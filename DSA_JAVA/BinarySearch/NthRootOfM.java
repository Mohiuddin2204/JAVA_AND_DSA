package BinarySearch;

public class NthRootOfM {
    // return floor value of square root of a number
    public static int sqrt(int n){
        int l=1; int h=n; int ans=1;
        while(l<=h){
            int m=(l+h)/2;
            if(m*m <=n){
                ans=m; l=m+1;
            }
            else{
                h=m-1;
            }
        }
        return ans; // can also return high
    }
    //return exact ans , if not possible=> return -1
    public static int nthroot(int n,int m){
        int l=1; int h=m;
        while(l<=h){
            int mid=(l+h)/2;
            if(f(mid,n,m)==1){
                return mid;
            }
            else if(f(mid,n,m)==0){
                l=mid+1;
            }
            else {h=mid-1;}
        }
        return -1;
    }
    public static int f(int mid,int n,int m){
        int ans=1;
        for(int i=1;i<=n;i++){
            ans=ans*mid;
            if(ans>m){return 2;} // higher
        }
        if(ans==m){return 1;} //exact
        return 0;  // lower
    }
    public static void main(String[] args) {
        System.out.println(sqrt(10));
        System.out.println(nthroot(3,27));
        System.out.println(nthroot(4,69));
    }
}
